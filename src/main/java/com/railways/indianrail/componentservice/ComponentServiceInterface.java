package com.railways.indianrail.componentservice;

import com.railways.indianrail.entity.StationStatusResponse;
import com.railways.indianrail.entity.TrainNameResponse;
import com.railways.indianrail.entity.TrainStatusResponse;

public interface ComponentServiceInterface {

	public TrainStatusResponse liveTrainStatus(String urlForLiveTrain);

	public TrainNameResponse trainName(String urlForTrainName);

	public StationStatusResponse stationStatus(String urlForStationStatus);
}
