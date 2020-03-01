package com.railways.indianrail.boilerplate;

/**
 * 
 * @author rishabh
 *
 */
public class ApplicationConstants {

	public static String API_KEY = "slj1ssm53f";
	public static final String SLASH = "/";
	public static final String API_HOST = "https://api.railwayapi.com/v2/live/train/";
	public static final String API_KEY_HOST = "/apikey/";
	public static final String API_HOST_FOR_NAME = "https://api.railwayapi.com/v2/name-number/train/";
	public static final String API_HOST_FOR_STATION_STATUS = "https://api.railwayapi.com/v2/arrivals/station/";
	public static final String API_ENDPOINT_FOR_STATION_STATUS = "/hours/4/apikey/";
	public static final String TRAIN_STATUS_ENDPOINT = "/trainstatus/{trainNumber}/{stationCode}/{date}";
	public static final String TRAIN_NAME_ENDPOINT = "/trainname/{trainNumber}";
	public static final String STATION_STATUS_ENDPOINT = "/stationstatus/{stationCode}";
	public static final String CHANGE_API_KEY_ENDPOINT = "/apikey/{key}";

}
