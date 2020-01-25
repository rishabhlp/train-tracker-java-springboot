package com.railways.indianrail.entity;

import java.util.List;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author rishabh
 *
 */
public class Train {

	@JsonProperty("name")
	private String name;
	@JsonProperty("number")
	private String number;
	@JsonProperty("days")
	@OneToMany
	private List<Day> days = null;
	@JsonProperty("classes")
	@OneToMany
	private List<Class> classes = null;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Train() {
	}

	public Train(String name, String number, List<Day> days, List<Class> classes) {
		super();
		this.name = name;
		this.number = number;
		this.days = days;
		this.classes = classes;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}

	@JsonProperty("days")
	public List<Day> getDays() {
		return days;
	}

	@JsonProperty("days")
	public void setDays(List<Day> days) {
		this.days = days;
	}

	@JsonProperty("classes")
	public List<Class> getClasses() {
		return classes;
	}

	@JsonProperty("classes")
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}

}