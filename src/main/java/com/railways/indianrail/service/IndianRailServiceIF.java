package com.railways.indianrail.service;

import java.rmi.ServerException;

import com.railways.indianrail.entity.StationStatus;
import com.railways.indianrail.entity.TrainName;
import com.railways.indianrail.entity.TrainStatus;

public interface IndianRailServiceIF {

	public TrainStatus liveTrainStatus(String trainNumber, String stationCode, String date) throws ServerException;

	public TrainName trainName(String trainNumber) throws ServerException;

	public StationStatus stationLiveStatus(String stationCode) throws ServerException;

	public boolean changeApiKey(String apiKey);

}
