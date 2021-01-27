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
"StadiumID",
"Name",
"City",
"State",
"Country",
"Capacity",
"PlayingSurface",
"GeoLat",
"GeoLong",
"Type"
})
public class StadiumDetails {

@JsonProperty("StadiumID")
private Integer stadiumID;
@JsonProperty("Name")
private String name;
@JsonProperty("City")
private String city;
@JsonProperty("State")
private String state;
@JsonProperty("Country")
private String country;
@JsonProperty("Capacity")
private Integer capacity;
@JsonProperty("PlayingSurface")
private String playingSurface;
@JsonProperty("GeoLat")
private Double geoLat;
@JsonProperty("GeoLong")
private Double geoLong;
@JsonProperty("Type")
private String type;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("StadiumID")
public Integer getStadiumID() {
return stadiumID;
}

@JsonProperty("StadiumID")
public void setStadiumID(Integer stadiumID) {
this.stadiumID = stadiumID;
}

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("City")
public String getCity() {
return city;
}

@JsonProperty("City")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("State")
public String getState() {
return state;
}

@JsonProperty("State")
public void setState(String state) {
this.state = state;
}

@JsonProperty("Country")
public String getCountry() {
return country;
}

@JsonProperty("Country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("Capacity")
public Integer getCapacity() {
return capacity;
}

@JsonProperty("Capacity")
public void setCapacity(Integer capacity) {
this.capacity = capacity;
}

@JsonProperty("PlayingSurface")
public String getPlayingSurface() {
return playingSurface;
}

@JsonProperty("PlayingSurface")
public void setPlayingSurface(String playingSurface) {
this.playingSurface = playingSurface;
}

@JsonProperty("GeoLat")
public Double getGeoLat() {
return geoLat;
}

@JsonProperty("GeoLat")
public void setGeoLat(Double geoLat) {
this.geoLat = geoLat;
}

@JsonProperty("GeoLong")
public Double getGeoLong() {
return geoLong;
}

@JsonProperty("GeoLong")
public void setGeoLong(Double geoLong) {
this.geoLong = geoLong;
}

@JsonProperty("Type")
public String getType() {
return type;
}

@JsonProperty("Type")
public void setType(String type) {
this.type = type;
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