package com.railways.indianrail.componentservice;

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
public class ComponentServiceImpl implements ComponentServiceInterface {

	RestTemplate restTemplate = new RestTemplate();

	public TrainStatusResponse liveTrainStatus(String urlForLiveTrain) {
		return restTemplate.getForObject(urlForLiveTrain, TrainStatusResponse.class);
	}

	public TrainNameResponse trainName(String urlForTrainName) {
		return restTemplate.getForObject(urlForTrainName, TrainNameResponse.class);
	}

	public StationStatusResponse stationStatus(String urlForStationStatus) {
		return restTemplate.getForObject(urlForStationStatus, StationStatusResponse.class);
	}
}
