package com.railways.indianrail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value = ApplicationConstants.TRAIN_STATUS_ENDPOINT, method = RequestMethod.GET)
	public ResponseEntity<TrainStatus> trainLiveStatus(@PathVariable("trainNumber") String trainNumber,
			@PathVariable("stationCode") String stationCode, @PathVariable("date") String date) {
		if (null != trainNumber && null != stationCode && null != date) {
			TrainStatus trainStatus = indianRailServiceIF.liveTrainStatus(trainNumber, stationCode, date);
			if (!trainStatus.getTrainNumber().equalsIgnoreCase("405")) {
				ResponseEntity<TrainStatus> responseEntity = new ResponseEntity<TrainStatus>(trainStatus,
						HttpStatus.OK);
				return responseEntity;
			} else
				return new ResponseEntity<TrainStatus>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<TrainStatus>(HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = ApplicationConstants.TRAIN_NAME_ENDPOINT, method = RequestMethod.GET)
	public ResponseEntity<TrainName> trainName(@PathVariable("trainNumber") String trainNumber) {
		if (null != trainNumber) {
			TrainName name = indianRailServiceIF.trainName(trainNumber);
			if (name.getTrainNumber() != 00000)
				return new ResponseEntity<TrainName>(name, HttpStatus.OK);
			else
				return new ResponseEntity<TrainName>(name, HttpStatus.BAD_REQUEST);
		}

		else {
			return new ResponseEntity<TrainName>(HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = ApplicationConstants.STATION_STATUS_ENDPOINT, method = RequestMethod.GET)
	public ResponseEntity<StationStatus> stationStatus(@PathVariable("stationCode") String stationCode) {
	if (null != stationCode) {
			StationStatus stationStatus=indianRailServiceIF.stationLiveStatus(stationCode);
			if(0!=stationStatus.getTotal())
				return new ResponseEntity<StationStatus>(stationStatus, HttpStatus.OK);
			else
				return new ResponseEntity<StationStatus>(stationStatus, HttpStatus.BAD_REQUEST);
		} else
			return new ResponseEntity<StationStatus>(HttpStatus.BAD_REQUEST);

	}

}
