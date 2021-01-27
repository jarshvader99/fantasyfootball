package com.ff.fantasyfootball;


public class Match {
	
	private Integer matchId;
	private Team homeTeam;
	private Team visitingTeam;
	private Integer week;
	private boolean played;

	public Match()
	{
		this.homeTeam = null;
		this.visitingTeam = null;
		this.week = null;
		this.played = false;
	}
	
	public Match(Team homeTeam, Team visitingTeam, Integer week) {
		super();
		this.homeTeam = homeTeam;
		this.visitingTeam = visitingTeam;
		this.week = week;
		this.played = false;
	}
	
	public Team[] getTeams() {
		Team[] teams = new Team[2];
		teams[0]=homeTeam;
		teams[1]=visitingTeam;
		return teams;
	}
	
	public void setTeams(Team homeTeam, Team visitingTeam) {
		this.homeTeam = homeTeam;
		this.visitingTeam = visitingTeam;
	}
	
	public Integer getMatchId() {
		return matchId;
	}
	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getVisitingTeam() {
		return visitingTeam;
	}
	public void setVisitingTeam(Team visitingTeam) {
		this.visitingTeam = visitingTeam;
	}
	public Integer getWeek() {
		return week;
	}
	public void setWeek(Integer week) {
		this.week = week;
	}
	public boolean isPlayed() {
		return played;
	}
	public void setPlayed(boolean played) {
		this.played = played;
	}
	
	
}