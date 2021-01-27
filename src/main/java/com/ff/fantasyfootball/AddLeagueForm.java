package com.ff.fantasyfootball;

public class AddLeagueForm {
	
	private Integer league_id;
	private String league_name;
	private Integer num_teams_in_league;
	private String scoring_type;
	private String team_location;
	private String nick_name;
	private String abbreviation;
	private String team_logo;
	private Boolean opt_in_emails;
	private Boolean private_league;

	
	public Integer getLeague_id() {
		return league_id;
	}

	public void setLeague_id(Integer league_id) {
		this.league_id = league_id;
	}

	public Integer getNum_teams_in_league() {
		return num_teams_in_league;
	}

	public void setNum_teams_in_league(Integer num_teams_in_league) {
		this.num_teams_in_league = num_teams_in_league;
	}

	public String getScoring_type() {
		return scoring_type;
	}

	public void setScoring_type(String scoring_type) {
		this.scoring_type = scoring_type;
	}

	public String getTeam_location() {
		return team_location;
	}

	public void setTeam_location(String team_location) {
		this.team_location = team_location;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getTeam_logo() {
		return team_logo;
	}

	public void setTeam_logo(String team_logo) {
		this.team_logo = team_logo;
	}

	public Boolean getOpt_in_emails() {
		return opt_in_emails;
	}

	public void setOpt_in_emails(Boolean opt_in_emails) {
		this.opt_in_emails = opt_in_emails;
	}

	public String getLeague_name() {
		return league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}

	public Boolean getPrivate_league() {
		return private_league;
	}

	public void setPrivate_league(Boolean private_league) {
		this.private_league = private_league;
	}
	
}

