package com.railways.indianrail.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @author rishabh
 *
 */
@Entity
public class TrainName {
	
	@Id
	@JsonProperty("Train Number")
	private int trainNumber;

	@JsonProperty("Train Name")
	private String name;

	public TrainName() {

	}

	public TrainName(int trainNumber, String name) {
		this.trainNumber = trainNumber;
		this.name = name;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return name;
	}

	public void setTrainName(String name) {
		this.name = name;
	}

}
