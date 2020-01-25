package com.railways.indianrail.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author rishabh
 *
 */
public class StationStatusResponse {

	@JsonProperty("total")
	private Integer total;
	@JsonProperty("debit")
	private Integer debit;
	@JsonProperty("trains")
	private List<StationTrains> trains = null;
	@JsonProperty("response_code")
	private Integer responseCode;

	public StationStatusResponse() {
	}

	public StationStatusResponse(Integer total, Integer debit, List<StationTrains> trains, Integer responseCode) {
		super();
		this.total = total;
		this.debit = debit;
		this.trains = trains;
		this.responseCode = responseCode;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("debit")
	public Integer getDebit() {
		return debit;
	}

	@JsonProperty("debit")
	public void setDebit(Integer debit) {
		this.debit = debit;
	}

	@JsonProperty("trains")
	public List<StationTrains> getTrains() {
		return trains;
	}

	@JsonProperty("trains")
	public void setTrains(List<StationTrains> trains) {
		this.trains = trains;
	}

	@JsonProperty("response_code")
	public Integer getResponseCode() {
		return responseCode;
	}

	@JsonProperty("response_code")
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

}