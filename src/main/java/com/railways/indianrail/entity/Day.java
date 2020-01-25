package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author rishabh
 *
 */
public class Day {

	@JsonProperty("runs")
	private String runs;
	@JsonProperty("code")
	private String code;

	public Day() {
	}

	public Day(String runs, String code) {
		super();
		this.runs = runs;
		this.code = code;
	}

	@JsonProperty("runs")
	public String getRuns() {
		return runs;
	}

	@JsonProperty("runs")
	public void setRuns(String runs) {
		this.runs = runs;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

}