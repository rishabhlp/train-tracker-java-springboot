package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @author rishabh
 *
 */
public class TrainNameResponse {

	@JsonProperty("response_code")
	private Integer responseCode;
	@JsonProperty("debit")
	private Integer debit;
	@JsonProperty("train")
	private Train train;

	public TrainNameResponse() {

	}

	public TrainNameResponse(Integer responseCode, Integer debit, Train train) {
		this.responseCode = responseCode;
		this.debit = debit;
		this.train = train;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public Integer getDebit() {
		return debit;
	}

	public void setDebit(Integer debit) {
		this.debit = debit;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

}
