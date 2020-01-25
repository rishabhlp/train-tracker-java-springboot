package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @author rishabh
 *
 */
public class StationTrains {

	@JsonProperty("schdep")
	private String schdep;
	@JsonProperty("delayarr")
	private String delayarr;
	@JsonProperty("scharr")
	private String scharr;
	@JsonProperty("number")
	private String number;
	@JsonProperty("actarr")
	private String actarr;
	@JsonProperty("delaydep")
	private String delaydep;
	@JsonProperty("name")
	private String name;
	@JsonProperty("actdep")
	private String actdep;

	public StationTrains() {
	}

	public StationTrains(String schdep, String delayarr, String scharr, String number, String actarr, String delaydep,
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

	@JsonProperty("schdep")
	public String getSchdep() {
		return schdep;
	}

	@JsonProperty("schdep")
	public void setSchdep(String schdep) {
		this.schdep = schdep;
	}

	@JsonProperty("delayarr")
	public String getDelayarr() {
		return delayarr;
	}

	@JsonProperty("delayarr")
	public void setDelayarr(String delayarr) {
		this.delayarr = delayarr;
	}

	@JsonProperty("scharr")
	public String getScharr() {
		return scharr;
	}

	@JsonProperty("scharr")
	public void setScharr(String scharr) {
		this.scharr = scharr;
	}

	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}

	@JsonProperty("actarr")
	public String getActarr() {
		return actarr;
	}

	@JsonProperty("actarr")
	public void setActarr(String actarr) {
		this.actarr = actarr;
	}

	@JsonProperty("delaydep")
	public String getDelaydep() {
		return delaydep;
	}

	@JsonProperty("delaydep")
	public void setDelaydep(String delaydep) {
		this.delaydep = delaydep;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("actdep")
	public String getActdep() {
		return actdep;
	}

	@JsonProperty("actdep")
	public void setActdep(String actdep) {
		this.actdep = actdep;
	}

}