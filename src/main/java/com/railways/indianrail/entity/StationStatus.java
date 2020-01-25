package com.railways.indianrail.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author rishabh
 *
 */
public class StationStatus {

	@JsonProperty("Total No. of Trains")
	private Integer total;

	@JsonProperty("List of trains")
	private List<StationTrainsParsed> trains = null;

	public StationStatus() {
	}

	public StationStatus(Integer total, List<StationTrainsParsed> trains) {
		super();
		this.total = total;
		this.trains = trains;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<StationTrainsParsed> getTrains() {
		return trains;
	}

	public void setTrains(List<StationTrainsParsed> trains) {
		this.trains = trains;
	}

}