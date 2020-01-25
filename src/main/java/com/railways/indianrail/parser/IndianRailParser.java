package com.railways.indianrail.parser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.railways.indianrail.entity.StationStatus;
import com.railways.indianrail.entity.StationStatusResponse;
import com.railways.indianrail.entity.StationTrainsParsed;
import com.railways.indianrail.entity.TrainName;
import com.railways.indianrail.entity.TrainNameResponse;
import com.railways.indianrail.entity.TrainStatus;
import com.railways.indianrail.entity.TrainStatusResponse;

/**
 * 
 * @author rishabh
 *
 */
@Component
public class IndianRailParser {

	public TrainName trainNameParser(TrainNameResponse trainNameResponse) {
		TrainName name = new TrainName();
		name.setTrainName(trainNameResponse.getTrain().getName());
		name.setTrainNumber(Integer.valueOf(trainNameResponse.getTrain().getNumber()));
		return name;
	}
	
	public StationStatus stationStatusParser(StationStatusResponse stationStatusResponse) {
		StationStatus stationStatus=new StationStatus();
		stationStatus.setTotal(stationStatusResponse.getTotal());
		List<StationTrainsParsed> list=new ArrayList<>();
		for(int i=0;i<stationStatusResponse.getTotal();i++) {
			StationTrainsParsed stationTrainsParsed=new StationTrainsParsed();
			stationTrainsParsed.setActarr(stationStatusResponse.getTrains().get(i).getActarr());
			stationTrainsParsed.setActdep(stationStatusResponse.getTrains().get(i).getActdep());
			stationTrainsParsed.setDelayarr(stationStatusResponse.getTrains().get(i).getDelayarr());
			stationTrainsParsed.setDelaydep(stationStatusResponse.getTrains().get(i).getDelaydep());
			stationTrainsParsed.setName(stationStatusResponse.getTrains().get(i).getName());
			stationTrainsParsed.setNumber(stationStatusResponse.getTrains().get(i).getNumber());
			stationTrainsParsed.setScharr(stationStatusResponse.getTrains().get(i).getScharr());
			stationTrainsParsed.setSchdep(stationStatusResponse.getTrains().get(i).getSchdep());
			list.add(stationTrainsParsed);
		}
		stationStatus.setTrains(list);
		return stationStatus;
	}

	public TrainStatus trainStatusParser(TrainStatusResponse trainStatusResponse) {
		if (null == trainStatusResponse.getStartDate()) {
			TrainStatus trainStatus = new TrainStatus();
			trainStatus.setTrainNumber("405");
			return trainStatus;

		} else {
			TrainStatus trainStatus = new TrainStatus();
			trainStatus.setTrainNumber(
					null != trainStatusResponse.getTrain() ? trainStatusResponse.getTrain().getNumber() : "");
			trainStatus.setTrainName(
					null != trainStatusResponse.getTrain() ? trainStatusResponse.getTrain().getName() : "");
			trainStatus.setSchArrDate(null != trainStatusResponse.getStatus().getScharrDate()
					? trainStatusResponse.getStatus().getScharrDate()
					: "");
			trainStatus.setActArrDate(
					null != trainStatusResponse.getStatus() ? trainStatusResponse.getStatus().getActarrDate() : "");
			trainStatus.setStationCode(
					null != trainStatusResponse.getStation() ? trainStatusResponse.getStation().getCode() : "");
			trainStatus.setStationName(
					null != trainStatusResponse.getStation() ? trainStatusResponse.getStation().getName() : "");
			trainStatus.setSchArr(
					null != trainStatusResponse.getStatus() ? trainStatusResponse.getStatus().getScharr() : "");
			trainStatus.setSchdep(
					null != trainStatusResponse.getStatus() ? trainStatusResponse.getStatus().getSchdep() : "");
			if (false == trainStatusResponse.getStatus().getHasArrived()) {
				if ("Source".equalsIgnoreCase(trainStatusResponse.getStatus().getActarr())) {
					trainStatus.setHasArrived("Sorce");
					trainStatus.setActArr("Source");
				} else {
					trainStatus.setHasArrived("NO");
					trainStatus.setActArr("Not Arrived Till Now");
				}
			} else if (true == trainStatusResponse.getStatus().getHasArrived()) {
				trainStatus.setHasArrived("YES");
				trainStatus.setActArr(null != trainStatusResponse.getStatus().getActarr()
						? trainStatusResponse.getStatus().getActarr()
						: "");
			}
			if (false == trainStatusResponse.getStatus().getHasDeparted()) {
				if ("Destination".equalsIgnoreCase(trainStatusResponse.getStatus().getSchdep())) {
					trainStatus.setHasDeparted("Destination");
					trainStatus.setActDep("Destination");
				} else {
					trainStatus.setHasDeparted("NO");
					trainStatus.setActDep("Not Departed Till Now");
				}
			} else if (true == trainStatusResponse.getStatus().getHasDeparted()) {
				trainStatus.setHasDeparted("YES");
				trainStatus.setActDep(null != trainStatusResponse.getStatus().getActdep()
						? trainStatusResponse.getStatus().getActdep()
						: "");
			}
			trainStatus.setDelayedBy(
					null != trainStatusResponse.getStatus().getLatemin() ? trainStatusResponse.getStatus().getLatemin()
							: 0);
			trainStatus.setPosition(null != trainStatusResponse.getPosition() ? trainStatusResponse.getPosition() : "");
			return trainStatus;
		}
	}
}
