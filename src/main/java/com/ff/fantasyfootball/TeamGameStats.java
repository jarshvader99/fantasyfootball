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
"Date",
"SeasonType",
"Season",
"Week",
"Team",
"Opponent",
"HomeOrAway",
"Score",
"OpponentScore",
"TotalScore",
"Stadium",
"PlayingSurface",
"Temperature",
"Humidity",
"WindSpeed",
"OverUnder",
"PointSpread",
"ScoreQuarter1",
"ScoreQuarter2",
"ScoreQuarter3",
"ScoreQuarter4",
"ScoreOvertime",
"TimeOfPossessionMinutes",
"TimeOfPossessionSeconds",
"TimeOfPossession",
"FirstDowns",
"FirstDownsByRushing",
"FirstDownsByPassing",
"FirstDownsByPenalty",
"OffensivePlays",
"OffensiveYards",
"OffensiveYardsPerPlay",
"Touchdowns",
"RushingAttempts",
"RushingYards",
"RushingYardsPerAttempt",
"RushingTouchdowns",
"PassingAttempts",
"PassingCompletions",
"PassingYards",
"PassingTouchdowns",
"PassingInterceptions",
"PassingYardsPerAttempt",
"PassingYardsPerCompletion",
"CompletionPercentage",
"PasserRating",
"ThirdDownAttempts",
"ThirdDownConversions",
"ThirdDownPercentage",
"FourthDownAttempts",
"FourthDownConversions",
"FourthDownPercentage",
"RedZoneAttempts",
"RedZoneConversions",
"GoalToGoAttempts",
"GoalToGoConversions",
"ReturnYards",
"Penalties",
"PenaltyYards",
"Fumbles",
"FumblesLost",
"TimesSacked",
"TimesSackedYards",
"QuarterbackHits",
"TacklesForLoss",
"Safeties",
"Punts",
"PuntYards",
"PuntAverage",
"Giveaways",
"Takeaways",
"TurnoverDifferential",
"OpponentScoreQuarter1",
"OpponentScoreQuarter2",
"OpponentScoreQuarter3",
"OpponentScoreQuarter4",
"OpponentScoreOvertime",
"OpponentTimeOfPossessionMinutes",
"OpponentTimeOfPossessionSeconds",
"OpponentTimeOfPossession",
"OpponentFirstDowns",
"OpponentFirstDownsByRushing",
"OpponentFirstDownsByPassing",
"OpponentFirstDownsByPenalty",
"OpponentOffensivePlays",
"OpponentOffensiveYards",
"OpponentOffensiveYardsPerPlay",
"OpponentTouchdowns",
"OpponentRushingAttempts",
"OpponentRushingYards",
"OpponentRushingYardsPerAttempt",
"OpponentRushingTouchdowns",
"OpponentPassingAttempts",
"OpponentPassingCompletions",
"OpponentPassingYards",
"OpponentPassingTouchdowns",
"OpponentPassingInterceptions",
"OpponentPassingYardsPerAttempt",
"OpponentPassingYardsPerCompletion",
"OpponentCompletionPercentage",
"OpponentPasserRating",
"OpponentThirdDownAttempts",
"OpponentThirdDownConversions",
"OpponentThirdDownPercentage",
"OpponentFourthDownAttempts",
"OpponentFourthDownConversions",
"OpponentFourthDownPercentage",
"OpponentRedZoneAttempts",
"OpponentRedZoneConversions",
"OpponentGoalToGoAttempts",
"OpponentGoalToGoConversions",
"OpponentReturnYards",
"OpponentPenalties",
"OpponentPenaltyYards",
"OpponentFumbles",
"OpponentFumblesLost",
"OpponentTimesSacked",
"OpponentTimesSackedYards",
"OpponentQuarterbackHits",
"OpponentTacklesForLoss",
"OpponentSafeties",
"OpponentPunts",
"OpponentPuntYards",
"OpponentPuntAverage",
"OpponentGiveaways",
"OpponentTakeaways",
"OpponentTurnoverDifferential",
"RedZonePercentage",
"GoalToGoPercentage",
"QuarterbackHitsDifferential",
"TacklesForLossDifferential",
"QuarterbackSacksDifferential",
"TacklesForLossPercentage",
"QuarterbackHitsPercentage",
"TimesSackedPercentage",
"OpponentRedZonePercentage",
"OpponentGoalToGoPercentage",
"OpponentQuarterbackHitsDifferential",
"OpponentTacklesForLossDifferential",
"OpponentQuarterbackSacksDifferential",
"OpponentTacklesForLossPercentage",
"OpponentQuarterbackHitsPercentage",
"OpponentTimesSackedPercentage",
"Kickoffs",
"KickoffsInEndZone",
"KickoffTouchbacks",
"PuntsHadBlocked",
"PuntNetAverage",
"ExtraPointKickingAttempts",
"ExtraPointKickingConversions",
"ExtraPointsHadBlocked",
"ExtraPointPassingAttempts",
"ExtraPointPassingConversions",
"ExtraPointRushingAttempts",
"ExtraPointRushingConversions",
"FieldGoalAttempts",
"FieldGoalsMade",
"FieldGoalsHadBlocked",
"PuntReturns",
"PuntReturnYards",
"KickReturns",
"KickReturnYards",
"InterceptionReturns",
"InterceptionReturnYards",
"OpponentKickoffs",
"OpponentKickoffsInEndZone",
"OpponentKickoffTouchbacks",
"OpponentPuntsHadBlocked",
"OpponentPuntNetAverage",
"OpponentExtraPointKickingAttempts",
"OpponentExtraPointKickingConversions",
"OpponentExtraPointsHadBlocked",
"OpponentExtraPointPassingAttempts",
"OpponentExtraPointPassingConversions",
"OpponentExtraPointRushingAttempts",
"OpponentExtraPointRushingConversions",
"OpponentFieldGoalAttempts",
"OpponentFieldGoalsMade",
"OpponentFieldGoalsHadBlocked",
"OpponentPuntReturns",
"OpponentPuntReturnYards",
"OpponentKickReturns",
"OpponentKickReturnYards",
"OpponentInterceptionReturns",
"OpponentInterceptionReturnYards",
"SoloTackles",
"AssistedTackles",
"Sacks",
"SackYards",
"PassesDefended",
"FumblesForced",
"FumblesRecovered",
"FumbleReturnYards",
"FumbleReturnTouchdowns",
"InterceptionReturnTouchdowns",
"BlockedKicks",
"PuntReturnTouchdowns",
"PuntReturnLong",
"KickReturnTouchdowns",
"KickReturnLong",
"BlockedKickReturnYards",
"BlockedKickReturnTouchdowns",
"FieldGoalReturnYards",
"FieldGoalReturnTouchdowns",
"PuntNetYards",
"OpponentSoloTackles",
"OpponentAssistedTackles",
"OpponentSacks",
"OpponentSackYards",
"OpponentPassesDefended",
"OpponentFumblesForced",
"OpponentFumblesRecovered",
"OpponentFumbleReturnYards",
"OpponentFumbleReturnTouchdowns",
"OpponentInterceptionReturnTouchdowns",
"OpponentBlockedKicks",
"OpponentPuntReturnTouchdowns",
"OpponentPuntReturnLong",
"OpponentKickReturnTouchdowns",
"OpponentKickReturnLong",
"OpponentBlockedKickReturnYards",
"OpponentBlockedKickReturnTouchdowns",
"OpponentFieldGoalReturnYards",
"OpponentFieldGoalReturnTouchdowns",
"OpponentPuntNetYards",
"IsGameOver",
"TeamName",
"DayOfWeek",
"PassingDropbacks",
"OpponentPassingDropbacks",
"TeamGameID",
"TwoPointConversionReturns",
"OpponentTwoPointConversionReturns",
"TeamID",
"OpponentID",
"Day",
"DateTime",
"GlobalGameID",
"GlobalTeamID",
"GlobalOpponentID",
"ScoreID"
})
public class TeamGameStats {

@JsonProperty("GameKey")
private String gameKey;
@JsonProperty("Date")
private String date;
@JsonProperty("SeasonType")
private Integer seasonType;
@JsonProperty("Season")
private Integer season;
@JsonProperty("Week")
private Integer week;
@JsonProperty("Team")
private String team;
@JsonProperty("Opponent")
private String opponent;
@JsonProperty("HomeOrAway")
private String homeOrAway;
@JsonProperty("Score")
private Integer score;
@JsonProperty("OpponentScore")
private Integer opponentScore;
@JsonProperty("TotalScore")
private Integer totalScore;
@JsonProperty("Stadium")
private String stadium;
@JsonProperty("PlayingSurface")
private String playingSurface;
@JsonProperty("Temperature")
private Integer temperature;
@JsonProperty("Humidity")
private Integer humidity;
@JsonProperty("WindSpeed")
private Integer windSpeed;
@JsonProperty("OverUnder")
private Double overUnder;
@JsonProperty("PointSpread")
private Double pointSpread;
@JsonProperty("ScoreQuarter1")
private Integer scoreQuarter1;
@JsonProperty("ScoreQuarter2")
private Integer scoreQuarter2;
@JsonProperty("ScoreQuarter3")
private Integer scoreQuarter3;
@JsonProperty("ScoreQuarter4")
private Integer scoreQuarter4;
@JsonProperty("ScoreOvertime")
private Integer scoreOvertime;
@JsonProperty("TimeOfPossessionMinutes")
private Integer timeOfPossessionMinutes;
@JsonProperty("TimeOfPossessionSeconds")
private Integer timeOfPossessionSeconds;
@JsonProperty("TimeOfPossession")
private String timeOfPossession;
@JsonProperty("FirstDowns")
private Integer firstDowns;
@JsonProperty("FirstDownsByRushing")
private Integer firstDownsByRushing;
@JsonProperty("FirstDownsByPassing")
private Integer firstDownsByPassing;
@JsonProperty("FirstDownsByPenalty")
private Integer firstDownsByPenalty;
@JsonProperty("OffensivePlays")
private Integer offensivePlays;
@JsonProperty("OffensiveYards")
private Integer offensiveYards;
@JsonProperty("OffensiveYardsPerPlay")
private Double offensiveYardsPerPlay;
@JsonProperty("Touchdowns")
private Integer touchdowns;
@JsonProperty("RushingAttempts")
private Integer rushingAttempts;
@JsonProperty("RushingYards")
private Integer rushingYards;
@JsonProperty("RushingYardsPerAttempt")
private Double rushingYardsPerAttempt;
@JsonProperty("RushingTouchdowns")
private Integer rushingTouchdowns;
@JsonProperty("PassingAttempts")
private Integer passingAttempts;
@JsonProperty("PassingCompletions")
private Integer passingCompletions;
@JsonProperty("PassingYards")
private Integer passingYards;
@JsonProperty("PassingTouchdowns")
private Integer passingTouchdowns;
@JsonProperty("PassingInterceptions")
private Integer passingInterceptions;
@JsonProperty("PassingYardsPerAttempt")
private Double passingYardsPerAttempt;
@JsonProperty("PassingYardsPerCompletion")
private Double passingYardsPerCompletion;
@JsonProperty("CompletionPercentage")
private Double completionPercentage;
@JsonProperty("PasserRating")
private Double passerRating;
@JsonProperty("ThirdDownAttempts")
private Integer thirdDownAttempts;
@JsonProperty("ThirdDownConversions")
private Integer thirdDownConversions;
@JsonProperty("ThirdDownPercentage")
private Double thirdDownPercentage;
@JsonProperty("FourthDownAttempts")
private Integer fourthDownAttempts;
@JsonProperty("FourthDownConversions")
private Integer fourthDownConversions;
@JsonProperty("FourthDownPercentage")
private Double fourthDownPercentage;
@JsonProperty("RedZoneAttempts")
private Integer redZoneAttempts;
@JsonProperty("RedZoneConversions")
private Integer redZoneConversions;
@JsonProperty("GoalToGoAttempts")
private Integer goalToGoAttempts;
@JsonProperty("GoalToGoConversions")
private Integer goalToGoConversions;
@JsonProperty("ReturnYards")
private Integer returnYards;
@JsonProperty("Penalties")
private Integer penalties;
@JsonProperty("PenaltyYards")
private Integer penaltyYards;
@JsonProperty("Fumbles")
private Integer fumbles;
@JsonProperty("FumblesLost")
private Integer fumblesLost;
@JsonProperty("TimesSacked")
private Integer timesSacked;
@JsonProperty("TimesSackedYards")
private Integer timesSackedYards;
@JsonProperty("QuarterbackHits")
private Integer quarterbackHits;
@JsonProperty("TacklesForLoss")
private Integer tacklesForLoss;
@JsonProperty("Safeties")
private Integer safeties;
@JsonProperty("Punts")
private Integer punts;
@JsonProperty("PuntYards")
private Integer puntYards;
@JsonProperty("PuntAverage")
private Double puntAverage;
@JsonProperty("Giveaways")
private Integer giveaways;
@JsonProperty("Takeaways")
private Integer takeaways;
@JsonProperty("TurnoverDifferential")
private Integer turnoverDifferential;
@JsonProperty("OpponentScoreQuarter1")
private Integer opponentScoreQuarter1;
@JsonProperty("OpponentScoreQuarter2")
private Integer opponentScoreQuarter2;
@JsonProperty("OpponentScoreQuarter3")
private Integer opponentScoreQuarter3;
@JsonProperty("OpponentScoreQuarter4")
private Integer opponentScoreQuarter4;
@JsonProperty("OpponentScoreOvertime")
private Integer opponentScoreOvertime;
@JsonProperty("OpponentTimeOfPossessionMinutes")
private Integer opponentTimeOfPossessionMinutes;
@JsonProperty("OpponentTimeOfPossessionSeconds")
private Integer opponentTimeOfPossessionSeconds;
@JsonProperty("OpponentTimeOfPossession")
private String opponentTimeOfPossession;
@JsonProperty("OpponentFirstDowns")
private Integer opponentFirstDowns;
@JsonProperty("OpponentFirstDownsByRushing")
private Integer opponentFirstDownsByRushing;
@JsonProperty("OpponentFirstDownsByPassing")
private Integer opponentFirstDownsByPassing;
@JsonProperty("OpponentFirstDownsByPenalty")
private Integer opponentFirstDownsByPenalty;
@JsonProperty("OpponentOffensivePlays")
private Integer opponentOffensivePlays;
@JsonProperty("OpponentOffensiveYards")
private Integer opponentOffensiveYards;
@JsonProperty("OpponentOffensiveYardsPerPlay")
private Double opponentOffensiveYardsPerPlay;
@JsonProperty("OpponentTouchdowns")
private Integer opponentTouchdowns;
@JsonProperty("OpponentRushingAttempts")
private Integer opponentRushingAttempts;
@JsonProperty("OpponentRushingYards")
private Integer opponentRushingYards;
@JsonProperty("OpponentRushingYardsPerAttempt")
private Double opponentRushingYardsPerAttempt;
@JsonProperty("OpponentRushingTouchdowns")
private Integer opponentRushingTouchdowns;
@JsonProperty("OpponentPassingAttempts")
private Integer opponentPassingAttempts;
@JsonProperty("OpponentPassingCompletions")
private Integer opponentPassingCompletions;
@JsonProperty("OpponentPassingYards")
private Integer opponentPassingYards;
@JsonProperty("OpponentPassingTouchdowns")
private Integer opponentPassingTouchdowns;
@JsonProperty("OpponentPassingInterceptions")
private Integer opponentPassingInterceptions;
@JsonProperty("OpponentPassingYardsPerAttempt")
private Double opponentPassingYardsPerAttempt;
@JsonProperty("OpponentPassingYardsPerCompletion")
private Double opponentPassingYardsPerCompletion;
@JsonProperty("OpponentCompletionPercentage")
private Double opponentCompletionPercentage;
@JsonProperty("OpponentPasserRating")
private Double opponentPasserRating;
@JsonProperty("OpponentThirdDownAttempts")
private Integer opponentThirdDownAttempts;
@JsonProperty("OpponentThirdDownConversions")
private Integer opponentThirdDownConversions;
@JsonProperty("OpponentThirdDownPercentage")
private Double opponentThirdDownPercentage;
@JsonProperty("OpponentFourthDownAttempts")
private Integer opponentFourthDownAttempts;
@JsonProperty("OpponentFourthDownConversions")
private Integer opponentFourthDownConversions;
@JsonProperty("OpponentFourthDownPercentage")
private Double opponentFourthDownPercentage;
@JsonProperty("OpponentRedZoneAttempts")
private Integer opponentRedZoneAttempts;
@JsonProperty("OpponentRedZoneConversions")
private Integer opponentRedZoneConversions;
@JsonProperty("OpponentGoalToGoAttempts")
private Integer opponentGoalToGoAttempts;
@JsonProperty("OpponentGoalToGoConversions")
private Integer opponentGoalToGoConversions;
@JsonProperty("OpponentReturnYards")
private Integer opponentReturnYards;
@JsonProperty("OpponentPenalties")
private Integer opponentPenalties;
@JsonProperty("OpponentPenaltyYards")
private Integer opponentPenaltyYards;
@JsonProperty("OpponentFumbles")
private Integer opponentFumbles;
@JsonProperty("OpponentFumblesLost")
private Integer opponentFumblesLost;
@JsonProperty("OpponentTimesSacked")
private Integer opponentTimesSacked;
@JsonProperty("OpponentTimesSackedYards")
private Integer opponentTimesSackedYards;
@JsonProperty("OpponentQuarterbackHits")
private Integer opponentQuarterbackHits;
@JsonProperty("OpponentTacklesForLoss")
private Integer opponentTacklesForLoss;
@JsonProperty("OpponentSafeties")
private Integer opponentSafeties;
@JsonProperty("OpponentPunts")
private Integer opponentPunts;
@JsonProperty("OpponentPuntYards")
private Integer opponentPuntYards;
@JsonProperty("OpponentPuntAverage")
private Double opponentPuntAverage;
@JsonProperty("OpponentGiveaways")
private Integer opponentGiveaways;
@JsonProperty("OpponentTakeaways")
private Integer opponentTakeaways;
@JsonProperty("OpponentTurnoverDifferential")
private Integer opponentTurnoverDifferential;
@JsonProperty("RedZonePercentage")
private Double redZonePercentage;
@JsonProperty("GoalToGoPercentage")
private Double goalToGoPercentage;
@JsonProperty("QuarterbackHitsDifferential")
private Integer quarterbackHitsDifferential;
@JsonProperty("TacklesForLossDifferential")
private Integer tacklesForLossDifferential;
@JsonProperty("QuarterbackSacksDifferential")
private Integer quarterbackSacksDifferential;
@JsonProperty("TacklesForLossPercentage")
private Double tacklesForLossPercentage;
@JsonProperty("QuarterbackHitsPercentage")
private Double quarterbackHitsPercentage;
@JsonProperty("TimesSackedPercentage")
private Double timesSackedPercentage;
@JsonProperty("OpponentRedZonePercentage")
private Double opponentRedZonePercentage;
@JsonProperty("OpponentGoalToGoPercentage")
private Double opponentGoalToGoPercentage;
@JsonProperty("OpponentQuarterbackHitsDifferential")
private Integer opponentQuarterbackHitsDifferential;
@JsonProperty("OpponentTacklesForLossDifferential")
private Integer opponentTacklesForLossDifferential;
@JsonProperty("OpponentQuarterbackSacksDifferential")
private Integer opponentQuarterbackSacksDifferential;
@JsonProperty("OpponentTacklesForLossPercentage")
private Double opponentTacklesForLossPercentage;
@JsonProperty("OpponentQuarterbackHitsPercentage")
private Double opponentQuarterbackHitsPercentage;
@JsonProperty("OpponentTimesSackedPercentage")
private Double opponentTimesSackedPercentage;
@JsonProperty("Kickoffs")
private Integer kickoffs;
@JsonProperty("KickoffsInEndZone")
private Integer kickoffsInEndZone;
@JsonProperty("KickoffTouchbacks")
private Integer kickoffTouchbacks;
@JsonProperty("PuntsHadBlocked")
private Integer puntsHadBlocked;
@JsonProperty("PuntNetAverage")
private Double puntNetAverage;
@JsonProperty("ExtraPointKickingAttempts")
private Integer extraPointKickingAttempts;
@JsonProperty("ExtraPointKickingConversions")
private Integer extraPointKickingConversions;
@JsonProperty("ExtraPointsHadBlocked")
private Integer extraPointsHadBlocked;
@JsonProperty("ExtraPointPassingAttempts")
private Integer extraPointPassingAttempts;
@JsonProperty("ExtraPointPassingConversions")
private Integer extraPointPassingConversions;
@JsonProperty("ExtraPointRushingAttempts")
private Integer extraPointRushingAttempts;
@JsonProperty("ExtraPointRushingConversions")
private Integer extraPointRushingConversions;
@JsonProperty("FieldGoalAttempts")
private Integer fieldGoalAttempts;
@JsonProperty("FieldGoalsMade")
private Integer fieldGoalsMade;
@JsonProperty("FieldGoalsHadBlocked")
private Integer fieldGoalsHadBlocked;
@JsonProperty("PuntReturns")
private Integer puntReturns;
@JsonProperty("PuntReturnYards")
private Integer puntReturnYards;
@JsonProperty("KickReturns")
private Integer kickReturns;
@JsonProperty("KickReturnYards")
private Integer kickReturnYards;
@JsonProperty("InterceptionReturns")
private Integer interceptionReturns;
@JsonProperty("InterceptionReturnYards")
private Integer interceptionReturnYards;
@JsonProperty("OpponentKickoffs")
private Integer opponentKickoffs;
@JsonProperty("OpponentKickoffsInEndZone")
private Integer opponentKickoffsInEndZone;
@JsonProperty("OpponentKickoffTouchbacks")
private Integer opponentKickoffTouchbacks;
@JsonProperty("OpponentPuntsHadBlocked")
private Integer opponentPuntsHadBlocked;
@JsonProperty("OpponentPuntNetAverage")
private Double opponentPuntNetAverage;
@JsonProperty("OpponentExtraPointKickingAttempts")
private Integer opponentExtraPointKickingAttempts;
@JsonProperty("OpponentExtraPointKickingConversions")
private Integer opponentExtraPointKickingConversions;
@JsonProperty("OpponentExtraPointsHadBlocked")
private Integer opponentExtraPointsHadBlocked;
@JsonProperty("OpponentExtraPointPassingAttempts")
private Integer opponentExtraPointPassingAttempts;
@JsonProperty("OpponentExtraPointPassingConversions")
private Integer opponentExtraPointPassingConversions;
@JsonProperty("OpponentExtraPointRushingAttempts")
private Integer opponentExtraPointRushingAttempts;
@JsonProperty("OpponentExtraPointRushingConversions")
private Integer opponentExtraPointRushingConversions;
@JsonProperty("OpponentFieldGoalAttempts")
private Integer opponentFieldGoalAttempts;
@JsonProperty("OpponentFieldGoalsMade")
private Integer opponentFieldGoalsMade;
@JsonProperty("OpponentFieldGoalsHadBlocked")
private Integer opponentFieldGoalsHadBlocked;
@JsonProperty("OpponentPuntReturns")
private Integer opponentPuntReturns;
@JsonProperty("OpponentPuntReturnYards")
private Integer opponentPuntReturnYards;
@JsonProperty("OpponentKickReturns")
private Integer opponentKickReturns;
@JsonProperty("OpponentKickReturnYards")
private Integer opponentKickReturnYards;
@JsonProperty("OpponentInterceptionReturns")
private Integer opponentInterceptionReturns;
@JsonProperty("OpponentInterceptionReturnYards")
private Integer opponentInterceptionReturnYards;
@JsonProperty("SoloTackles")
private Integer soloTackles;
@JsonProperty("AssistedTackles")
private Integer assistedTackles;
@JsonProperty("Sacks")
private Integer sacks;
@JsonProperty("SackYards")
private Integer sackYards;
@JsonProperty("PassesDefended")
private Integer passesDefended;
@JsonProperty("FumblesForced")
private Integer fumblesForced;
@JsonProperty("FumblesRecovered")
private Integer fumblesRecovered;
@JsonProperty("FumbleReturnYards")
private Integer fumbleReturnYards;
@JsonProperty("FumbleReturnTouchdowns")
private Integer fumbleReturnTouchdowns;
@JsonProperty("InterceptionReturnTouchdowns")
private Integer interceptionReturnTouchdowns;
@JsonProperty("BlockedKicks")
private Integer blockedKicks;
@JsonProperty("PuntReturnTouchdowns")
private Integer puntReturnTouchdowns;
@JsonProperty("PuntReturnLong")
private Integer puntReturnLong;
@JsonProperty("KickReturnTouchdowns")
private Integer kickReturnTouchdowns;
@JsonProperty("KickReturnLong")
private Integer kickReturnLong;
@JsonProperty("BlockedKickReturnYards")
private Integer blockedKickReturnYards;
@JsonProperty("BlockedKickReturnTouchdowns")
private Integer blockedKickReturnTouchdowns;
@JsonProperty("FieldGoalReturnYards")
private Integer fieldGoalReturnYards;
@JsonProperty("FieldGoalReturnTouchdowns")
private Integer fieldGoalReturnTouchdowns;
@JsonProperty("PuntNetYards")
private Integer puntNetYards;
@JsonProperty("OpponentSoloTackles")
private Integer opponentSoloTackles;
@JsonProperty("OpponentAssistedTackles")
private Integer opponentAssistedTackles;
@JsonProperty("OpponentSacks")
private Integer opponentSacks;
@JsonProperty("OpponentSackYards")
private Integer opponentSackYards;
@JsonProperty("OpponentPassesDefended")
private Integer opponentPassesDefended;
@JsonProperty("OpponentFumblesForced")
private Integer opponentFumblesForced;
@JsonProperty("OpponentFumblesRecovered")
private Integer opponentFumblesRecovered;
@JsonProperty("OpponentFumbleReturnYards")
private Integer opponentFumbleReturnYards;
@JsonProperty("OpponentFumbleReturnTouchdowns")
private Integer opponentFumbleReturnTouchdowns;
@JsonProperty("OpponentInterceptionReturnTouchdowns")
private Integer opponentInterceptionReturnTouchdowns;
@JsonProperty("OpponentBlockedKicks")
private Integer opponentBlockedKicks;
@JsonProperty("OpponentPuntReturnTouchdowns")
private Integer opponentPuntReturnTouchdowns;
@JsonProperty("OpponentPuntReturnLong")
private Integer opponentPuntReturnLong;
@JsonProperty("OpponentKickReturnTouchdowns")
private Integer opponentKickReturnTouchdowns;
@JsonProperty("OpponentKickReturnLong")
private Integer opponentKickReturnLong;
@JsonProperty("OpponentBlockedKickReturnYards")
private Integer opponentBlockedKickReturnYards;
@JsonProperty("OpponentBlockedKickReturnTouchdowns")
private Integer opponentBlockedKickReturnTouchdowns;
@JsonProperty("OpponentFieldGoalReturnYards")
private Integer opponentFieldGoalReturnYards;
@JsonProperty("OpponentFieldGoalReturnTouchdowns")
private Integer opponentFieldGoalReturnTouchdowns;
@JsonProperty("OpponentPuntNetYards")
private Integer opponentPuntNetYards;
@JsonProperty("IsGameOver")
private Boolean isGameOver;
@JsonProperty("TeamName")
private String teamName;
@JsonProperty("DayOfWeek")
private String dayOfWeek;
@JsonProperty("PassingDropbacks")
private Integer passingDropbacks;
@JsonProperty("OpponentPassingDropbacks")
private Integer opponentPassingDropbacks;
@JsonProperty("TeamGameID")
private Integer teamGameID;
@JsonProperty("TwoPointConversionReturns")
private Integer twoPointConversionReturns;
@JsonProperty("OpponentTwoPointConversionReturns")
private Integer opponentTwoPointConversionReturns;
@JsonProperty("TeamID")
private Integer teamID;
@JsonProperty("OpponentID")
private Integer opponentID;
@JsonProperty("Day")
private String day;
@JsonProperty("DateTime")
private String dateTime;
@JsonProperty("GlobalGameID")
private Integer globalGameID;
@JsonProperty("GlobalTeamID")
private Integer globalTeamID;
@JsonProperty("GlobalOpponentID")
private Integer globalOpponentID;
@JsonProperty("ScoreID")
private Integer scoreID;
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

@JsonProperty("Date")
public String getDate() {
return date;
}

@JsonProperty("Date")
public void setDate(String date) {
this.date = date;
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

@JsonProperty("Team")
public String getTeam() {
return team;
}

@JsonProperty("Team")
public void setTeam(String team) {
this.team = team;
}

@JsonProperty("Opponent")
public String getOpponent() {
return opponent;
}

@JsonProperty("Opponent")
public void setOpponent(String opponent) {
this.opponent = opponent;
}

@JsonProperty("HomeOrAway")
public String getHomeOrAway() {
return homeOrAway;
}

@JsonProperty("HomeOrAway")
public void setHomeOrAway(String homeOrAway) {
this.homeOrAway = homeOrAway;
}

@JsonProperty("Score")
public Integer getScore() {
return score;
}

@JsonProperty("Score")
public void setScore(Integer score) {
this.score = score;
}

@JsonProperty("OpponentScore")
public Integer getOpponentScore() {
return opponentScore;
}

@JsonProperty("OpponentScore")
public void setOpponentScore(Integer opponentScore) {
this.opponentScore = opponentScore;
}

@JsonProperty("TotalScore")
public Integer getTotalScore() {
return totalScore;
}

@JsonProperty("TotalScore")
public void setTotalScore(Integer totalScore) {
this.totalScore = totalScore;
}

@JsonProperty("Stadium")
public String getStadium() {
return stadium;
}

@JsonProperty("Stadium")
public void setStadium(String stadium) {
this.stadium = stadium;
}

@JsonProperty("PlayingSurface")
public String getPlayingSurface() {
return playingSurface;
}

@JsonProperty("PlayingSurface")
public void setPlayingSurface(String playingSurface) {
this.playingSurface = playingSurface;
}

@JsonProperty("Temperature")
public Integer getTemperature() {
return temperature;
}

@JsonProperty("Temperature")
public void setTemperature(Integer temperature) {
this.temperature = temperature;
}

@JsonProperty("Humidity")
public Integer getHumidity() {
return humidity;
}

@JsonProperty("Humidity")
public void setHumidity(Integer humidity) {
this.humidity = humidity;
}

@JsonProperty("WindSpeed")
public Integer getWindSpeed() {
return windSpeed;
}

@JsonProperty("WindSpeed")
public void setWindSpeed(Integer windSpeed) {
this.windSpeed = windSpeed;
}

@JsonProperty("OverUnder")
public Double getOverUnder() {
return overUnder;
}

@JsonProperty("OverUnder")
public void setOverUnder(Double overUnder) {
this.overUnder = overUnder;
}

@JsonProperty("PointSpread")
public Double getPointSpread() {
return pointSpread;
}

@JsonProperty("PointSpread")
public void setPointSpread(Double pointSpread) {
this.pointSpread = pointSpread;
}

@JsonProperty("ScoreQuarter1")
public Integer getScoreQuarter1() {
return scoreQuarter1;
}

@JsonProperty("ScoreQuarter1")
public void setScoreQuarter1(Integer scoreQuarter1) {
this.scoreQuarter1 = scoreQuarter1;
}

@JsonProperty("ScoreQuarter2")
public Integer getScoreQuarter2() {
return scoreQuarter2;
}

@JsonProperty("ScoreQuarter2")
public void setScoreQuarter2(Integer scoreQuarter2) {
this.scoreQuarter2 = scoreQuarter2;
}

@JsonProperty("ScoreQuarter3")
public Integer getScoreQuarter3() {
return scoreQuarter3;
}

@JsonProperty("ScoreQuarter3")
public void setScoreQuarter3(Integer scoreQuarter3) {
this.scoreQuarter3 = scoreQuarter3;
}

@JsonProperty("ScoreQuarter4")
public Integer getScoreQuarter4() {
return scoreQuarter4;
}

@JsonProperty("ScoreQuarter4")
public void setScoreQuarter4(Integer scoreQuarter4) {
this.scoreQuarter4 = scoreQuarter4;
}

@JsonProperty("ScoreOvertime")
public Integer getScoreOvertime() {
return scoreOvertime;
}

@JsonProperty("ScoreOvertime")
public void setScoreOvertime(Integer scoreOvertime) {
this.scoreOvertime = scoreOvertime;
}

@JsonProperty("TimeOfPossessionMinutes")
public Integer getTimeOfPossessionMinutes() {
return timeOfPossessionMinutes;
}

@JsonProperty("TimeOfPossessionMinutes")
public void setTimeOfPossessionMinutes(Integer timeOfPossessionMinutes) {
this.timeOfPossessionMinutes = timeOfPossessionMinutes;
}

@JsonProperty("TimeOfPossessionSeconds")
public Integer getTimeOfPossessionSeconds() {
return timeOfPossessionSeconds;
}

@JsonProperty("TimeOfPossessionSeconds")
public void setTimeOfPossessionSeconds(Integer timeOfPossessionSeconds) {
this.timeOfPossessionSeconds = timeOfPossessionSeconds;
}

@JsonProperty("TimeOfPossession")
public String getTimeOfPossession() {
return timeOfPossession;
}

@JsonProperty("TimeOfPossession")
public void setTimeOfPossession(String timeOfPossession) {
this.timeOfPossession = timeOfPossession;
}

@JsonProperty("FirstDowns")
public Integer getFirstDowns() {
return firstDowns;
}

@JsonProperty("FirstDowns")
public void setFirstDowns(Integer firstDowns) {
this.firstDowns = firstDowns;
}

@JsonProperty("FirstDownsByRushing")
public Integer getFirstDownsByRushing() {
return firstDownsByRushing;
}

@JsonProperty("FirstDownsByRushing")
public void setFirstDownsByRushing(Integer firstDownsByRushing) {
this.firstDownsByRushing = firstDownsByRushing;
}

@JsonProperty("FirstDownsByPassing")
public Integer getFirstDownsByPassing() {
return firstDownsByPassing;
}

@JsonProperty("FirstDownsByPassing")
public void setFirstDownsByPassing(Integer firstDownsByPassing) {
this.firstDownsByPassing = firstDownsByPassing;
}

@JsonProperty("FirstDownsByPenalty")
public Integer getFirstDownsByPenalty() {
return firstDownsByPenalty;
}

@JsonProperty("FirstDownsByPenalty")
public void setFirstDownsByPenalty(Integer firstDownsByPenalty) {
this.firstDownsByPenalty = firstDownsByPenalty;
}

@JsonProperty("OffensivePlays")
public Integer getOffensivePlays() {
return offensivePlays;
}

@JsonProperty("OffensivePlays")
public void setOffensivePlays(Integer offensivePlays) {
this.offensivePlays = offensivePlays;
}

@JsonProperty("OffensiveYards")
public Integer getOffensiveYards() {
return offensiveYards;
}

@JsonProperty("OffensiveYards")
public void setOffensiveYards(Integer offensiveYards) {
this.offensiveYards = offensiveYards;
}

@JsonProperty("OffensiveYardsPerPlay")
public Double getOffensiveYardsPerPlay() {
return offensiveYardsPerPlay;
}

@JsonProperty("OffensiveYardsPerPlay")
public void setOffensiveYardsPerPlay(Double offensiveYardsPerPlay) {
this.offensiveYardsPerPlay = offensiveYardsPerPlay;
}

@JsonProperty("Touchdowns")
public Integer getTouchdowns() {
return touchdowns;
}

@JsonProperty("Touchdowns")
public void setTouchdowns(Integer touchdowns) {
this.touchdowns = touchdowns;
}

@JsonProperty("RushingAttempts")
public Integer getRushingAttempts() {
return rushingAttempts;
}

@JsonProperty("RushingAttempts")
public void setRushingAttempts(Integer rushingAttempts) {
this.rushingAttempts = rushingAttempts;
}

@JsonProperty("RushingYards")
public Integer getRushingYards() {
return rushingYards;
}

@JsonProperty("RushingYards")
public void setRushingYards(Integer rushingYards) {
this.rushingYards = rushingYards;
}

@JsonProperty("RushingYardsPerAttempt")
public Double getRushingYardsPerAttempt() {
return rushingYardsPerAttempt;
}

@JsonProperty("RushingYardsPerAttempt")
public void setRushingYardsPerAttempt(Double rushingYardsPerAttempt) {
this.rushingYardsPerAttempt = rushingYardsPerAttempt;
}

@JsonProperty("RushingTouchdowns")
public Integer getRushingTouchdowns() {
return rushingTouchdowns;
}

@JsonProperty("RushingTouchdowns")
public void setRushingTouchdowns(Integer rushingTouchdowns) {
this.rushingTouchdowns = rushingTouchdowns;
}

@JsonProperty("PassingAttempts")
public Integer getPassingAttempts() {
return passingAttempts;
}

@JsonProperty("PassingAttempts")
public void setPassingAttempts(Integer passingAttempts) {
this.passingAttempts = passingAttempts;
}

@JsonProperty("PassingCompletions")
public Integer getPassingCompletions() {
return passingCompletions;
}

@JsonProperty("PassingCompletions")
public void setPassingCompletions(Integer passingCompletions) {
this.passingCompletions = passingCompletions;
}

@JsonProperty("PassingYards")
public Integer getPassingYards() {
return passingYards;
}

@JsonProperty("PassingYards")
public void setPassingYards(Integer passingYards) {
this.passingYards = passingYards;
}

@JsonProperty("PassingTouchdowns")
public Integer getPassingTouchdowns() {
return passingTouchdowns;
}

@JsonProperty("PassingTouchdowns")
public void setPassingTouchdowns(Integer passingTouchdowns) {
this.passingTouchdowns = passingTouchdowns;
}

@JsonProperty("PassingInterceptions")
public Integer getPassingInterceptions() {
return passingInterceptions;
}

@JsonProperty("PassingInterceptions")
public void setPassingInterceptions(Integer passingInterceptions) {
this.passingInterceptions = passingInterceptions;
}

@JsonProperty("PassingYardsPerAttempt")
public Double getPassingYardsPerAttempt() {
return passingYardsPerAttempt;
}

@JsonProperty("PassingYardsPerAttempt")
public void setPassingYardsPerAttempt(Double passingYardsPerAttempt) {
this.passingYardsPerAttempt = passingYardsPerAttempt;
}

@JsonProperty("PassingYardsPerCompletion")
public Double getPassingYardsPerCompletion() {
return passingYardsPerCompletion;
}

@JsonProperty("PassingYardsPerCompletion")
public void setPassingYardsPerCompletion(Double passingYardsPerCompletion) {
this.passingYardsPerCompletion = passingYardsPerCompletion;
}

@JsonProperty("CompletionPercentage")
public Double getCompletionPercentage() {
return completionPercentage;
}

@JsonProperty("CompletionPercentage")
public void setCompletionPercentage(Double completionPercentage) {
this.completionPercentage = completionPercentage;
}

@JsonProperty("PasserRating")
public Double getPasserRating() {
return passerRating;
}

@JsonProperty("PasserRating")
public void setPasserRating(Double passerRating) {
this.passerRating = passerRating;
}

@JsonProperty("ThirdDownAttempts")
public Integer getThirdDownAttempts() {
return thirdDownAttempts;
}

@JsonProperty("ThirdDownAttempts")
public void setThirdDownAttempts(Integer thirdDownAttempts) {
this.thirdDownAttempts = thirdDownAttempts;
}

@JsonProperty("ThirdDownConversions")
public Integer getThirdDownConversions() {
return thirdDownConversions;
}

@JsonProperty("ThirdDownConversions")
public void setThirdDownConversions(Integer thirdDownConversions) {
this.thirdDownConversions = thirdDownConversions;
}

@JsonProperty("ThirdDownPercentage")
public Double getThirdDownPercentage() {
return thirdDownPercentage;
}

@JsonProperty("ThirdDownPercentage")
public void setThirdDownPercentage(Double thirdDownPercentage) {
this.thirdDownPercentage = thirdDownPercentage;
}

@JsonProperty("FourthDownAttempts")
public Integer getFourthDownAttempts() {
return fourthDownAttempts;
}

@JsonProperty("FourthDownAttempts")
public void setFourthDownAttempts(Integer fourthDownAttempts) {
this.fourthDownAttempts = fourthDownAttempts;
}

@JsonProperty("FourthDownConversions")
public Integer getFourthDownConversions() {
return fourthDownConversions;
}

@JsonProperty("FourthDownConversions")
public void setFourthDownConversions(Integer fourthDownConversions) {
this.fourthDownConversions = fourthDownConversions;
}

@JsonProperty("FourthDownPercentage")
public Double getFourthDownPercentage() {
return fourthDownPercentage;
}

@JsonProperty("FourthDownPercentage")
public void setFourthDownPercentage(Double fourthDownPercentage) {
this.fourthDownPercentage = fourthDownPercentage;
}

@JsonProperty("RedZoneAttempts")
public Integer getRedZoneAttempts() {
return redZoneAttempts;
}

@JsonProperty("RedZoneAttempts")
public void setRedZoneAttempts(Integer redZoneAttempts) {
this.redZoneAttempts = redZoneAttempts;
}

@JsonProperty("RedZoneConversions")
public Integer getRedZoneConversions() {
return redZoneConversions;
}

@JsonProperty("RedZoneConversions")
public void setRedZoneConversions(Integer redZoneConversions) {
this.redZoneConversions = redZoneConversions;
}

@JsonProperty("GoalToGoAttempts")
public Integer getGoalToGoAttempts() {
return goalToGoAttempts;
}

@JsonProperty("GoalToGoAttempts")
public void setGoalToGoAttempts(Integer goalToGoAttempts) {
this.goalToGoAttempts = goalToGoAttempts;
}

@JsonProperty("GoalToGoConversions")
public Integer getGoalToGoConversions() {
return goalToGoConversions;
}

@JsonProperty("GoalToGoConversions")
public void setGoalToGoConversions(Integer goalToGoConversions) {
this.goalToGoConversions = goalToGoConversions;
}

@JsonProperty("ReturnYards")
public Integer getReturnYards() {
return returnYards;
}

@JsonProperty("ReturnYards")
public void setReturnYards(Integer returnYards) {
this.returnYards = returnYards;
}

@JsonProperty("Penalties")
public Integer getPenalties() {
return penalties;
}

@JsonProperty("Penalties")
public void setPenalties(Integer penalties) {
this.penalties = penalties;
}

@JsonProperty("PenaltyYards")
public Integer getPenaltyYards() {
return penaltyYards;
}

@JsonProperty("PenaltyYards")
public void setPenaltyYards(Integer penaltyYards) {
this.penaltyYards = penaltyYards;
}

@JsonProperty("Fumbles")
public Integer getFumbles() {
return fumbles;
}

@JsonProperty("Fumbles")
public void setFumbles(Integer fumbles) {
this.fumbles = fumbles;
}

@JsonProperty("FumblesLost")
public Integer getFumblesLost() {
return fumblesLost;
}

@JsonProperty("FumblesLost")
public void setFumblesLost(Integer fumblesLost) {
this.fumblesLost = fumblesLost;
}

@JsonProperty("TimesSacked")
public Integer getTimesSacked() {
return timesSacked;
}

@JsonProperty("TimesSacked")
public void setTimesSacked(Integer timesSacked) {
this.timesSacked = timesSacked;
}

@JsonProperty("TimesSackedYards")
public Integer getTimesSackedYards() {
return timesSackedYards;
}

@JsonProperty("TimesSackedYards")
public void setTimesSackedYards(Integer timesSackedYards) {
this.timesSackedYards = timesSackedYards;
}

@JsonProperty("QuarterbackHits")
public Integer getQuarterbackHits() {
return quarterbackHits;
}

@JsonProperty("QuarterbackHits")
public void setQuarterbackHits(Integer quarterbackHits) {
this.quarterbackHits = quarterbackHits;
}

@JsonProperty("TacklesForLoss")
public Integer getTacklesForLoss() {
return tacklesForLoss;
}

@JsonProperty("TacklesForLoss")
public void setTacklesForLoss(Integer tacklesForLoss) {
this.tacklesForLoss = tacklesForLoss;
}

@JsonProperty("Safeties")
public Integer getSafeties() {
return safeties;
}

@JsonProperty("Safeties")
public void setSafeties(Integer safeties) {
this.safeties = safeties;
}

@JsonProperty("Punts")
public Integer getPunts() {
return punts;
}

@JsonProperty("Punts")
public void setPunts(Integer punts) {
this.punts = punts;
}

@JsonProperty("PuntYards")
public Integer getPuntYards() {
return puntYards;
}

@JsonProperty("PuntYards")
public void setPuntYards(Integer puntYards) {
this.puntYards = puntYards;
}

@JsonProperty("PuntAverage")
public Double getPuntAverage() {
return puntAverage;
}

@JsonProperty("PuntAverage")
public void setPuntAverage(Double puntAverage) {
this.puntAverage = puntAverage;
}

@JsonProperty("Giveaways")
public Integer getGiveaways() {
return giveaways;
}

@JsonProperty("Giveaways")
public void setGiveaways(Integer giveaways) {
this.giveaways = giveaways;
}

@JsonProperty("Takeaways")
public Integer getTakeaways() {
return takeaways;
}

@JsonProperty("Takeaways")
public void setTakeaways(Integer takeaways) {
this.takeaways = takeaways;
}

@JsonProperty("TurnoverDifferential")
public Integer getTurnoverDifferential() {
return turnoverDifferential;
}

@JsonProperty("TurnoverDifferential")
public void setTurnoverDifferential(Integer turnoverDifferential) {
this.turnoverDifferential = turnoverDifferential;
}

@JsonProperty("OpponentScoreQuarter1")
public Integer getOpponentScoreQuarter1() {
return opponentScoreQuarter1;
}

@JsonProperty("OpponentScoreQuarter1")
public void setOpponentScoreQuarter1(Integer opponentScoreQuarter1) {
this.opponentScoreQuarter1 = opponentScoreQuarter1;
}

@JsonProperty("OpponentScoreQuarter2")
public Integer getOpponentScoreQuarter2() {
return opponentScoreQuarter2;
}

@JsonProperty("OpponentScoreQuarter2")
public void setOpponentScoreQuarter2(Integer opponentScoreQuarter2) {
this.opponentScoreQuarter2 = opponentScoreQuarter2;
}

@JsonProperty("OpponentScoreQuarter3")
public Integer getOpponentScoreQuarter3() {
return opponentScoreQuarter3;
}

@JsonProperty("OpponentScoreQuarter3")
public void setOpponentScoreQuarter3(Integer opponentScoreQuarter3) {
this.opponentScoreQuarter3 = opponentScoreQuarter3;
}

@JsonProperty("OpponentScoreQuarter4")
public Integer getOpponentScoreQuarter4() {
return opponentScoreQuarter4;
}

@JsonProperty("OpponentScoreQuarter4")
public void setOpponentScoreQuarter4(Integer opponentScoreQuarter4) {
this.opponentScoreQuarter4 = opponentScoreQuarter4;
}

@JsonProperty("OpponentScoreOvertime")
public Integer getOpponentScoreOvertime() {
return opponentScoreOvertime;
}

@JsonProperty("OpponentScoreOvertime")
public void setOpponentScoreOvertime(Integer opponentScoreOvertime) {
this.opponentScoreOvertime = opponentScoreOvertime;
}

@JsonProperty("OpponentTimeOfPossessionMinutes")
public Integer getOpponentTimeOfPossessionMinutes() {
return opponentTimeOfPossessionMinutes;
}

@JsonProperty("OpponentTimeOfPossessionMinutes")
public void setOpponentTimeOfPossessionMinutes(Integer opponentTimeOfPossessionMinutes) {
this.opponentTimeOfPossessionMinutes = opponentTimeOfPossessionMinutes;
}

@JsonProperty("OpponentTimeOfPossessionSeconds")
public Integer getOpponentTimeOfPossessionSeconds() {
return opponentTimeOfPossessionSeconds;
}

@JsonProperty("OpponentTimeOfPossessionSeconds")
public void setOpponentTimeOfPossessionSeconds(Integer opponentTimeOfPossessionSeconds) {
this.opponentTimeOfPossessionSeconds = opponentTimeOfPossessionSeconds;
}

@JsonProperty("OpponentTimeOfPossession")
public String getOpponentTimeOfPossession() {
return opponentTimeOfPossession;
}

@JsonProperty("OpponentTimeOfPossession")
public void setOpponentTimeOfPossession(String opponentTimeOfPossession) {
this.opponentTimeOfPossession = opponentTimeOfPossession;
}

@JsonProperty("OpponentFirstDowns")
public Integer getOpponentFirstDowns() {
return opponentFirstDowns;
}

@JsonProperty("OpponentFirstDowns")
public void setOpponentFirstDowns(Integer opponentFirstDowns) {
this.opponentFirstDowns = opponentFirstDowns;
}

@JsonProperty("OpponentFirstDownsByRushing")
public Integer getOpponentFirstDownsByRushing() {
return opponentFirstDownsByRushing;
}

@JsonProperty("OpponentFirstDownsByRushing")
public void setOpponentFirstDownsByRushing(Integer opponentFirstDownsByRushing) {
this.opponentFirstDownsByRushing = opponentFirstDownsByRushing;
}

@JsonProperty("OpponentFirstDownsByPassing")
public Integer getOpponentFirstDownsByPassing() {
return opponentFirstDownsByPassing;
}

@JsonProperty("OpponentFirstDownsByPassing")
public void setOpponentFirstDownsByPassing(Integer opponentFirstDownsByPassing) {
this.opponentFirstDownsByPassing = opponentFirstDownsByPassing;
}

@JsonProperty("OpponentFirstDownsByPenalty")
public Integer getOpponentFirstDownsByPenalty() {
return opponentFirstDownsByPenalty;
}

@JsonProperty("OpponentFirstDownsByPenalty")
public void setOpponentFirstDownsByPenalty(Integer opponentFirstDownsByPenalty) {
this.opponentFirstDownsByPenalty = opponentFirstDownsByPenalty;
}

@JsonProperty("OpponentOffensivePlays")
public Integer getOpponentOffensivePlays() {
return opponentOffensivePlays;
}

@JsonProperty("OpponentOffensivePlays")
public void setOpponentOffensivePlays(Integer opponentOffensivePlays) {
this.opponentOffensivePlays = opponentOffensivePlays;
}

@JsonProperty("OpponentOffensiveYards")
public Integer getOpponentOffensiveYards() {
return opponentOffensiveYards;
}

@JsonProperty("OpponentOffensiveYards")
public void setOpponentOffensiveYards(Integer opponentOffensiveYards) {
this.opponentOffensiveYards = opponentOffensiveYards;
}

@JsonProperty("OpponentOffensiveYardsPerPlay")
public Double getOpponentOffensiveYardsPerPlay() {
return opponentOffensiveYardsPerPlay;
}

@JsonProperty("OpponentOffensiveYardsPerPlay")
public void setOpponentOffensiveYardsPerPlay(Double opponentOffensiveYardsPerPlay) {
this.opponentOffensiveYardsPerPlay = opponentOffensiveYardsPerPlay;
}

@JsonProperty("OpponentTouchdowns")
public Integer getOpponentTouchdowns() {
return opponentTouchdowns;
}

@JsonProperty("OpponentTouchdowns")
public void setOpponentTouchdowns(Integer opponentTouchdowns) {
this.opponentTouchdowns = opponentTouchdowns;
}

@JsonProperty("OpponentRushingAttempts")
public Integer getOpponentRushingAttempts() {
return opponentRushingAttempts;
}

@JsonProperty("OpponentRushingAttempts")
public void setOpponentRushingAttempts(Integer opponentRushingAttempts) {
this.opponentRushingAttempts = opponentRushingAttempts;
}

@JsonProperty("OpponentRushingYards")
public Integer getOpponentRushingYards() {
return opponentRushingYards;
}

@JsonProperty("OpponentRushingYards")
public void setOpponentRushingYards(Integer opponentRushingYards) {
this.opponentRushingYards = opponentRushingYards;
}

@JsonProperty("OpponentRushingYardsPerAttempt")
public Double getOpponentRushingYardsPerAttempt() {
return opponentRushingYardsPerAttempt;
}

@JsonProperty("OpponentRushingYardsPerAttempt")
public void setOpponentRushingYardsPerAttempt(Double opponentRushingYardsPerAttempt) {
this.opponentRushingYardsPerAttempt = opponentRushingYardsPerAttempt;
}

@JsonProperty("OpponentRushingTouchdowns")
public Integer getOpponentRushingTouchdowns() {
return opponentRushingTouchdowns;
}

@JsonProperty("OpponentRushingTouchdowns")
public void setOpponentRushingTouchdowns(Integer opponentRushingTouchdowns) {
this.opponentRushingTouchdowns = opponentRushingTouchdowns;
}

@JsonProperty("OpponentPassingAttempts")
public Integer getOpponentPassingAttempts() {
return opponentPassingAttempts;
}

@JsonProperty("OpponentPassingAttempts")
public void setOpponentPassingAttempts(Integer opponentPassingAttempts) {
this.opponentPassingAttempts = opponentPassingAttempts;
}

@JsonProperty("OpponentPassingCompletions")
public Integer getOpponentPassingCompletions() {
return opponentPassingCompletions;
}

@JsonProperty("OpponentPassingCompletions")
public void setOpponentPassingCompletions(Integer opponentPassingCompletions) {
this.opponentPassingCompletions = opponentPassingCompletions;
}

@JsonProperty("OpponentPassingYards")
public Integer getOpponentPassingYards() {
return opponentPassingYards;
}

@JsonProperty("OpponentPassingYards")
public void setOpponentPassingYards(Integer opponentPassingYards) {
this.opponentPassingYards = opponentPassingYards;
}

@JsonProperty("OpponentPassingTouchdowns")
public Integer getOpponentPassingTouchdowns() {
return opponentPassingTouchdowns;
}

@JsonProperty("OpponentPassingTouchdowns")
public void setOpponentPassingTouchdowns(Integer opponentPassingTouchdowns) {
this.opponentPassingTouchdowns = opponentPassingTouchdowns;
}

@JsonProperty("OpponentPassingInterceptions")
public Integer getOpponentPassingInterceptions() {
return opponentPassingInterceptions;
}

@JsonProperty("OpponentPassingInterceptions")
public void setOpponentPassingInterceptions(Integer opponentPassingInterceptions) {
this.opponentPassingInterceptions = opponentPassingInterceptions;
}

@JsonProperty("OpponentPassingYardsPerAttempt")
public Double getOpponentPassingYardsPerAttempt() {
return opponentPassingYardsPerAttempt;
}

@JsonProperty("OpponentPassingYardsPerAttempt")
public void setOpponentPassingYardsPerAttempt(Double opponentPassingYardsPerAttempt) {
this.opponentPassingYardsPerAttempt = opponentPassingYardsPerAttempt;
}

@JsonProperty("OpponentPassingYardsPerCompletion")
public Double getOpponentPassingYardsPerCompletion() {
return opponentPassingYardsPerCompletion;
}

@JsonProperty("OpponentPassingYardsPerCompletion")
public void setOpponentPassingYardsPerCompletion(Double opponentPassingYardsPerCompletion) {
this.opponentPassingYardsPerCompletion = opponentPassingYardsPerCompletion;
}

@JsonProperty("OpponentCompletionPercentage")
public Double getOpponentCompletionPercentage() {
return opponentCompletionPercentage;
}

@JsonProperty("OpponentCompletionPercentage")
public void setOpponentCompletionPercentage(Double opponentCompletionPercentage) {
this.opponentCompletionPercentage = opponentCompletionPercentage;
}

@JsonProperty("OpponentPasserRating")
public Double getOpponentPasserRating() {
return opponentPasserRating;
}

@JsonProperty("OpponentPasserRating")
public void setOpponentPasserRating(Double opponentPasserRating) {
this.opponentPasserRating = opponentPasserRating;
}

@JsonProperty("OpponentThirdDownAttempts")
public Integer getOpponentThirdDownAttempts() {
return opponentThirdDownAttempts;
}

@JsonProperty("OpponentThirdDownAttempts")
public void setOpponentThirdDownAttempts(Integer opponentThirdDownAttempts) {
this.opponentThirdDownAttempts = opponentThirdDownAttempts;
}

@JsonProperty("OpponentThirdDownConversions")
public Integer getOpponentThirdDownConversions() {
return opponentThirdDownConversions;
}

@JsonProperty("OpponentThirdDownConversions")
public void setOpponentThirdDownConversions(Integer opponentThirdDownConversions) {
this.opponentThirdDownConversions = opponentThirdDownConversions;
}

@JsonProperty("OpponentThirdDownPercentage")
public Double getOpponentThirdDownPercentage() {
return opponentThirdDownPercentage;
}

@JsonProperty("OpponentThirdDownPercentage")
public void setOpponentThirdDownPercentage(Double opponentThirdDownPercentage) {
this.opponentThirdDownPercentage = opponentThirdDownPercentage;
}

@JsonProperty("OpponentFourthDownAttempts")
public Integer getOpponentFourthDownAttempts() {
return opponentFourthDownAttempts;
}

@JsonProperty("OpponentFourthDownAttempts")
public void setOpponentFourthDownAttempts(Integer opponentFourthDownAttempts) {
this.opponentFourthDownAttempts = opponentFourthDownAttempts;
}

@JsonProperty("OpponentFourthDownConversions")
public Integer getOpponentFourthDownConversions() {
return opponentFourthDownConversions;
}

@JsonProperty("OpponentFourthDownConversions")
public void setOpponentFourthDownConversions(Integer opponentFourthDownConversions) {
this.opponentFourthDownConversions = opponentFourthDownConversions;
}

@JsonProperty("OpponentFourthDownPercentage")
public Double getOpponentFourthDownPercentage() {
return opponentFourthDownPercentage;
}

@JsonProperty("OpponentFourthDownPercentage")
public void setOpponentFourthDownPercentage(Double opponentFourthDownPercentage) {
this.opponentFourthDownPercentage = opponentFourthDownPercentage;
}

@JsonProperty("OpponentRedZoneAttempts")
public Integer getOpponentRedZoneAttempts() {
return opponentRedZoneAttempts;
}

@JsonProperty("OpponentRedZoneAttempts")
public void setOpponentRedZoneAttempts(Integer opponentRedZoneAttempts) {
this.opponentRedZoneAttempts = opponentRedZoneAttempts;
}

@JsonProperty("OpponentRedZoneConversions")
public Integer getOpponentRedZoneConversions() {
return opponentRedZoneConversions;
}

@JsonProperty("OpponentRedZoneConversions")
public void setOpponentRedZoneConversions(Integer opponentRedZoneConversions) {
this.opponentRedZoneConversions = opponentRedZoneConversions;
}

@JsonProperty("OpponentGoalToGoAttempts")
public Integer getOpponentGoalToGoAttempts() {
return opponentGoalToGoAttempts;
}

@JsonProperty("OpponentGoalToGoAttempts")
public void setOpponentGoalToGoAttempts(Integer opponentGoalToGoAttempts) {
this.opponentGoalToGoAttempts = opponentGoalToGoAttempts;
}

@JsonProperty("OpponentGoalToGoConversions")
public Integer getOpponentGoalToGoConversions() {
return opponentGoalToGoConversions;
}

@JsonProperty("OpponentGoalToGoConversions")
public void setOpponentGoalToGoConversions(Integer opponentGoalToGoConversions) {
this.opponentGoalToGoConversions = opponentGoalToGoConversions;
}

@JsonProperty("OpponentReturnYards")
public Integer getOpponentReturnYards() {
return opponentReturnYards;
}

@JsonProperty("OpponentReturnYards")
public void setOpponentReturnYards(Integer opponentReturnYards) {
this.opponentReturnYards = opponentReturnYards;
}

@JsonProperty("OpponentPenalties")
public Integer getOpponentPenalties() {
return opponentPenalties;
}

@JsonProperty("OpponentPenalties")
public void setOpponentPenalties(Integer opponentPenalties) {
this.opponentPenalties = opponentPenalties;
}

@JsonProperty("OpponentPenaltyYards")
public Integer getOpponentPenaltyYards() {
return opponentPenaltyYards;
}

@JsonProperty("OpponentPenaltyYards")
public void setOpponentPenaltyYards(Integer opponentPenaltyYards) {
this.opponentPenaltyYards = opponentPenaltyYards;
}

@JsonProperty("OpponentFumbles")
public Integer getOpponentFumbles() {
return opponentFumbles;
}

@JsonProperty("OpponentFumbles")
public void setOpponentFumbles(Integer opponentFumbles) {
this.opponentFumbles = opponentFumbles;
}

@JsonProperty("OpponentFumblesLost")
public Integer getOpponentFumblesLost() {
return opponentFumblesLost;
}

@JsonProperty("OpponentFumblesLost")
public void setOpponentFumblesLost(Integer opponentFumblesLost) {
this.opponentFumblesLost = opponentFumblesLost;
}

@JsonProperty("OpponentTimesSacked")
public Integer getOpponentTimesSacked() {
return opponentTimesSacked;
}

@JsonProperty("OpponentTimesSacked")
public void setOpponentTimesSacked(Integer opponentTimesSacked) {
this.opponentTimesSacked = opponentTimesSacked;
}

@JsonProperty("OpponentTimesSackedYards")
public Integer getOpponentTimesSackedYards() {
return opponentTimesSackedYards;
}

@JsonProperty("OpponentTimesSackedYards")
public void setOpponentTimesSackedYards(Integer opponentTimesSackedYards) {
this.opponentTimesSackedYards = opponentTimesSackedYards;
}

@JsonProperty("OpponentQuarterbackHits")
public Integer getOpponentQuarterbackHits() {
return opponentQuarterbackHits;
}

@JsonProperty("OpponentQuarterbackHits")
public void setOpponentQuarterbackHits(Integer opponentQuarterbackHits) {
this.opponentQuarterbackHits = opponentQuarterbackHits;
}

@JsonProperty("OpponentTacklesForLoss")
public Integer getOpponentTacklesForLoss() {
return opponentTacklesForLoss;
}

@JsonProperty("OpponentTacklesForLoss")
public void setOpponentTacklesForLoss(Integer opponentTacklesForLoss) {
this.opponentTacklesForLoss = opponentTacklesForLoss;
}

@JsonProperty("OpponentSafeties")
public Integer getOpponentSafeties() {
return opponentSafeties;
}

@JsonProperty("OpponentSafeties")
public void setOpponentSafeties(Integer opponentSafeties) {
this.opponentSafeties = opponentSafeties;
}

@JsonProperty("OpponentPunts")
public Integer getOpponentPunts() {
return opponentPunts;
}

@JsonProperty("OpponentPunts")
public void setOpponentPunts(Integer opponentPunts) {
this.opponentPunts = opponentPunts;
}

@JsonProperty("OpponentPuntYards")
public Integer getOpponentPuntYards() {
return opponentPuntYards;
}

@JsonProperty("OpponentPuntYards")
public void setOpponentPuntYards(Integer opponentPuntYards) {
this.opponentPuntYards = opponentPuntYards;
}

@JsonProperty("OpponentPuntAverage")
public Double getOpponentPuntAverage() {
return opponentPuntAverage;
}

@JsonProperty("OpponentPuntAverage")
public void setOpponentPuntAverage(Double opponentPuntAverage) {
this.opponentPuntAverage = opponentPuntAverage;
}

@JsonProperty("OpponentGiveaways")
public Integer getOpponentGiveaways() {
return opponentGiveaways;
}

@JsonProperty("OpponentGiveaways")
public void setOpponentGiveaways(Integer opponentGiveaways) {
this.opponentGiveaways = opponentGiveaways;
}

@JsonProperty("OpponentTakeaways")
public Integer getOpponentTakeaways() {
return opponentTakeaways;
}

@JsonProperty("OpponentTakeaways")
public void setOpponentTakeaways(Integer opponentTakeaways) {
this.opponentTakeaways = opponentTakeaways;
}

@JsonProperty("OpponentTurnoverDifferential")
public Integer getOpponentTurnoverDifferential() {
return opponentTurnoverDifferential;
}

@JsonProperty("OpponentTurnoverDifferential")
public void setOpponentTurnoverDifferential(Integer opponentTurnoverDifferential) {
this.opponentTurnoverDifferential = opponentTurnoverDifferential;
}

@JsonProperty("RedZonePercentage")
public Double getRedZonePercentage() {
return redZonePercentage;
}

@JsonProperty("RedZonePercentage")
public void setRedZonePercentage(Double redZonePercentage) {
this.redZonePercentage = redZonePercentage;
}

@JsonProperty("GoalToGoPercentage")
public Double getGoalToGoPercentage() {
return goalToGoPercentage;
}

@JsonProperty("GoalToGoPercentage")
public void setGoalToGoPercentage(Double goalToGoPercentage) {
this.goalToGoPercentage = goalToGoPercentage;
}

@JsonProperty("QuarterbackHitsDifferential")
public Integer getQuarterbackHitsDifferential() {
return quarterbackHitsDifferential;
}

@JsonProperty("QuarterbackHitsDifferential")
public void setQuarterbackHitsDifferential(Integer quarterbackHitsDifferential) {
this.quarterbackHitsDifferential = quarterbackHitsDifferential;
}

@JsonProperty("TacklesForLossDifferential")
public Integer getTacklesForLossDifferential() {
return tacklesForLossDifferential;
}

@JsonProperty("TacklesForLossDifferential")
public void setTacklesForLossDifferential(Integer tacklesForLossDifferential) {
this.tacklesForLossDifferential = tacklesForLossDifferential;
}

@JsonProperty("QuarterbackSacksDifferential")
public Integer getQuarterbackSacksDifferential() {
return quarterbackSacksDifferential;
}

@JsonProperty("QuarterbackSacksDifferential")
public void setQuarterbackSacksDifferential(Integer quarterbackSacksDifferential) {
this.quarterbackSacksDifferential = quarterbackSacksDifferential;
}

@JsonProperty("TacklesForLossPercentage")
public Double getTacklesForLossPercentage() {
return tacklesForLossPercentage;
}

@JsonProperty("TacklesForLossPercentage")
public void setTacklesForLossPercentage(Double tacklesForLossPercentage) {
this.tacklesForLossPercentage = tacklesForLossPercentage;
}

@JsonProperty("QuarterbackHitsPercentage")
public Double getQuarterbackHitsPercentage() {
return quarterbackHitsPercentage;
}

@JsonProperty("QuarterbackHitsPercentage")
public void setQuarterbackHitsPercentage(Double quarterbackHitsPercentage) {
this.quarterbackHitsPercentage = quarterbackHitsPercentage;
}

@JsonProperty("TimesSackedPercentage")
public Double getTimesSackedPercentage() {
return timesSackedPercentage;
}

@JsonProperty("TimesSackedPercentage")
public void setTimesSackedPercentage(Double timesSackedPercentage) {
this.timesSackedPercentage = timesSackedPercentage;
}

@JsonProperty("OpponentRedZonePercentage")
public Double getOpponentRedZonePercentage() {
return opponentRedZonePercentage;
}

@JsonProperty("OpponentRedZonePercentage")
public void setOpponentRedZonePercentage(Double opponentRedZonePercentage) {
this.opponentRedZonePercentage = opponentRedZonePercentage;
}

@JsonProperty("OpponentGoalToGoPercentage")
public Double getOpponentGoalToGoPercentage() {
return opponentGoalToGoPercentage;
}

@JsonProperty("OpponentGoalToGoPercentage")
public void setOpponentGoalToGoPercentage(Double opponentGoalToGoPercentage) {
this.opponentGoalToGoPercentage = opponentGoalToGoPercentage;
}

@JsonProperty("OpponentQuarterbackHitsDifferential")
public Integer getOpponentQuarterbackHitsDifferential() {
return opponentQuarterbackHitsDifferential;
}

@JsonProperty("OpponentQuarterbackHitsDifferential")
public void setOpponentQuarterbackHitsDifferential(Integer opponentQuarterbackHitsDifferential) {
this.opponentQuarterbackHitsDifferential = opponentQuarterbackHitsDifferential;
}

@JsonProperty("OpponentTacklesForLossDifferential")
public Integer getOpponentTacklesForLossDifferential() {
return opponentTacklesForLossDifferential;
}

@JsonProperty("OpponentTacklesForLossDifferential")
public void setOpponentTacklesForLossDifferential(Integer opponentTacklesForLossDifferential) {
this.opponentTacklesForLossDifferential = opponentTacklesForLossDifferential;
}

@JsonProperty("OpponentQuarterbackSacksDifferential")
public Integer getOpponentQuarterbackSacksDifferential() {
return opponentQuarterbackSacksDifferential;
}

@JsonProperty("OpponentQuarterbackSacksDifferential")
public void setOpponentQuarterbackSacksDifferential(Integer opponentQuarterbackSacksDifferential) {
this.opponentQuarterbackSacksDifferential = opponentQuarterbackSacksDifferential;
}

@JsonProperty("OpponentTacklesForLossPercentage")
public Double getOpponentTacklesForLossPercentage() {
return opponentTacklesForLossPercentage;
}

@JsonProperty("OpponentTacklesForLossPercentage")
public void setOpponentTacklesForLossPercentage(Double opponentTacklesForLossPercentage) {
this.opponentTacklesForLossPercentage = opponentTacklesForLossPercentage;
}

@JsonProperty("OpponentQuarterbackHitsPercentage")
public Double getOpponentQuarterbackHitsPercentage() {
return opponentQuarterbackHitsPercentage;
}

@JsonProperty("OpponentQuarterbackHitsPercentage")
public void setOpponentQuarterbackHitsPercentage(Double opponentQuarterbackHitsPercentage) {
this.opponentQuarterbackHitsPercentage = opponentQuarterbackHitsPercentage;
}

@JsonProperty("OpponentTimesSackedPercentage")
public Double getOpponentTimesSackedPercentage() {
return opponentTimesSackedPercentage;
}

@JsonProperty("OpponentTimesSackedPercentage")
public void setOpponentTimesSackedPercentage(Double opponentTimesSackedPercentage) {
this.opponentTimesSackedPercentage = opponentTimesSackedPercentage;
}

@JsonProperty("Kickoffs")
public Integer getKickoffs() {
return kickoffs;
}

@JsonProperty("Kickoffs")
public void setKickoffs(Integer kickoffs) {
this.kickoffs = kickoffs;
}

@JsonProperty("KickoffsInEndZone")
public Integer getKickoffsInEndZone() {
return kickoffsInEndZone;
}

@JsonProperty("KickoffsInEndZone")
public void setKickoffsInEndZone(Integer kickoffsInEndZone) {
this.kickoffsInEndZone = kickoffsInEndZone;
}

@JsonProperty("KickoffTouchbacks")
public Integer getKickoffTouchbacks() {
return kickoffTouchbacks;
}

@JsonProperty("KickoffTouchbacks")
public void setKickoffTouchbacks(Integer kickoffTouchbacks) {
this.kickoffTouchbacks = kickoffTouchbacks;
}

@JsonProperty("PuntsHadBlocked")
public Integer getPuntsHadBlocked() {
return puntsHadBlocked;
}

@JsonProperty("PuntsHadBlocked")
public void setPuntsHadBlocked(Integer puntsHadBlocked) {
this.puntsHadBlocked = puntsHadBlocked;
}

@JsonProperty("PuntNetAverage")
public Double getPuntNetAverage() {
return puntNetAverage;
}

@JsonProperty("PuntNetAverage")
public void setPuntNetAverage(Double puntNetAverage) {
this.puntNetAverage = puntNetAverage;
}

@JsonProperty("ExtraPointKickingAttempts")
public Integer getExtraPointKickingAttempts() {
return extraPointKickingAttempts;
}

@JsonProperty("ExtraPointKickingAttempts")
public void setExtraPointKickingAttempts(Integer extraPointKickingAttempts) {
this.extraPointKickingAttempts = extraPointKickingAttempts;
}

@JsonProperty("ExtraPointKickingConversions")
public Integer getExtraPointKickingConversions() {
return extraPointKickingConversions;
}

@JsonProperty("ExtraPointKickingConversions")
public void setExtraPointKickingConversions(Integer extraPointKickingConversions) {
this.extraPointKickingConversions = extraPointKickingConversions;
}

@JsonProperty("ExtraPointsHadBlocked")
public Integer getExtraPointsHadBlocked() {
return extraPointsHadBlocked;
}

@JsonProperty("ExtraPointsHadBlocked")
public void setExtraPointsHadBlocked(Integer extraPointsHadBlocked) {
this.extraPointsHadBlocked = extraPointsHadBlocked;
}

@JsonProperty("ExtraPointPassingAttempts")
public Integer getExtraPointPassingAttempts() {
return extraPointPassingAttempts;
}

@JsonProperty("ExtraPointPassingAttempts")
public void setExtraPointPassingAttempts(Integer extraPointPassingAttempts) {
this.extraPointPassingAttempts = extraPointPassingAttempts;
}

@JsonProperty("ExtraPointPassingConversions")
public Integer getExtraPointPassingConversions() {
return extraPointPassingConversions;
}

@JsonProperty("ExtraPointPassingConversions")
public void setExtraPointPassingConversions(Integer extraPointPassingConversions) {
this.extraPointPassingConversions = extraPointPassingConversions;
}

@JsonProperty("ExtraPointRushingAttempts")
public Integer getExtraPointRushingAttempts() {
return extraPointRushingAttempts;
}

@JsonProperty("ExtraPointRushingAttempts")
public void setExtraPointRushingAttempts(Integer extraPointRushingAttempts) {
this.extraPointRushingAttempts = extraPointRushingAttempts;
}

@JsonProperty("ExtraPointRushingConversions")
public Integer getExtraPointRushingConversions() {
return extraPointRushingConversions;
}

@JsonProperty("ExtraPointRushingConversions")
public void setExtraPointRushingConversions(Integer extraPointRushingConversions) {
this.extraPointRushingConversions = extraPointRushingConversions;
}

@JsonProperty("FieldGoalAttempts")
public Integer getFieldGoalAttempts() {
return fieldGoalAttempts;
}

@JsonProperty("FieldGoalAttempts")
public void setFieldGoalAttempts(Integer fieldGoalAttempts) {
this.fieldGoalAttempts = fieldGoalAttempts;
}

@JsonProperty("FieldGoalsMade")
public Integer getFieldGoalsMade() {
return fieldGoalsMade;
}

@JsonProperty("FieldGoalsMade")
public void setFieldGoalsMade(Integer fieldGoalsMade) {
this.fieldGoalsMade = fieldGoalsMade;
}

@JsonProperty("FieldGoalsHadBlocked")
public Integer getFieldGoalsHadBlocked() {
return fieldGoalsHadBlocked;
}

@JsonProperty("FieldGoalsHadBlocked")
public void setFieldGoalsHadBlocked(Integer fieldGoalsHadBlocked) {
this.fieldGoalsHadBlocked = fieldGoalsHadBlocked;
}

@JsonProperty("PuntReturns")
public Integer getPuntReturns() {
return puntReturns;
}

@JsonProperty("PuntReturns")
public void setPuntReturns(Integer puntReturns) {
this.puntReturns = puntReturns;
}

@JsonProperty("PuntReturnYards")
public Integer getPuntReturnYards() {
return puntReturnYards;
}

@JsonProperty("PuntReturnYards")
public void setPuntReturnYards(Integer puntReturnYards) {
this.puntReturnYards = puntReturnYards;
}

@JsonProperty("KickReturns")
public Integer getKickReturns() {
return kickReturns;
}

@JsonProperty("KickReturns")
public void setKickReturns(Integer kickReturns) {
this.kickReturns = kickReturns;
}

@JsonProperty("KickReturnYards")
public Integer getKickReturnYards() {
return kickReturnYards;
}

@JsonProperty("KickReturnYards")
public void setKickReturnYards(Integer kickReturnYards) {
this.kickReturnYards = kickReturnYards;
}

@JsonProperty("InterceptionReturns")
public Integer getInterceptionReturns() {
return interceptionReturns;
}

@JsonProperty("InterceptionReturns")
public void setInterceptionReturns(Integer interceptionReturns) {
this.interceptionReturns = interceptionReturns;
}

@JsonProperty("InterceptionReturnYards")
public Integer getInterceptionReturnYards() {
return interceptionReturnYards;
}

@JsonProperty("InterceptionReturnYards")
public void setInterceptionReturnYards(Integer interceptionReturnYards) {
this.interceptionReturnYards = interceptionReturnYards;
}

@JsonProperty("OpponentKickoffs")
public Integer getOpponentKickoffs() {
return opponentKickoffs;
}

@JsonProperty("OpponentKickoffs")
public void setOpponentKickoffs(Integer opponentKickoffs) {
this.opponentKickoffs = opponentKickoffs;
}

@JsonProperty("OpponentKickoffsInEndZone")
public Integer getOpponentKickoffsInEndZone() {
return opponentKickoffsInEndZone;
}

@JsonProperty("OpponentKickoffsInEndZone")
public void setOpponentKickoffsInEndZone(Integer opponentKickoffsInEndZone) {
this.opponentKickoffsInEndZone = opponentKickoffsInEndZone;
}

@JsonProperty("OpponentKickoffTouchbacks")
public Integer getOpponentKickoffTouchbacks() {
return opponentKickoffTouchbacks;
}

@JsonProperty("OpponentKickoffTouchbacks")
public void setOpponentKickoffTouchbacks(Integer opponentKickoffTouchbacks) {
this.opponentKickoffTouchbacks = opponentKickoffTouchbacks;
}

@JsonProperty("OpponentPuntsHadBlocked")
public Integer getOpponentPuntsHadBlocked() {
return opponentPuntsHadBlocked;
}

@JsonProperty("OpponentPuntsHadBlocked")
public void setOpponentPuntsHadBlocked(Integer opponentPuntsHadBlocked) {
this.opponentPuntsHadBlocked = opponentPuntsHadBlocked;
}

@JsonProperty("OpponentPuntNetAverage")
public Double getOpponentPuntNetAverage() {
return opponentPuntNetAverage;
}

@JsonProperty("OpponentPuntNetAverage")
public void setOpponentPuntNetAverage(Double opponentPuntNetAverage) {
this.opponentPuntNetAverage = opponentPuntNetAverage;
}

@JsonProperty("OpponentExtraPointKickingAttempts")
public Integer getOpponentExtraPointKickingAttempts() {
return opponentExtraPointKickingAttempts;
}

@JsonProperty("OpponentExtraPointKickingAttempts")
public void setOpponentExtraPointKickingAttempts(Integer opponentExtraPointKickingAttempts) {
this.opponentExtraPointKickingAttempts = opponentExtraPointKickingAttempts;
}

@JsonProperty("OpponentExtraPointKickingConversions")
public Integer getOpponentExtraPointKickingConversions() {
return opponentExtraPointKickingConversions;
}

@JsonProperty("OpponentExtraPointKickingConversions")
public void setOpponentExtraPointKickingConversions(Integer opponentExtraPointKickingConversions) {
this.opponentExtraPointKickingConversions = opponentExtraPointKickingConversions;
}

@JsonProperty("OpponentExtraPointsHadBlocked")
public Integer getOpponentExtraPointsHadBlocked() {
return opponentExtraPointsHadBlocked;
}

@JsonProperty("OpponentExtraPointsHadBlocked")
public void setOpponentExtraPointsHadBlocked(Integer opponentExtraPointsHadBlocked) {
this.opponentExtraPointsHadBlocked = opponentExtraPointsHadBlocked;
}

@JsonProperty("OpponentExtraPointPassingAttempts")
public Integer getOpponentExtraPointPassingAttempts() {
return opponentExtraPointPassingAttempts;
}

@JsonProperty("OpponentExtraPointPassingAttempts")
public void setOpponentExtraPointPassingAttempts(Integer opponentExtraPointPassingAttempts) {
this.opponentExtraPointPassingAttempts = opponentExtraPointPassingAttempts;
}

@JsonProperty("OpponentExtraPointPassingConversions")
public Integer getOpponentExtraPointPassingConversions() {
return opponentExtraPointPassingConversions;
}

@JsonProperty("OpponentExtraPointPassingConversions")
public void setOpponentExtraPointPassingConversions(Integer opponentExtraPointPassingConversions) {
this.opponentExtraPointPassingConversions = opponentExtraPointPassingConversions;
}

@JsonProperty("OpponentExtraPointRushingAttempts")
public Integer getOpponentExtraPointRushingAttempts() {
return opponentExtraPointRushingAttempts;
}

@JsonProperty("OpponentExtraPointRushingAttempts")
public void setOpponentExtraPointRushingAttempts(Integer opponentExtraPointRushingAttempts) {
this.opponentExtraPointRushingAttempts = opponentExtraPointRushingAttempts;
}

@JsonProperty("OpponentExtraPointRushingConversions")
public Integer getOpponentExtraPointRushingConversions() {
return opponentExtraPointRushingConversions;
}

@JsonProperty("OpponentExtraPointRushingConversions")
public void setOpponentExtraPointRushingConversions(Integer opponentExtraPointRushingConversions) {
this.opponentExtraPointRushingConversions = opponentExtraPointRushingConversions;
}

@JsonProperty("OpponentFieldGoalAttempts")
public Integer getOpponentFieldGoalAttempts() {
return opponentFieldGoalAttempts;
}

@JsonProperty("OpponentFieldGoalAttempts")
public void setOpponentFieldGoalAttempts(Integer opponentFieldGoalAttempts) {
this.opponentFieldGoalAttempts = opponentFieldGoalAttempts;
}

@JsonProperty("OpponentFieldGoalsMade")
public Integer getOpponentFieldGoalsMade() {
return opponentFieldGoalsMade;
}

@JsonProperty("OpponentFieldGoalsMade")
public void setOpponentFieldGoalsMade(Integer opponentFieldGoalsMade) {
this.opponentFieldGoalsMade = opponentFieldGoalsMade;
}

@JsonProperty("OpponentFieldGoalsHadBlocked")
public Integer getOpponentFieldGoalsHadBlocked() {
return opponentFieldGoalsHadBlocked;
}

@JsonProperty("OpponentFieldGoalsHadBlocked")
public void setOpponentFieldGoalsHadBlocked(Integer opponentFieldGoalsHadBlocked) {
this.opponentFieldGoalsHadBlocked = opponentFieldGoalsHadBlocked;
}

@JsonProperty("OpponentPuntReturns")
public Integer getOpponentPuntReturns() {
return opponentPuntReturns;
}

@JsonProperty("OpponentPuntReturns")
public void setOpponentPuntReturns(Integer opponentPuntReturns) {
this.opponentPuntReturns = opponentPuntReturns;
}

@JsonProperty("OpponentPuntReturnYards")
public Integer getOpponentPuntReturnYards() {
return opponentPuntReturnYards;
}

@JsonProperty("OpponentPuntReturnYards")
public void setOpponentPuntReturnYards(Integer opponentPuntReturnYards) {
this.opponentPuntReturnYards = opponentPuntReturnYards;
}

@JsonProperty("OpponentKickReturns")
public Integer getOpponentKickReturns() {
return opponentKickReturns;
}

@JsonProperty("OpponentKickReturns")
public void setOpponentKickReturns(Integer opponentKickReturns) {
this.opponentKickReturns = opponentKickReturns;
}

@JsonProperty("OpponentKickReturnYards")
public Integer getOpponentKickReturnYards() {
return opponentKickReturnYards;
}

@JsonProperty("OpponentKickReturnYards")
public void setOpponentKickReturnYards(Integer opponentKickReturnYards) {
this.opponentKickReturnYards = opponentKickReturnYards;
}

@JsonProperty("OpponentInterceptionReturns")
public Integer getOpponentInterceptionReturns() {
return opponentInterceptionReturns;
}

@JsonProperty("OpponentInterceptionReturns")
public void setOpponentInterceptionReturns(Integer opponentInterceptionReturns) {
this.opponentInterceptionReturns = opponentInterceptionReturns;
}

@JsonProperty("OpponentInterceptionReturnYards")
public Integer getOpponentInterceptionReturnYards() {
return opponentInterceptionReturnYards;
}

@JsonProperty("OpponentInterceptionReturnYards")
public void setOpponentInterceptionReturnYards(Integer opponentInterceptionReturnYards) {
this.opponentInterceptionReturnYards = opponentInterceptionReturnYards;
}

@JsonProperty("SoloTackles")
public Integer getSoloTackles() {
return soloTackles;
}

@JsonProperty("SoloTackles")
public void setSoloTackles(Integer soloTackles) {
this.soloTackles = soloTackles;
}

@JsonProperty("AssistedTackles")
public Integer getAssistedTackles() {
return assistedTackles;
}

@JsonProperty("AssistedTackles")
public void setAssistedTackles(Integer assistedTackles) {
this.assistedTackles = assistedTackles;
}

@JsonProperty("Sacks")
public Integer getSacks() {
return sacks;
}

@JsonProperty("Sacks")
public void setSacks(Integer sacks) {
this.sacks = sacks;
}

@JsonProperty("SackYards")
public Integer getSackYards() {
return sackYards;
}

@JsonProperty("SackYards")
public void setSackYards(Integer sackYards) {
this.sackYards = sackYards;
}

@JsonProperty("PassesDefended")
public Integer getPassesDefended() {
return passesDefended;
}

@JsonProperty("PassesDefended")
public void setPassesDefended(Integer passesDefended) {
this.passesDefended = passesDefended;
}

@JsonProperty("FumblesForced")
public Integer getFumblesForced() {
return fumblesForced;
}

@JsonProperty("FumblesForced")
public void setFumblesForced(Integer fumblesForced) {
this.fumblesForced = fumblesForced;
}

@JsonProperty("FumblesRecovered")
public Integer getFumblesRecovered() {
return fumblesRecovered;
}

@JsonProperty("FumblesRecovered")
public void setFumblesRecovered(Integer fumblesRecovered) {
this.fumblesRecovered = fumblesRecovered;
}

@JsonProperty("FumbleReturnYards")
public Integer getFumbleReturnYards() {
return fumbleReturnYards;
}

@JsonProperty("FumbleReturnYards")
public void setFumbleReturnYards(Integer fumbleReturnYards) {
this.fumbleReturnYards = fumbleReturnYards;
}

@JsonProperty("FumbleReturnTouchdowns")
public Integer getFumbleReturnTouchdowns() {
return fumbleReturnTouchdowns;
}

@JsonProperty("FumbleReturnTouchdowns")
public void setFumbleReturnTouchdowns(Integer fumbleReturnTouchdowns) {
this.fumbleReturnTouchdowns = fumbleReturnTouchdowns;
}

@JsonProperty("InterceptionReturnTouchdowns")
public Integer getInterceptionReturnTouchdowns() {
return interceptionReturnTouchdowns;
}

@JsonProperty("InterceptionReturnTouchdowns")
public void setInterceptionReturnTouchdowns(Integer interceptionReturnTouchdowns) {
this.interceptionReturnTouchdowns = interceptionReturnTouchdowns;
}

@JsonProperty("BlockedKicks")
public Integer getBlockedKicks() {
return blockedKicks;
}

@JsonProperty("BlockedKicks")
public void setBlockedKicks(Integer blockedKicks) {
this.blockedKicks = blockedKicks;
}

@JsonProperty("PuntReturnTouchdowns")
public Integer getPuntReturnTouchdowns() {
return puntReturnTouchdowns;
}

@JsonProperty("PuntReturnTouchdowns")
public void setPuntReturnTouchdowns(Integer puntReturnTouchdowns) {
this.puntReturnTouchdowns = puntReturnTouchdowns;
}

@JsonProperty("PuntReturnLong")
public Integer getPuntReturnLong() {
return puntReturnLong;
}

@JsonProperty("PuntReturnLong")
public void setPuntReturnLong(Integer puntReturnLong) {
this.puntReturnLong = puntReturnLong;
}

@JsonProperty("KickReturnTouchdowns")
public Integer getKickReturnTouchdowns() {
return kickReturnTouchdowns;
}

@JsonProperty("KickReturnTouchdowns")
public void setKickReturnTouchdowns(Integer kickReturnTouchdowns) {
this.kickReturnTouchdowns = kickReturnTouchdowns;
}

@JsonProperty("KickReturnLong")
public Integer getKickReturnLong() {
return kickReturnLong;
}

@JsonProperty("KickReturnLong")
public void setKickReturnLong(Integer kickReturnLong) {
this.kickReturnLong = kickReturnLong;
}

@JsonProperty("BlockedKickReturnYards")
public Integer getBlockedKickReturnYards() {
return blockedKickReturnYards;
}

@JsonProperty("BlockedKickReturnYards")
public void setBlockedKickReturnYards(Integer blockedKickReturnYards) {
this.blockedKickReturnYards = blockedKickReturnYards;
}

@JsonProperty("BlockedKickReturnTouchdowns")
public Integer getBlockedKickReturnTouchdowns() {
return blockedKickReturnTouchdowns;
}

@JsonProperty("BlockedKickReturnTouchdowns")
public void setBlockedKickReturnTouchdowns(Integer blockedKickReturnTouchdowns) {
this.blockedKickReturnTouchdowns = blockedKickReturnTouchdowns;
}

@JsonProperty("FieldGoalReturnYards")
public Integer getFieldGoalReturnYards() {
return fieldGoalReturnYards;
}

@JsonProperty("FieldGoalReturnYards")
public void setFieldGoalReturnYards(Integer fieldGoalReturnYards) {
this.fieldGoalReturnYards = fieldGoalReturnYards;
}

@JsonProperty("FieldGoalReturnTouchdowns")
public Integer getFieldGoalReturnTouchdowns() {
return fieldGoalReturnTouchdowns;
}

@JsonProperty("FieldGoalReturnTouchdowns")
public void setFieldGoalReturnTouchdowns(Integer fieldGoalReturnTouchdowns) {
this.fieldGoalReturnTouchdowns = fieldGoalReturnTouchdowns;
}

@JsonProperty("PuntNetYards")
public Integer getPuntNetYards() {
return puntNetYards;
}

@JsonProperty("PuntNetYards")
public void setPuntNetYards(Integer puntNetYards) {
this.puntNetYards = puntNetYards;
}

@JsonProperty("OpponentSoloTackles")
public Integer getOpponentSoloTackles() {
return opponentSoloTackles;
}

@JsonProperty("OpponentSoloTackles")
public void setOpponentSoloTackles(Integer opponentSoloTackles) {
this.opponentSoloTackles = opponentSoloTackles;
}

@JsonProperty("OpponentAssistedTackles")
public Integer getOpponentAssistedTackles() {
return opponentAssistedTackles;
}

@JsonProperty("OpponentAssistedTackles")
public void setOpponentAssistedTackles(Integer opponentAssistedTackles) {
this.opponentAssistedTackles = opponentAssistedTackles;
}

@JsonProperty("OpponentSacks")
public Integer getOpponentSacks() {
return opponentSacks;
}

@JsonProperty("OpponentSacks")
public void setOpponentSacks(Integer opponentSacks) {
this.opponentSacks = opponentSacks;
}

@JsonProperty("OpponentSackYards")
public Integer getOpponentSackYards() {
return opponentSackYards;
}

@JsonProperty("OpponentSackYards")
public void setOpponentSackYards(Integer opponentSackYards) {
this.opponentSackYards = opponentSackYards;
}

@JsonProperty("OpponentPassesDefended")
public Integer getOpponentPassesDefended() {
return opponentPassesDefended;
}

@JsonProperty("OpponentPassesDefended")
public void setOpponentPassesDefended(Integer opponentPassesDefended) {
this.opponentPassesDefended = opponentPassesDefended;
}

@JsonProperty("OpponentFumblesForced")
public Integer getOpponentFumblesForced() {
return opponentFumblesForced;
}

@JsonProperty("OpponentFumblesForced")
public void setOpponentFumblesForced(Integer opponentFumblesForced) {
this.opponentFumblesForced = opponentFumblesForced;
}

@JsonProperty("OpponentFumblesRecovered")
public Integer getOpponentFumblesRecovered() {
return opponentFumblesRecovered;
}

@JsonProperty("OpponentFumblesRecovered")
public void setOpponentFumblesRecovered(Integer opponentFumblesRecovered) {
this.opponentFumblesRecovered = opponentFumblesRecovered;
}

@JsonProperty("OpponentFumbleReturnYards")
public Integer getOpponentFumbleReturnYards() {
return opponentFumbleReturnYards;
}

@JsonProperty("OpponentFumbleReturnYards")
public void setOpponentFumbleReturnYards(Integer opponentFumbleReturnYards) {
this.opponentFumbleReturnYards = opponentFumbleReturnYards;
}

@JsonProperty("OpponentFumbleReturnTouchdowns")
public Integer getOpponentFumbleReturnTouchdowns() {
return opponentFumbleReturnTouchdowns;
}

@JsonProperty("OpponentFumbleReturnTouchdowns")
public void setOpponentFumbleReturnTouchdowns(Integer opponentFumbleReturnTouchdowns) {
this.opponentFumbleReturnTouchdowns = opponentFumbleReturnTouchdowns;
}

@JsonProperty("OpponentInterceptionReturnTouchdowns")
public Integer getOpponentInterceptionReturnTouchdowns() {
return opponentInterceptionReturnTouchdowns;
}

@JsonProperty("OpponentInterceptionReturnTouchdowns")
public void setOpponentInterceptionReturnTouchdowns(Integer opponentInterceptionReturnTouchdowns) {
this.opponentInterceptionReturnTouchdowns = opponentInterceptionReturnTouchdowns;
}

@JsonProperty("OpponentBlockedKicks")
public Integer getOpponentBlockedKicks() {
return opponentBlockedKicks;
}

@JsonProperty("OpponentBlockedKicks")
public void setOpponentBlockedKicks(Integer opponentBlockedKicks) {
this.opponentBlockedKicks = opponentBlockedKicks;
}

@JsonProperty("OpponentPuntReturnTouchdowns")
public Integer getOpponentPuntReturnTouchdowns() {
return opponentPuntReturnTouchdowns;
}

@JsonProperty("OpponentPuntReturnTouchdowns")
public void setOpponentPuntReturnTouchdowns(Integer opponentPuntReturnTouchdowns) {
this.opponentPuntReturnTouchdowns = opponentPuntReturnTouchdowns;
}

@JsonProperty("OpponentPuntReturnLong")
public Integer getOpponentPuntReturnLong() {
return opponentPuntReturnLong;
}

@JsonProperty("OpponentPuntReturnLong")
public void setOpponentPuntReturnLong(Integer opponentPuntReturnLong) {
this.opponentPuntReturnLong = opponentPuntReturnLong;
}

@JsonProperty("OpponentKickReturnTouchdowns")
public Integer getOpponentKickReturnTouchdowns() {
return opponentKickReturnTouchdowns;
}

@JsonProperty("OpponentKickReturnTouchdowns")
public void setOpponentKickReturnTouchdowns(Integer opponentKickReturnTouchdowns) {
this.opponentKickReturnTouchdowns = opponentKickReturnTouchdowns;
}

@JsonProperty("OpponentKickReturnLong")
public Integer getOpponentKickReturnLong() {
return opponentKickReturnLong;
}

@JsonProperty("OpponentKickReturnLong")
public void setOpponentKickReturnLong(Integer opponentKickReturnLong) {
this.opponentKickReturnLong = opponentKickReturnLong;
}

@JsonProperty("OpponentBlockedKickReturnYards")
public Integer getOpponentBlockedKickReturnYards() {
return opponentBlockedKickReturnYards;
}

@JsonProperty("OpponentBlockedKickReturnYards")
public void setOpponentBlockedKickReturnYards(Integer opponentBlockedKickReturnYards) {
this.opponentBlockedKickReturnYards = opponentBlockedKickReturnYards;
}

@JsonProperty("OpponentBlockedKickReturnTouchdowns")
public Integer getOpponentBlockedKickReturnTouchdowns() {
return opponentBlockedKickReturnTouchdowns;
}

@JsonProperty("OpponentBlockedKickReturnTouchdowns")
public void setOpponentBlockedKickReturnTouchdowns(Integer opponentBlockedKickReturnTouchdowns) {
this.opponentBlockedKickReturnTouchdowns = opponentBlockedKickReturnTouchdowns;
}

@JsonProperty("OpponentFieldGoalReturnYards")
public Integer getOpponentFieldGoalReturnYards() {
return opponentFieldGoalReturnYards;
}

@JsonProperty("OpponentFieldGoalReturnYards")
public void setOpponentFieldGoalReturnYards(Integer opponentFieldGoalReturnYards) {
this.opponentFieldGoalReturnYards = opponentFieldGoalReturnYards;
}

@JsonProperty("OpponentFieldGoalReturnTouchdowns")
public Integer getOpponentFieldGoalReturnTouchdowns() {
return opponentFieldGoalReturnTouchdowns;
}

@JsonProperty("OpponentFieldGoalReturnTouchdowns")
public void setOpponentFieldGoalReturnTouchdowns(Integer opponentFieldGoalReturnTouchdowns) {
this.opponentFieldGoalReturnTouchdowns = opponentFieldGoalReturnTouchdowns;
}

@JsonProperty("OpponentPuntNetYards")
public Integer getOpponentPuntNetYards() {
return opponentPuntNetYards;
}

@JsonProperty("OpponentPuntNetYards")
public void setOpponentPuntNetYards(Integer opponentPuntNetYards) {
this.opponentPuntNetYards = opponentPuntNetYards;
}

@JsonProperty("IsGameOver")
public Boolean getIsGameOver() {
return isGameOver;
}

@JsonProperty("IsGameOver")
public void setIsGameOver(Boolean isGameOver) {
this.isGameOver = isGameOver;
}

@JsonProperty("TeamName")
public String getTeamName() {
return teamName;
}

@JsonProperty("TeamName")
public void setTeamName(String teamName) {
this.teamName = teamName;
}

@JsonProperty("DayOfWeek")
public String getDayOfWeek() {
return dayOfWeek;
}

@JsonProperty("DayOfWeek")
public void setDayOfWeek(String dayOfWeek) {
this.dayOfWeek = dayOfWeek;
}

@JsonProperty("PassingDropbacks")
public Integer getPassingDropbacks() {
return passingDropbacks;
}

@JsonProperty("PassingDropbacks")
public void setPassingDropbacks(Integer passingDropbacks) {
this.passingDropbacks = passingDropbacks;
}

@JsonProperty("OpponentPassingDropbacks")
public Integer getOpponentPassingDropbacks() {
return opponentPassingDropbacks;
}

@JsonProperty("OpponentPassingDropbacks")
public void setOpponentPassingDropbacks(Integer opponentPassingDropbacks) {
this.opponentPassingDropbacks = opponentPassingDropbacks;
}

@JsonProperty("TeamGameID")
public Integer getTeamGameID() {
return teamGameID;
}

@JsonProperty("TeamGameID")
public void setTeamGameID(Integer teamGameID) {
this.teamGameID = teamGameID;
}

@JsonProperty("TwoPointConversionReturns")
public Integer getTwoPointConversionReturns() {
return twoPointConversionReturns;
}

@JsonProperty("TwoPointConversionReturns")
public void setTwoPointConversionReturns(Integer twoPointConversionReturns) {
this.twoPointConversionReturns = twoPointConversionReturns;
}

@JsonProperty("OpponentTwoPointConversionReturns")
public Integer getOpponentTwoPointConversionReturns() {
return opponentTwoPointConversionReturns;
}

@JsonProperty("OpponentTwoPointConversionReturns")
public void setOpponentTwoPointConversionReturns(Integer opponentTwoPointConversionReturns) {
this.opponentTwoPointConversionReturns = opponentTwoPointConversionReturns;
}

@JsonProperty("TeamID")
public Integer getTeamID() {
return teamID;
}

@JsonProperty("TeamID")
public void setTeamID(Integer teamID) {
this.teamID = teamID;
}

@JsonProperty("OpponentID")
public Integer getOpponentID() {
return opponentID;
}

@JsonProperty("OpponentID")
public void setOpponentID(Integer opponentID) {
this.opponentID = opponentID;
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

@JsonProperty("GlobalTeamID")
public Integer getGlobalTeamID() {
return globalTeamID;
}

@JsonProperty("GlobalTeamID")
public void setGlobalTeamID(Integer globalTeamID) {
this.globalTeamID = globalTeamID;
}

@JsonProperty("GlobalOpponentID")
public Integer getGlobalOpponentID() {
return globalOpponentID;
}

@JsonProperty("GlobalOpponentID")
public void setGlobalOpponentID(Integer globalOpponentID) {
this.globalOpponentID = globalOpponentID;
}

@JsonProperty("ScoreID")
public Integer getScoreID() {
return scoreID;
}

@JsonProperty("ScoreID")
public void setScoreID(Integer scoreID) {
this.scoreID = scoreID;
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