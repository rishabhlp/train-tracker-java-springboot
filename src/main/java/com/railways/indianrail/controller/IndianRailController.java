package com.railways.indianrail.controller;

import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.railways.indianrail.boilerplate.ApplicationConstants;
import com.railways.indianrail.entity.StationStatus;
import com.railways.indianrail.entity.TrainName;
import com.railways.indianrail.entity.TrainStatus;
import com.railways.indianrail.service.IndianRailServiceImpl;

/**
 * 
 * 
 * @author rishabh
 *
 */
@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class IndianRailController {

	@Autowired
	IndianRailServiceImpl indianRailServiceIF;

	@GetMapping(value = ApplicationConstants.TRAIN_STATUS_ENDPOINT)
	public ResponseEntity<TrainStatus> trainLiveStatus(@PathVariable("trainNumber") String trainNumber,
			@PathVariable("stationCode") String stationCode, @PathVariable("date") String date) {
		if (null != trainNumber && null != stationCode && null != date) {
			try {
				TrainStatus trainStatus = indianRailServiceIF.liveTrainStatus(trainNumber, stationCode, date);
				if (!trainStatus.getTrainNumber().equalsIgnoreCase("405")) {
					return new ResponseEntity<>(trainStatus, HttpStatus.OK);
				} else
					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			} catch (ServerException e) {
				TrainStatus status = new TrainStatus();
				status.setTrainNumber(ApplicationConstants.API_KEY_ERROR_MESSAGE);
				return new ResponseEntity<>(status, HttpStatus.SERVICE_UNAVAILABLE);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = ApplicationConstants.TRAIN_NAME_ENDPOINT)
	public ResponseEntity<TrainName> trainName(@PathVariable("trainNumber") String trainNumber) {
		if (null != trainNumber) {
			try {
				TrainName name = indianRailServiceIF.trainName(trainNumber);
				if (name.getTrainNumber() != 00000)
					return new ResponseEntity<>(name, HttpStatus.OK);
				else
					return new ResponseEntity<>(name, HttpStatus.BAD_REQUEST);
			} catch (ServerException e) {
				TrainName name = new TrainName();
				name.setTrainName(ApplicationConstants.API_KEY_ERROR_MESSAGE);
				return new ResponseEntity<>(name, HttpStatus.SERVICE_UNAVAILABLE);
			}
		}

		else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = ApplicationConstants.STATION_STATUS_ENDPOINT)
	public ResponseEntity<StationStatus> stationStatus(@PathVariable("stationCode") String stationCode) {
		if (null != stationCode) {
			try {
				StationStatus stationStatus = indianRailServiceIF.stationLiveStatus(stationCode);
				if (0 != stationStatus.getTotal())
					return new ResponseEntity<>(stationStatus, HttpStatus.OK);
				else
					return new ResponseEntity<>(stationStatus, HttpStatus.BAD_REQUEST);
			} catch (ServerException e) {
				StationStatus stationStatus = new StationStatus();
				stationStatus.setTotal(0);
				stationStatus.setMessage(ApplicationConstants.API_KEY_ERROR_MESSAGE);
				return new ResponseEntity<>(stationStatus, HttpStatus.SERVICE_UNAVAILABLE);
			}
		} else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

	@GetMapping(value = ApplicationConstants.CHANGE_API_KEY_ENDPOINT)
	public ResponseEntity<String> changeApiKey(@PathVariable("key") String apiKey) {
		boolean result = indianRailServiceIF.changeApiKey(apiKey);
		if (result)
			return new ResponseEntity<>("API Key Changed", HttpStatus.OK);
		else
			return new ResponseEntity<>("Check Entered Key", HttpStatus.NOT_ACCEPTABLE);
	}

}
