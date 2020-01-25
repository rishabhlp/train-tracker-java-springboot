package com.railways.indianrail.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 * 
 * @author rishabh
 *
 */
public class Class {

@JsonProperty("name")
private String name;
@JsonProperty("code")
private String code;
@JsonProperty("available")
private String available;



public Class() {
}


public Class(String name, String code, String available) {
super();
this.name = name;
this.code = code;
this.available = available;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("code")
public String getCode() {
return code;
}

@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

@JsonProperty("available")
public String getAvailable() {
return available;
}

@JsonProperty("available")
public void setAvailable(String available) {
this.available = available;
}

}