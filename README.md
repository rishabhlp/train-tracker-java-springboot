# Traintracker

Spring boot project to retrieve the live running status of train and to know the live status of a station.
This project uses RailwayAPI - https://railwayapi.com.

Technologies Used:
Java 8
Spring Boot
Hibernate
Maven
REST Api

Installation:
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies.

Running the project:
Run the project through the IDE and hit the available endpoints through Postman or browser. Host is http://localhost:9000

Endpoint available:
1.Train status - Endpoint to get live data of train: /trainstatus/{trainNumber}/{stationCode}/{date},
    Parameters: trainNumber- String,
                 stationCode - String,
                 date - String of format DD-MM-YYYY,
     eg: http://localhost:9000/trainstatus/12814/HWH/22-01-2020
  
2.Train name - Endpoint to get train name by providing train number: /trainname/{trainNumber},
    Parameters: trainNumber- String,
    eg: http://localhost:9000/trainname/12021
 
3.Station Live Status -  Endpoint to get live status of trains departing and arriving at the given station within next 4 hours : /stationstatus/{stationCode},
      
       Parameters: stationCode - String,
       eg: http://localhost:9000/stationstatus/TATA
       
       
Please use a new API key while using. You can get a free api key at https://railwayapi.com/register.
                          








