package com.railways.indianrail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railways.indianrail.boilerplate.ApplicationConstants;
import com.railways.indianrail.componentService.ComponentServiceInterface;
import com.railways.indianrail.entity.StationStatus;
import com.railways.indianrail.entity.StationStatusResponse;
import com.railways.indianrail.entity.StationTrainsParsed;
import com.railways.indianrail.entity.TrainName;
import com.railways.indianrail.entity.TrainNameResponse;
import com.railways.indianrail.entity.TrainStatus;
import com.railways.indianrail.entity.TrainStatusResponse;
import com.railways.indianrail.parser.IndianRailParser;
import com.railways.indianrail.repository.TrainNameRepository;

/**
 * 
 * @author rishabh
 *
 */
@Service
public class IndianRailService {

	@Autowired
	ComponentServiceInterface componentServiceExchange;

	@Autowired
	TrainNameRepository trainNameRepository;

	@Autowired
	IndianRailParser indianRailParser;

	public TrainStatus liveTrainStatus(String trainNumber, String stationCode, String date) {
		StringBuilder urlForLiveStatus = new StringBuilder();
		urlForLiveStatus.append(ApplicationConstants.API_HOST).append(trainNumber).append(ApplicationConstants.SLASH);
		urlForLiveStatus.append("station/").append(stationCode).append(ApplicationConstants.SLASH);
		urlForLiveStatus.append("date/").append(date).append(ApplicationConstants.API_KEY);
		TrainStatusResponse trainStatus = componentServiceExchange.liveTrainStatus(urlForLiveStatus.toString());
		TrainStatus status = indianRailParser.trainStatusParser(trainStatus);
		return status;
	}

	public TrainName trainName(String trainNumber) {
		if(true==trainNameRepository.existsById(Integer.valueOf(trainNumber))) {
			return trainNameRepository.getOne(Integer.valueOf(trainNumber));
		} else {
			StringBuilder urlForTrainName = new StringBuilder();
			urlForTrainName.append(ApplicationConstants.API_HOST_FOR_NAME).append(trainNumber)
					.append(ApplicationConstants.API_KEY);
			TrainNameResponse nameResponse = componentServiceExchange.trainName(urlForTrainName.toString());
			if (nameResponse.getResponseCode() == 200) {
				trainNameRepository.save(indianRailParser.trainNameParser(nameResponse));
				return indianRailParser.trainNameParser(nameResponse);
			} else
				return new TrainName(00000, "INVALID TRAIN NAME");

		}
	}
	
	public StationStatus stationLiveStatus(String stationCode) {
		StringBuilder urlForStationStatus=new StringBuilder();
		urlForStationStatus.append(ApplicationConstants.API_HOST_FOR_STATION_STATUS).append(stationCode).append(ApplicationConstants.API_ENDPOINT_FOR_STATION_STATUS);
		StationStatusResponse stationStatusResponse=componentServiceExchange.stationStatus(urlForStationStatus.toString());
		if((200==stationStatusResponse.getResponseCode())&&(0!=stationStatusResponse.getTotal())) {
			StationStatus stationStatus=indianRailParser.stationStatusParser(stationStatusResponse);
			return stationStatus;
		}
		else {
			List<StationTrainsParsed> list=new ArrayList<>();
			return new StationStatus(0, list);
		}
	}

}
