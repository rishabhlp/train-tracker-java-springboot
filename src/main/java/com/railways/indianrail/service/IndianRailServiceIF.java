package com.railways.indianrail.service;

import com.railways.indianrail.entity.StationStatus;
import com.railways.indianrail.entity.TrainName;
import com.railways.indianrail.entity.TrainStatus;

public interface IndianRailServiceIF {

	public TrainStatus liveTrainStatus(String trainNumber, String stationCode, String date);

	public TrainName trainName(String trainNumber);

	public StationStatus stationLiveStatus(String stationCode);

	public boolean changeApiKey(String apiKey);

}
