package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 * 
 * @author rishabh
 *
 */
public class Status {

	@JsonProperty("scharr_date")
	private String scharrDate;
	@JsonProperty("actdep")
	private String actdep;
	@JsonProperty("scharr")
	private String scharr;
	@JsonProperty("actarr_date")
	private String actarrDate;
	@JsonProperty("has_arrived")
	private Boolean hasArrived;
	@JsonProperty("actarr")
	private String actarr;
	@JsonProperty("latemin")
	private Integer latemin;
	@JsonProperty("schdep")
	private String schdep;
	@JsonProperty("has_departed")
	private Boolean hasDeparted;

	public Status() {
	}

	public Status(String scharrDate, String actdep, String scharr, String actarrDate, Boolean hasArrived, String actarr,
			Integer latemin, String schdep, Boolean hasDeparted) {
		super();
		this.scharrDate = scharrDate;
		this.actdep = actdep;
		this.scharr = scharr;
		this.actarrDate = actarrDate;
		this.hasArrived = hasArrived;
		this.actarr = actarr;
		this.latemin = latemin;
		this.schdep = schdep;
		this.hasDeparted = hasDeparted;
	}

	@JsonProperty("scharr_date")
	public String getScharrDate() {
		return scharrDate;
	}

	@JsonProperty("scharr_date")
	public void setScharrDate(String scharrDate) {
		this.scharrDate = scharrDate;
	}

	@JsonProperty("actdep")
	public String getActdep() {
		return actdep;
	}

	@JsonProperty("actdep")
	public void setActdep(String actdep) {
		this.actdep = actdep;
	}

	@JsonProperty("scharr")
	public String getScharr() {
		return scharr;
	}

	@JsonProperty("scharr")
	public void setScharr(String scharr) {
		this.scharr = scharr;
	}

	@JsonProperty("actarr_date")
	public String getActarrDate() {
		return actarrDate;
	}

	@JsonProperty("actarr_date")
	public void setActarrDate(String actarrDate) {
		this.actarrDate = actarrDate;
	}

	@JsonProperty("has_arrived")
	public Boolean getHasArrived() {
		return hasArrived;
	}

	@JsonProperty("has_arrived")
	public void setHasArrived(Boolean hasArrived) {
		this.hasArrived = hasArrived;
	}

	@JsonProperty("actarr")
	public String getActarr() {
		return actarr;
	}

	@JsonProperty("actarr")
	public void setActarr(String actarr) {
		this.actarr = actarr;
	}

	@JsonProperty("latemin")
	public Integer getLatemin() {
		return latemin;
	}

	@JsonProperty("latemin")
	public void setLatemin(Integer latemin) {
		this.latemin = latemin;
	}

	@JsonProperty("schdep")
	public String getSchdep() {
		return schdep;
	}

	@JsonProperty("schdep")
	public void setSchdep(String schdep) {
		this.schdep = schdep;
	}

	@JsonProperty("has_departed")
	public Boolean getHasDeparted() {
		return hasDeparted;
	}

	@JsonProperty("has_departed")
	public void setHasDeparted(Boolean hasDeparted) {
		this.hasDeparted = hasDeparted;
	}

}