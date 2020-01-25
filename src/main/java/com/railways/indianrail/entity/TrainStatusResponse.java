package com.railways.indianrail.entity;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @author rishabh
 *
 */
public class TrainStatusResponse {

	@JsonProperty("status")
	private Status status;
	@JsonProperty("response_code")
	private Integer responseCode;
	@JsonProperty("position")
	private String position;
	@JsonProperty("debit")
	private Integer debit;
	@JsonProperty("station")
	private Station station;
	@JsonProperty("start_date")
	private String startDate;
	@JsonProperty("train")
	private Train train;

	public TrainStatusResponse() {
	}

	public TrainStatusResponse(Status status, Integer responseCode, String position, Integer debit, Station station,
			String startDate, Train train) {
		super();
		this.status = status;
		this.responseCode = responseCode;
		this.position = position;
		this.debit = debit;
		this.station = station;
		this.startDate = startDate;
		this.train = train;
	}

	@JsonProperty("status")
	public Status getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Status status) {
		this.status = status;
	}

	@JsonProperty("response_code")
	@Id
	public Integer getResponseCode() {
		return responseCode;
	}

	@JsonProperty("response_code")
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	@JsonProperty("position")
	public String getPosition() {
		return position;
	}

	@JsonProperty("position")
	public void setPosition(String position) {
		this.position = position;
	}

	@JsonProperty("debit")
	public Integer getDebit() {
		return debit;
	}

	@JsonProperty("debit")
	public void setDebit(Integer debit) {
		this.debit = debit;
	}

	@JsonProperty("station")
	public Station getStation() {
		return station;
	}

	@JsonProperty("station")
	public void setStation(Station station) {
		this.station = station;
	}

	@JsonProperty("start_date")
	public String getStartDate() {
		return startDate;
	}

	@JsonProperty("start_date")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("train")
	public Train getTrain() {
		return train;
	}

	@JsonProperty("train")
	public void setTrain(Train train) {
		this.train = train;
	}

}