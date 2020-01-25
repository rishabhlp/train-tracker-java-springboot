package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @author rishabh
 *
 */
public class TrainStatus {

	@JsonProperty("Train Number")
	private String trainNumber;

	@JsonProperty("Train Name")
	private String trainName;

	@JsonProperty("Queried Station Name")
	private String stationName;

	@JsonProperty("Queried Station Code")
	private String stationCode;

	@JsonProperty("Scheduled Arrival Date")
	private String schArrDate;

	@JsonProperty("Actual Arrival Date")
	private String actArrDate;

	@JsonProperty("Scheduled Arrival Time")
	private String schArr;

	@JsonProperty("Train has Arrived")
	private String hasArrived;

	@JsonProperty("Actual Arrival Time")
	private String actArr;

	@JsonProperty("Scheduled Departure Time")
	private String schdep;

	@JsonProperty("Train has Departed")
	private String hasDeparted;

	@JsonProperty("Actual Departure Time")
	private String actDep;

	@JsonProperty("Delay in Minutes")
	private int delayedBy;

	@JsonProperty("Current Position")
	private String position;

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getSchArrDate() {
		return schArrDate;
	}

	public void setSchArrDate(String schArrDate) {
		this.schArrDate = schArrDate;
	}

	public String getActArrDate() {
		return actArrDate;
	}

	public void setActArrDate(String actArrDate) {
		this.actArrDate = actArrDate;
	}

	public String getSchArr() {
		return schArr;
	}

	public void setSchArr(String schArr) {
		this.schArr = schArr;
	}

	public String getHasArrived() {
		return hasArrived;
	}

	public void setHasArrived(String hasArrived) {
		this.hasArrived = hasArrived;
	}

	public String getActArr() {
		return actArr;
	}

	public void setActArr(String actArr) {
		this.actArr = actArr;
	}

	public String getSchdep() {
		return schdep;
	}

	public void setSchdep(String schdep) {
		this.schdep = schdep;
	}

	public String getHasDeparted() {
		return hasDeparted;
	}

	public void setHasDeparted(String hasDeparted) {
		this.hasDeparted = hasDeparted;
	}

	public String getActDep() {
		return actDep;
	}

	public void setActDep(String actDep) {
		this.actDep = actDep;
	}

	public int getDelayedBy() {
		return delayedBy;
	}

	public void setDelayedBy(int delayedBy) {
		this.delayedBy = delayedBy;
	}

	public TrainStatus(String trainNumber, String trainName, String stationName, String stationCode, String schArrDate,
			String actArrDate, String schArr, String hasArrived, String actArr, String schdep, String hasDeparted,
			String actDep, int delayedBy, String position) {
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.stationName = stationName;
		this.stationCode = stationCode;
		this.schArrDate = schArrDate;
		this.actArrDate = actArrDate;
		this.schArr = schArr;
		this.hasArrived = hasArrived;
		this.actArr = actArr;
		this.schdep = schdep;
		this.hasDeparted = hasDeparted;
		this.actDep = actDep;
		this.delayedBy = delayedBy;
		this.position = position;
	}

	public TrainStatus() {

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
