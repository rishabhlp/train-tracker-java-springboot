package com.railways.indianrail.componentService;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.railways.indianrail.entity.StationStatusResponse;
import com.railways.indianrail.entity.TrainNameResponse;
import com.railways.indianrail.entity.TrainStatusResponse;

/**
 * 
 * @author rishabh
 *
 */
@Component
public class ComponentServiceExchange {

	RestTemplate restTemplate=new RestTemplate();
	
	public TrainStatusResponse liveTrainStatus(String urlForLiveTrain) {
		TrainStatusResponse trainStatus=restTemplate.getForObject(urlForLiveTrain, TrainStatusResponse.class);
		return trainStatus;
	}
	
	public TrainNameResponse trainName(String urlForTrainName) {
		TrainNameResponse trainNameResponse=restTemplate.getForObject(urlForTrainName, TrainNameResponse.class);
		return trainNameResponse;
	}
	
	public StationStatusResponse  stationStatus(String urlForStationStatus) {
		StationStatusResponse stationStatusResponse=restTemplate.getForObject(urlForStationStatus, StationStatusResponse.class);
		return stationStatusResponse;
	}
}
