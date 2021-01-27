package com.ff.fantasyfootball;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"PlayerID",
"Team",
"Number",
"FirstName",
"LastName",
"Position",
"Status",
"Height",
"Weight",
"BirthDate",
"College",
"Experience",
"FantasyPosition",
"Active",
"PositionCategory",
"Name",
"Age",
"ExperienceString",
"BirthDateString",
"PhotoUrl",
"ByeWeek",
"UpcomingGameOpponent",
"UpcomingGameWeek",
"ShortName",
"AverageDraftPosition",
"DepthPositionCategory",
"DepthPosition",
"DepthOrder",
"DepthDisplayOrder",
"CurrentTeam",
"CollegeDraftTeam",
"CollegeDraftYear",
"CollegeDraftRound",
"CollegeDraftPick",
"IsUndraftedFreeAgent",
"HeightFeet",
"HeightInches",
"UpcomingOpponentRank",
"UpcomingOpponentPositionRank",
"CurrentStatus",
"UpcomingSalary",
"FantasyAlarmPlayerID",
"SportRadarPlayerID",
"RotoworldPlayerID",
"RotoWirePlayerID",
"StatsPlayerID",
"SportsDirectPlayerID",
"XmlTeamPlayerID",
"FanDuelPlayerID",
"DraftKingsPlayerID",
"YahooPlayerID",
"InjuryStatus",
"InjuryBodyPart",
"InjuryStartDate",
"InjuryNotes",
"FanDuelName",
"DraftKingsName",
"YahooName",
"FantasyPositionDepthOrder",
"InjuryPractice",
"InjuryPracticeDescription",
"DeclaredInactive",
"UpcomingFanDuelSalary",
"UpcomingDraftKingsSalary",
"UpcomingYahooSalary",
"TeamID",
"GlobalTeamID",
"FantasyDraftPlayerID",
"FantasyDraftName",
"UsaTodayPlayerID",
"UsaTodayHeadshotUrl",
"UsaTodayHeadshotNoBackgroundUrl",
"UsaTodayHeadshotUpdated",
"UsaTodayHeadshotNoBackgroundUpdated",
"PlayerSeason",
"LatestNews"
})
public class Player {

@JsonProperty("PlayerID")
private Integer playerID;
@JsonProperty("Team")
private String team;
@JsonProperty("Number")
private Integer number;
@JsonProperty("FirstName")
private String firstName;
@JsonProperty("LastName")
private String lastName;
@JsonProperty("Position")
private String position;
@JsonProperty("Status")
private String status;
@JsonProperty("Height")
private String height;
@JsonProperty("Weight")
private Integer weight;
@JsonProperty("BirthDate")
private String birthDate;
@JsonProperty("College")
private String college;
@JsonProperty("Experience")
private Integer experience;
@JsonProperty("FantasyPosition")
private String fantasyPosition;
@JsonProperty("Active")
private Boolean active;
@JsonProperty("PositionCategory")
private String positionCategory;
@JsonProperty("Name")
private String name;
@JsonProperty("Age")
private Integer age;
@JsonProperty("ExperienceString")
private String experienceString;
@JsonProperty("BirthDateString")
private String birthDateString;
@JsonProperty("PhotoUrl")
private String photoUrl;
@JsonProperty("ByeWeek")
private Integer byeWeek;
@JsonProperty("UpcomingGameOpponent")
private String upcomingGameOpponent;
@JsonProperty("UpcomingGameWeek")
private Integer upcomingGameWeek;
@JsonProperty("ShortName")
private String shortName;
@JsonProperty("AverageDraftPosition")
private Double averageDraftPosition;
@JsonProperty("DepthPositionCategory")
private String depthPositionCategory;
@JsonProperty("DepthPosition")
private String depthPosition;
@JsonProperty("DepthOrder")
private Integer depthOrder;
@JsonProperty("DepthDisplayOrder")
private Integer depthDisplayOrder;
@JsonProperty("CurrentTeam")
private String currentTeam;
@JsonProperty("CollegeDraftTeam")
private String collegeDraftTeam;
@JsonProperty("CollegeDraftYear")
private Integer collegeDraftYear;
@JsonProperty("CollegeDraftRound")
private Integer collegeDraftRound;
@JsonProperty("CollegeDraftPick")
private Integer collegeDraftPick;
@JsonProperty("IsUndraftedFreeAgent")
private Boolean isUndraftedFreeAgent;
@JsonProperty("HeightFeet")
private Integer heightFeet;
@JsonProperty("HeightInches")
private Integer heightInches;
@JsonProperty("UpcomingOpponentRank")
private Integer upcomingOpponentRank;
@JsonProperty("UpcomingOpponentPositionRank")
private Integer upcomingOpponentPositionRank;
@JsonProperty("CurrentStatus")
private String currentStatus;
@JsonProperty("UpcomingSalary")
private Integer upcomingSalary;
@JsonProperty("FantasyAlarmPlayerID")
private Integer fantasyAlarmPlayerID;
@JsonProperty("SportRadarPlayerID")
private String sportRadarPlayerID;
@JsonProperty("RotoworldPlayerID")
private Integer rotoworldPlayerID;
@JsonProperty("RotoWirePlayerID")
private Integer rotoWirePlayerID;
@JsonProperty("StatsPlayerID")
private Integer statsPlayerID;
@JsonProperty("SportsDirectPlayerID")
private Integer sportsDirectPlayerID;
@JsonProperty("XmlTeamPlayerID")
private Integer xmlTeamPlayerID;
@JsonProperty("FanDuelPlayerID")
private Integer fanDuelPlayerID;
@JsonProperty("DraftKingsPlayerID")
private Integer draftKingsPlayerID;
@JsonProperty("YahooPlayerID")
private Integer yahooPlayerID;
@JsonProperty("InjuryStatus")
private String injuryStatus;
@JsonProperty("InjuryBodyPart")
private String injuryBodyPart;
@JsonProperty("InjuryStartDate")
private Object injuryStartDate;
@JsonProperty("InjuryNotes")
private String injuryNotes;
@JsonProperty("FanDuelName")
private String fanDuelName;
@JsonProperty("DraftKingsName")
private String draftKingsName;
@JsonProperty("YahooName")
private String yahooName;
@JsonProperty("FantasyPositionDepthOrder")
private Integer fantasyPositionDepthOrder;
@JsonProperty("InjuryPractice")
private String injuryPractice;
@JsonProperty("InjuryPracticeDescription")
private String injuryPracticeDescription;
@JsonProperty("DeclaredInactive")
private Boolean declaredInactive;
@JsonProperty("UpcomingFanDuelSalary")
private Object upcomingFanDuelSalary;
@JsonProperty("UpcomingDraftKingsSalary")
private Object upcomingDraftKingsSalary;
@JsonProperty("UpcomingYahooSalary")
private Object upcomingYahooSalary;
@JsonProperty("TeamID")
private Integer teamID;
@JsonProperty("GlobalTeamID")
private Integer globalTeamID;
@JsonProperty("FantasyDraftPlayerID")
private Integer fantasyDraftPlayerID;
@JsonProperty("FantasyDraftName")
private String fantasyDraftName;
@JsonProperty("UsaTodayPlayerID")
private Integer usaTodayPlayerID;
@JsonProperty("UsaTodayHeadshotUrl")
private String usaTodayHeadshotUrl;
@JsonProperty("UsaTodayHeadshotNoBackgroundUrl")
private String usaTodayHeadshotNoBackgroundUrl;
@JsonProperty("UsaTodayHeadshotUpdated")
private String usaTodayHeadshotUpdated;
@JsonProperty("UsaTodayHeadshotNoBackgroundUpdated")
private String usaTodayHeadshotNoBackgroundUpdated;
@JsonProperty("PlayerSeason")
private Object playerSeason;
@JsonProperty("LatestNews")
private List<Object> latestNews = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("PlayerID")
public Integer getPlayerID() {
return playerID;
}

@JsonProperty("PlayerID")
public void setPlayerID(Integer playerID) {
this.playerID = playerID;
}

@JsonProperty("Team")
public String getTeam() {
return team;
}

@JsonProperty("Team")
public void setTeam(String team) {
this.team = team;
}

@JsonProperty("Number")
public Integer getNumber() {
return number;
}

@JsonProperty("Number")
public void setNumber(Integer number) {
this.number = number;
}

@JsonProperty("FirstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("FirstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("LastName")
public String getLastName() {
return lastName;
}

@JsonProperty("LastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("Position")
public String getPosition() {
return position;
}

@JsonProperty("Position")
public void setPosition(String position) {
this.position = position;
}

@JsonProperty("Status")
public String getStatus() {
return status;
}

@JsonProperty("Status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("Height")
public String getHeight() {
return height;
}

@JsonProperty("Height")
public void setHeight(String height) {
this.height = height;
}

@JsonProperty("Weight")
public Integer getWeight() {
return weight;
}

@JsonProperty("Weight")
public void setWeight(Integer weight) {
this.weight = weight;
}

@JsonProperty("BirthDate")
public String getBirthDate() {
return birthDate;
}

@JsonProperty("BirthDate")
public void setBirthDate(String birthDate) {
this.birthDate = birthDate;
}

@JsonProperty("College")
public String getCollege() {
return college;
}

@JsonProperty("College")
public void setCollege(String college) {
this.college = college;
}

@JsonProperty("Experience")
public Integer getExperience() {
return experience;
}

@JsonProperty("Experience")
public void setExperience(Integer experience) {
this.experience = experience;
}

@JsonProperty("FantasyPosition")
public String getFantasyPosition() {
return fantasyPosition;
}

@JsonProperty("FantasyPosition")
public void setFantasyPosition(String fantasyPosition) {
this.fantasyPosition = fantasyPosition;
}

@JsonProperty("Active")
public Boolean getActive() {
return active;
}

@JsonProperty("Active")
public void setActive(Boolean active) {
this.active = active;
}

@JsonProperty("PositionCategory")
public String getPositionCategory() {
return positionCategory;
}

@JsonProperty("PositionCategory")
public void setPositionCategory(String positionCategory) {
this.positionCategory = positionCategory;
}

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("Age")
public Integer getAge() {
return age;
}

@JsonProperty("Age")
public void setAge(Integer age) {
this.age = age;
}

@JsonProperty("ExperienceString")
public String getExperienceString() {
return experienceString;
}

@JsonProperty("ExperienceString")
public void setExperienceString(String experienceString) {
this.experienceString = experienceString;
}

@JsonProperty("BirthDateString")
public String getBirthDateString() {
return birthDateString;
}

@JsonProperty("BirthDateString")
public void setBirthDateString(String birthDateString) {
this.birthDateString = birthDateString;
}

@JsonProperty("PhotoUrl")
public String getPhotoUrl() {
return photoUrl;
}

@JsonProperty("PhotoUrl")
public void setPhotoUrl(String photoUrl) {
this.photoUrl = photoUrl;
}

@JsonProperty("ByeWeek")
public Integer getByeWeek() {
return byeWeek;
}

@JsonProperty("ByeWeek")
public void setByeWeek(Integer byeWeek) {
this.byeWeek = byeWeek;
}

@JsonProperty("UpcomingGameOpponent")
public String getUpcomingGameOpponent() {
return upcomingGameOpponent;
}

@JsonProperty("UpcomingGameOpponent")
public void setUpcomingGameOpponent(String upcomingGameOpponent) {
this.upcomingGameOpponent = upcomingGameOpponent;
}

@JsonProperty("UpcomingGameWeek")
public Integer getUpcomingGameWeek() {
return upcomingGameWeek;
}

@JsonProperty("UpcomingGameWeek")
public void setUpcomingGameWeek(Integer upcomingGameWeek) {
this.upcomingGameWeek = upcomingGameWeek;
}

@JsonProperty("ShortName")
public String getShortName() {
return shortName;
}

@JsonProperty("ShortName")
public void setShortName(String shortName) {
this.shortName = shortName;
}

@JsonProperty("AverageDraftPosition")
public Double getAverageDraftPosition() {
return averageDraftPosition;
}

@JsonProperty("AverageDraftPosition")
public void setAverageDraftPosition(Double averageDraftPosition) {
this.averageDraftPosition = averageDraftPosition;
}

@JsonProperty("DepthPositionCategory")
public String getDepthPositionCategory() {
return depthPositionCategory;
}

@JsonProperty("DepthPositionCategory")
public void setDepthPositionCategory(String depthPositionCategory) {
this.depthPositionCategory = depthPositionCategory;
}

@JsonProperty("DepthPosition")
public String getDepthPosition() {
return depthPosition;
}

@JsonProperty("DepthPosition")
public void setDepthPosition(String depthPosition) {
this.depthPosition = depthPosition;
}

@JsonProperty("DepthOrder")
public Integer getDepthOrder() {
return depthOrder;
}

@JsonProperty("DepthOrder")
public void setDepthOrder(Integer depthOrder) {
this.depthOrder = depthOrder;
}

@JsonProperty("DepthDisplayOrder")
public Integer getDepthDisplayOrder() {
return depthDisplayOrder;
}

@JsonProperty("DepthDisplayOrder")
public void setDepthDisplayOrder(Integer depthDisplayOrder) {
this.depthDisplayOrder = depthDisplayOrder;
}

@JsonProperty("CurrentTeam")
public String getCurrentTeam() {
return currentTeam;
}

@JsonProperty("CurrentTeam")
public void setCurrentTeam(String currentTeam) {
this.currentTeam = currentTeam;
}

@JsonProperty("CollegeDraftTeam")
public String getCollegeDraftTeam() {
return collegeDraftTeam;
}

@JsonProperty("CollegeDraftTeam")
public void setCollegeDraftTeam(String collegeDraftTeam) {
this.collegeDraftTeam = collegeDraftTeam;
}

@JsonProperty("CollegeDraftYear")
public Integer getCollegeDraftYear() {
return collegeDraftYear;
}

@JsonProperty("CollegeDraftYear")
public void setCollegeDraftYear(Integer collegeDraftYear) {
this.collegeDraftYear = collegeDraftYear;
}

@JsonProperty("CollegeDraftRound")
public Integer getCollegeDraftRound() {
return collegeDraftRound;
}

@JsonProperty("CollegeDraftRound")
public void setCollegeDraftRound(Integer collegeDraftRound) {
this.collegeDraftRound = collegeDraftRound;
}

@JsonProperty("CollegeDraftPick")
public Integer getCollegeDraftPick() {
return collegeDraftPick;
}

@JsonProperty("CollegeDraftPick")
public void setCollegeDraftPick(Integer collegeDraftPick) {
this.collegeDraftPick = collegeDraftPick;
}

@JsonProperty("IsUndraftedFreeAgent")
public Boolean getIsUndraftedFreeAgent() {
return isUndraftedFreeAgent;
}

@JsonProperty("IsUndraftedFreeAgent")
public void setIsUndraftedFreeAgent(Boolean isUndraftedFreeAgent) {
this.isUndraftedFreeAgent = isUndraftedFreeAgent;
}

@JsonProperty("HeightFeet")
public Integer getHeightFeet() {
return heightFeet;
}

@JsonProperty("HeightFeet")
public void setHeightFeet(Integer heightFeet) {
this.heightFeet = heightFeet;
}

@JsonProperty("HeightInches")
public Integer getHeightInches() {
return heightInches;
}

@JsonProperty("HeightInches")
public void setHeightInches(Integer heightInches) {
this.heightInches = heightInches;
}

@JsonProperty("UpcomingOpponentRank")
public Integer getUpcomingOpponentRank() {
return upcomingOpponentRank;
}

@JsonProperty("UpcomingOpponentRank")
public void setUpcomingOpponentRank(Integer upcomingOpponentRank) {
this.upcomingOpponentRank = upcomingOpponentRank;
}

@JsonProperty("UpcomingOpponentPositionRank")
public Integer getUpcomingOpponentPositionRank() {
return upcomingOpponentPositionRank;
}

@JsonProperty("UpcomingOpponentPositionRank")
public void setUpcomingOpponentPositionRank(Integer upcomingOpponentPositionRank) {
this.upcomingOpponentPositionRank = upcomingOpponentPositionRank;
}

@JsonProperty("CurrentStatus")
public String getCurrentStatus() {
return currentStatus;
}

@JsonProperty("CurrentStatus")
public void setCurrentStatus(String currentStatus) {
this.currentStatus = currentStatus;
}

@JsonProperty("UpcomingSalary")
public Integer getUpcomingSalary() {
return upcomingSalary;
}

@JsonProperty("UpcomingSalary")
public void setUpcomingSalary(Integer upcomingSalary) {
this.upcomingSalary = upcomingSalary;
}

@JsonProperty("FantasyAlarmPlayerID")
public Integer getFantasyAlarmPlayerID() {
return fantasyAlarmPlayerID;
}

@JsonProperty("FantasyAlarmPlayerID")
public void setFantasyAlarmPlayerID(Integer fantasyAlarmPlayerID) {
this.fantasyAlarmPlayerID = fantasyAlarmPlayerID;
}

@JsonProperty("SportRadarPlayerID")
public String getSportRadarPlayerID() {
return sportRadarPlayerID;
}

@JsonProperty("SportRadarPlayerID")
public void setSportRadarPlayerID(String sportRadarPlayerID) {
this.sportRadarPlayerID = sportRadarPlayerID;
}

@JsonProperty("RotoworldPlayerID")
public Integer getRotoworldPlayerID() {
return rotoworldPlayerID;
}

@JsonProperty("RotoworldPlayerID")
public void setRotoworldPlayerID(Integer rotoworldPlayerID) {
this.rotoworldPlayerID = rotoworldPlayerID;
}

@JsonProperty("RotoWirePlayerID")
public Integer getRotoWirePlayerID() {
return rotoWirePlayerID;
}

@JsonProperty("RotoWirePlayerID")
public void setRotoWirePlayerID(Integer rotoWirePlayerID) {
this.rotoWirePlayerID = rotoWirePlayerID;
}

@JsonProperty("StatsPlayerID")
public Integer getStatsPlayerID() {
return statsPlayerID;
}

@JsonProperty("StatsPlayerID")
public void setStatsPlayerID(Integer statsPlayerID) {
this.statsPlayerID = statsPlayerID;
}

@JsonProperty("SportsDirectPlayerID")
public Integer getSportsDirectPlayerID() {
return sportsDirectPlayerID;
}

@JsonProperty("SportsDirectPlayerID")
public void setSportsDirectPlayerID(Integer sportsDirectPlayerID) {
this.sportsDirectPlayerID = sportsDirectPlayerID;
}

@JsonProperty("XmlTeamPlayerID")
public Integer getXmlTeamPlayerID() {
return xmlTeamPlayerID;
}

@JsonProperty("XmlTeamPlayerID")
public void setXmlTeamPlayerID(Integer xmlTeamPlayerID) {
this.xmlTeamPlayerID = xmlTeamPlayerID;
}

@JsonProperty("FanDuelPlayerID")
public Integer getFanDuelPlayerID() {
return fanDuelPlayerID;
}

@JsonProperty("FanDuelPlayerID")
public void setFanDuelPlayerID(Integer fanDuelPlayerID) {
this.fanDuelPlayerID = fanDuelPlayerID;
}

@JsonProperty("DraftKingsPlayerID")
public Integer getDraftKingsPlayerID() {
return draftKingsPlayerID;
}

@JsonProperty("DraftKingsPlayerID")
public void setDraftKingsPlayerID(Integer draftKingsPlayerID) {
this.draftKingsPlayerID = draftKingsPlayerID;
}

@JsonProperty("YahooPlayerID")
public Integer getYahooPlayerID() {
return yahooPlayerID;
}

@JsonProperty("YahooPlayerID")
public void setYahooPlayerID(Integer yahooPlayerID) {
this.yahooPlayerID = yahooPlayerID;
}

@JsonProperty("InjuryStatus")
public String getInjuryStatus() {
return injuryStatus;
}

@JsonProperty("InjuryStatus")
public void setInjuryStatus(String injuryStatus) {
this.injuryStatus = injuryStatus;
}

@JsonProperty("InjuryBodyPart")
public String getInjuryBodyPart() {
return injuryBodyPart;
}

@JsonProperty("InjuryBodyPart")
public void setInjuryBodyPart(String injuryBodyPart) {
this.injuryBodyPart = injuryBodyPart;
}

@JsonProperty("InjuryStartDate")
public Object getInjuryStartDate() {
return injuryStartDate;
}

@JsonProperty("InjuryStartDate")
public void setInjuryStartDate(Object injuryStartDate) {
this.injuryStartDate = injuryStartDate;
}

@JsonProperty("InjuryNotes")
public String getInjuryNotes() {
return injuryNotes;
}

@JsonProperty("InjuryNotes")
public void setInjuryNotes(String injuryNotes) {
this.injuryNotes = injuryNotes;
}

@JsonProperty("FanDuelName")
public String getFanDuelName() {
return fanDuelName;
}

@JsonProperty("FanDuelName")
public void setFanDuelName(String fanDuelName) {
this.fanDuelName = fanDuelName;
}

@JsonProperty("DraftKingsName")
public String getDraftKingsName() {
return draftKingsName;
}

@JsonProperty("DraftKingsName")
public void setDraftKingsName(String draftKingsName) {
this.draftKingsName = draftKingsName;
}

@JsonProperty("YahooName")
public String getYahooName() {
return yahooName;
}

@JsonProperty("YahooName")
public void setYahooName(String yahooName) {
this.yahooName = yahooName;
}

@JsonProperty("FantasyPositionDepthOrder")
public Integer getFantasyPositionDepthOrder() {
return fantasyPositionDepthOrder;
}

@JsonProperty("FantasyPositionDepthOrder")
public void setFantasyPositionDepthOrder(Integer fantasyPositionDepthOrder) {
this.fantasyPositionDepthOrder = fantasyPositionDepthOrder;
}

@JsonProperty("InjuryPractice")
public String getInjuryPractice() {
return injuryPractice;
}

@JsonProperty("InjuryPractice")
public void setInjuryPractice(String injuryPractice) {
this.injuryPractice = injuryPractice;
}

@JsonProperty("InjuryPracticeDescription")
public String getInjuryPracticeDescription() {
return injuryPracticeDescription;
}

@JsonProperty("InjuryPracticeDescription")
public void setInjuryPracticeDescription(String injuryPracticeDescription) {
this.injuryPracticeDescription = injuryPracticeDescription;
}

@JsonProperty("DeclaredInactive")
public Boolean getDeclaredInactive() {
return declaredInactive;
}

@JsonProperty("DeclaredInactive")
public void setDeclaredInactive(Boolean declaredInactive) {
this.declaredInactive = declaredInactive;
}

@JsonProperty("UpcomingFanDuelSalary")
public Object getUpcomingFanDuelSalary() {
return upcomingFanDuelSalary;
}

@JsonProperty("UpcomingFanDuelSalary")
public void setUpcomingFanDuelSalary(Object upcomingFanDuelSalary) {
this.upcomingFanDuelSalary = upcomingFanDuelSalary;
}

@JsonProperty("UpcomingDraftKingsSalary")
public Object getUpcomingDraftKingsSalary() {
return upcomingDraftKingsSalary;
}

@JsonProperty("UpcomingDraftKingsSalary")
public void setUpcomingDraftKingsSalary(Object upcomingDraftKingsSalary) {
this.upcomingDraftKingsSalary = upcomingDraftKingsSalary;
}

@JsonProperty("UpcomingYahooSalary")
public Object getUpcomingYahooSalary() {
return upcomingYahooSalary;
}

@JsonProperty("UpcomingYahooSalary")
public void setUpcomingYahooSalary(Object upcomingYahooSalary) {
this.upcomingYahooSalary = upcomingYahooSalary;
}

@JsonProperty("TeamID")
public Integer getTeamID() {
return teamID;
}

@JsonProperty("TeamID")
public void setTeamID(Integer teamID) {
this.teamID = teamID;
}

@JsonProperty("GlobalTeamID")
public Integer getGlobalTeamID() {
return globalTeamID;
}

@JsonProperty("GlobalTeamID")
public void setGlobalTeamID(Integer globalTeamID) {
this.globalTeamID = globalTeamID;
}

@JsonProperty("FantasyDraftPlayerID")
public Integer getFantasyDraftPlayerID() {
return fantasyDraftPlayerID;
}

@JsonProperty("FantasyDraftPlayerID")
public void setFantasyDraftPlayerID(Integer fantasyDraftPlayerID) {
this.fantasyDraftPlayerID = fantasyDraftPlayerID;
}

@JsonProperty("FantasyDraftName")
public String getFantasyDraftName() {
return fantasyDraftName;
}

@JsonProperty("FantasyDraftName")
public void setFantasyDraftName(String fantasyDraftName) {
this.fantasyDraftName = fantasyDraftName;
}

@JsonProperty("UsaTodayPlayerID")
public Integer getUsaTodayPlayerID() {
return usaTodayPlayerID;
}

@JsonProperty("UsaTodayPlayerID")
public void setUsaTodayPlayerID(Integer usaTodayPlayerID) {
this.usaTodayPlayerID = usaTodayPlayerID;
}

@JsonProperty("UsaTodayHeadshotUrl")
public String getUsaTodayHeadshotUrl() {
return usaTodayHeadshotUrl;
}

@JsonProperty("UsaTodayHeadshotUrl")
public void setUsaTodayHeadshotUrl(String usaTodayHeadshotUrl) {
this.usaTodayHeadshotUrl = usaTodayHeadshotUrl;
}

@JsonProperty("UsaTodayHeadshotNoBackgroundUrl")
public String getUsaTodayHeadshotNoBackgroundUrl() {
return usaTodayHeadshotNoBackgroundUrl;
}

@JsonProperty("UsaTodayHeadshotNoBackgroundUrl")
public void setUsaTodayHeadshotNoBackgroundUrl(String usaTodayHeadshotNoBackgroundUrl) {
this.usaTodayHeadshotNoBackgroundUrl = usaTodayHeadshotNoBackgroundUrl;
}

@JsonProperty("UsaTodayHeadshotUpdated")
public String getUsaTodayHeadshotUpdated() {
return usaTodayHeadshotUpdated;
}

@JsonProperty("UsaTodayHeadshotUpdated")
public void setUsaTodayHeadshotUpdated(String usaTodayHeadshotUpdated) {
this.usaTodayHeadshotUpdated = usaTodayHeadshotUpdated;
}

@JsonProperty("UsaTodayHeadshotNoBackgroundUpdated")
public String getUsaTodayHeadshotNoBackgroundUpdated() {
return usaTodayHeadshotNoBackgroundUpdated;
}

@JsonProperty("UsaTodayHeadshotNoBackgroundUpdated")
public void setUsaTodayHeadshotNoBackgroundUpdated(String usaTodayHeadshotNoBackgroundUpdated) {
this.usaTodayHeadshotNoBackgroundUpdated = usaTodayHeadshotNoBackgroundUpdated;
}

@JsonProperty("PlayerSeason")
public Object getPlayerSeason() {
return playerSeason;
}

@JsonProperty("PlayerSeason")
public void setPlayerSeason(Object playerSeason) {
this.playerSeason = playerSeason;
}

@JsonProperty("LatestNews")
public List<Object> getLatestNews() {
return latestNews;
}

@JsonProperty("LatestNews")
public void setLatestNews(List<Object> latestNews) {
this.latestNews = latestNews;
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