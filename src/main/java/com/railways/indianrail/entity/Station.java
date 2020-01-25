package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @author rishabh
 *
 */
public class Station {

	@JsonProperty("name")
	private String name;
	@JsonProperty("lng")
	private Double lng;
	@JsonProperty("code")
	private String code;
	@JsonProperty("lat")
	private Double lat;

	public Station() {
	}

	public Station(String name, Double lng, String code, Double lat) {
		super();
		this.name = name;
		this.lng = lng;
		this.code = code;
		this.lat = lat;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("lng")
	public Double getLng() {
		return lng;
	}

	@JsonProperty("lng")
	public void setLng(Double lng) {
		this.lng = lng;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("lat")
	public Double getLat() {
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}

}