package com.ff.fantasyfootball;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"GameKey",
"SeasonType",
"Season",
"Week",
"Date",
"AwayTeam",
"HomeTeam",
"Channel",
"PointSpread",
"OverUnder",
"StadiumID",
"Canceled",
"GeoLat",
"GeoLong",
"ForecastTempLow",
"ForecastTempHigh",
"ForecastDescription",
"ForecastWindChill",
"ForecastWindSpeed",
"AwayTeamMoneyLine",
"HomeTeamMoneyLine",
"Day",
"DateTime",
"GlobalGameID",
"GlobalAwayTeamID",
"GlobalHomeTeamID",
"ScoreID",
"Status",
"StadiumDetails"
})
public class Schedule {

@JsonProperty("GameKey")
private String gameKey;
@JsonProperty("SeasonType")
private Integer seasonType;
@JsonProperty("Season")
private Integer season;
@JsonProperty("Week")
private Integer week;
@JsonProperty("Date")
private String date;
@JsonProperty("AwayTeam")
private String awayTeam;
@JsonProperty("HomeTeam")
private String homeTeam;
@JsonProperty("Channel")
private String channel;
@JsonProperty("PointSpread")
private Double pointSpread;
@JsonProperty("OverUnder")
private Double overUnder;
@JsonProperty("StadiumID")
private Integer stadiumID;
@JsonProperty("Canceled")
private Boolean canceled;
@JsonProperty("GeoLat")
private Object geoLat;
@JsonProperty("GeoLong")
private Object geoLong;
@JsonProperty("ForecastTempLow")
private Object forecastTempLow;
@JsonProperty("ForecastTempHigh")
private Object forecastTempHigh;
@JsonProperty("ForecastDescription")
private Object forecastDescription;
@JsonProperty("ForecastWindChill")
private Object forecastWindChill;
@JsonProperty("ForecastWindSpeed")
private Object forecastWindSpeed;
@JsonProperty("AwayTeamMoneyLine")
private Integer awayTeamMoneyLine;
@JsonProperty("HomeTeamMoneyLine")
private Integer homeTeamMoneyLine;
@JsonProperty("Day")
private String day;
@JsonProperty("DateTime")
private String dateTime;
@JsonProperty("GlobalGameID")
private Integer globalGameID;
@JsonProperty("GlobalAwayTeamID")
private Integer globalAwayTeamID;
@JsonProperty("GlobalHomeTeamID")
private Integer globalHomeTeamID;
@JsonProperty("ScoreID")
private Integer scoreID;
@JsonProperty("Status")
private String status;
@JsonProperty("StadiumDetails")
private StadiumDetails stadiumDetails;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("GameKey")
public String getGameKey() {
return gameKey;
}

@JsonProperty("GameKey")
public void setGameKey(String gameKey) {
this.gameKey = gameKey;
}

@JsonProperty("SeasonType")
public Integer getSeasonType() {
return seasonType;
}

@JsonProperty("SeasonType")
public void setSeasonType(Integer seasonType) {
this.seasonType = seasonType;
}

@JsonProperty("Season")
public Integer getSeason() {
return season;
}

@JsonProperty("Season")
public void setSeason(Integer season) {
this.season = season;
}

@JsonProperty("Week")
public Integer getWeek() {
return week;
}

@JsonProperty("Week")
public void setWeek(Integer week) {
this.week = week;
}

@JsonProperty("Date")
public String getDate() {
return date;
}

@JsonProperty("Date")
public void setDate(String date) {
this.date = date;
}

@JsonProperty("AwayTeam")
public String getAwayTeam() {
return awayTeam;
}

@JsonProperty("AwayTeam")
public void setAwayTeam(String awayTeam) {
this.awayTeam = awayTeam;
}

@JsonProperty("HomeTeam")
public String getHomeTeam() {
return homeTeam;
}

@JsonProperty("HomeTeam")
public void setHomeTeam(String homeTeam) {
this.homeTeam = homeTeam;
}

@JsonProperty("Channel")
public String getChannel() {
return channel;
}

@JsonProperty("Channel")
public void setChannel(String channel) {
this.channel = channel;
}

@JsonProperty("PointSpread")
public Double getPointSpread() {
return pointSpread;
}

@JsonProperty("PointSpread")
public void setPointSpread(Double pointSpread) {
this.pointSpread = pointSpread;
}

@JsonProperty("OverUnder")
public Double getOverUnder() {
return overUnder;
}

@JsonProperty("OverUnder")
public void setOverUnder(Double overUnder) {
this.overUnder = overUnder;
}

@JsonProperty("StadiumID")
public Integer getStadiumID() {
return stadiumID;
}

@JsonProperty("StadiumID")
public void setStadiumID(Integer stadiumID) {
this.stadiumID = stadiumID;
}

@JsonProperty("Canceled")
public Boolean getCanceled() {
return canceled;
}

@JsonProperty("Canceled")
public void setCanceled(Boolean canceled) {
this.canceled = canceled;
}

@JsonProperty("GeoLat")
public Object getGeoLat() {
return geoLat;
}

@JsonProperty("GeoLat")
public void setGeoLat(Object geoLat) {
this.geoLat = geoLat;
}

@JsonProperty("GeoLong")
public Object getGeoLong() {
return geoLong;
}

@JsonProperty("GeoLong")
public void setGeoLong(Object geoLong) {
this.geoLong = geoLong;
}

@JsonProperty("ForecastTempLow")
public Object getForecastTempLow() {
return forecastTempLow;
}

@JsonProperty("ForecastTempLow")
public void setForecastTempLow(Object forecastTempLow) {
this.forecastTempLow = forecastTempLow;
}

@JsonProperty("ForecastTempHigh")
public Object getForecastTempHigh() {
return forecastTempHigh;
}

@JsonProperty("ForecastTempHigh")
public void setForecastTempHigh(Object forecastTempHigh) {
this.forecastTempHigh = forecastTempHigh;
}

@JsonProperty("ForecastDescription")
public Object getForecastDescription() {
return forecastDescription;
}

@JsonProperty("ForecastDescription")
public void setForecastDescription(Object forecastDescription) {
this.forecastDescription = forecastDescription;
}

@JsonProperty("ForecastWindChill")
public Object getForecastWindChill() {
return forecastWindChill;
}

@JsonProperty("ForecastWindChill")
public void setForecastWindChill(Object forecastWindChill) {
this.forecastWindChill = forecastWindChill;
}

@JsonProperty("ForecastWindSpeed")
public Object getForecastWindSpeed() {
return forecastWindSpeed;
}

@JsonProperty("ForecastWindSpeed")
public void setForecastWindSpeed(Object forecastWindSpeed) {
this.forecastWindSpeed = forecastWindSpeed;
}

@JsonProperty("AwayTeamMoneyLine")
public Integer getAwayTeamMoneyLine() {
return awayTeamMoneyLine;
}

@JsonProperty("AwayTeamMoneyLine")
public void setAwayTeamMoneyLine(Integer awayTeamMoneyLine) {
this.awayTeamMoneyLine = awayTeamMoneyLine;
}

@JsonProperty("HomeTeamMoneyLine")
public Integer getHomeTeamMoneyLine() {
return homeTeamMoneyLine;
}

@JsonProperty("HomeTeamMoneyLine")
public void setHomeTeamMoneyLine(Integer homeTeamMoneyLine) {
this.homeTeamMoneyLine = homeTeamMoneyLine;
}

@JsonProperty("Day")
public String getDay() {
return day;
}

@JsonProperty("Day")
public void setDay(String day) {
this.day = day;
}

@JsonProperty("DateTime")
public String getDateTime() {
return dateTime;
}

@JsonProperty("DateTime")
public void setDateTime(String dateTime) {
this.dateTime = dateTime;
}

@JsonProperty("GlobalGameID")
public Integer getGlobalGameID() {
return globalGameID;
}

@JsonProperty("GlobalGameID")
public void setGlobalGameID(Integer globalGameID) {
this.globalGameID = globalGameID;
}

@JsonProperty("GlobalAwayTeamID")
public Integer getGlobalAwayTeamID() {
return globalAwayTeamID;
}

@JsonProperty("GlobalAwayTeamID")
public void setGlobalAwayTeamID(Integer globalAwayTeamID) {
this.globalAwayTeamID = globalAwayTeamID;
}

@JsonProperty("GlobalHomeTeamID")
public Integer getGlobalHomeTeamID() {
return globalHomeTeamID;
}

@JsonProperty("GlobalHomeTeamID")
public void setGlobalHomeTeamID(Integer globalHomeTeamID) {
this.globalHomeTeamID = globalHomeTeamID;
}

@JsonProperty("ScoreID")
public Integer getScoreID() {
return scoreID;
}

@JsonProperty("ScoreID")
public void setScoreID(Integer scoreID) {
this.scoreID = scoreID;
}

@JsonProperty("Status")
public String getStatus() {
return status;
}

@JsonProperty("Status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("StadiumDetails")
public StadiumDetails getStadiumDetails() {
return stadiumDetails;
}

@JsonProperty("StadiumDetails")
public void setStadiumDetails(StadiumDetails stadiumDetails) {
this.stadiumDetails = stadiumDetails;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}