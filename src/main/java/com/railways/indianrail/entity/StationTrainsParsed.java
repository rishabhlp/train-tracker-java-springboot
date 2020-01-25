package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @author rishabh
 *
 */
public class StationTrainsParsed {

	@JsonProperty("Train Number")
	private String number;
	@JsonProperty("Train Name")
	private String name;
	@JsonProperty("Scheduled Arrival")
	private String scharr;
	@JsonProperty("Actual Arrival")
	private String actarr;
	@JsonProperty("Delay in Arrival")
	private String delayarr;
	@JsonProperty("Schedule Departure")
	private String schdep;
	@JsonProperty("Actual Departure")
	private String actdep;
	@JsonProperty("Delay in Departure")
	private String delaydep;

	public StationTrainsParsed() {
	}

	public StationTrainsParsed(String schdep, String delayarr, String scharr, String number, String actarr, String delaydep,
			String name, String actdep) {
		super();
		this.schdep = schdep;
		this.delayarr = delayarr;
		this.scharr = scharr;
		this.number = number;
		this.actarr = actarr;
		this.delaydep = delaydep;
		this.name = name;
		this.actdep = actdep;
	}

	public String getSchdep() {
		return schdep;
	}

	public void setSchdep(String schdep) {
		this.schdep = schdep;
	}

	public String getDelayarr() {
		return delayarr;
	}

	public void setDelayarr(String delayarr) {
		this.delayarr = delayarr;
	}

	public String getScharr() {
		return scharr;
	}

	public void setScharr(String scharr) {
		this.scharr = scharr;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getActarr() {
		return actarr;
	}

	public void setActarr(String actarr) {
		this.actarr = actarr;
	}

	public String getDelaydep() {
		return delaydep;
	}

	public void setDelaydep(String delaydep) {
		this.delaydep = delaydep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActdep() {
		return actdep;
	}

	public void setActdep(String actdep) {
		this.actdep = actdep;
	}

}
