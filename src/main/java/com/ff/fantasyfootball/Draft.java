package com.ff.fantasyfootball;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "draft")
public class Draft {
	
	@Id
	@Column(name = "draft_id")
	@GeneratedValue
	private Integer draft_id;
	
	@Column(name = "league_id")
	private Integer league_id;
	
	@Column(name = "team1_id")
	private Integer team1_id;
	
	@Column(name = "team2_id")
	private Integer team2_id;
	
	@Column(name = "team3_id")
	private Integer team3_id;
	
	@Column(name = "team4_id")
	private Integer team4_id;
	
	@Column(name = "team5_id")
	private Integer team5_id;
	
	@Column(name = "team6_id")
	private Integer team6_id;
	
	@Column(name = "team7_id")
	private Integer team7_id;
	
	@Column(name = "team8_id")
	private Integer team8_id;
	
	@Column(name = "team9_id")
	private Integer team9_id;
	
	@Column(name = "team10_id")
	private Integer team10_id;
	
	@Column(name = "team11_id")
	private Integer team11_id;
	
	@Column(name = "team12_id")
	private Integer team12_id;
	
	@Column(name = "team13_id")
	private Integer team13_id;
	
	@Column(name = "team14_id")
	private Integer team14_id;
	
	@Column(name = "team15_id")
	private Integer team15_id;
	
	@Column(name = "team16_id")
	private Integer team16_id;
	
	@Column(name = "team17_id")
	private Integer team17_id;
	
	@Column(name = "team18_id")
	private Integer team18_id;
	
	@Column(name = "team19_id")
	private Integer team19_id;
	
	@Column(name = "team20_id")
	private Integer team20_id;
	
	@Column(name = "draft_type")
	private String draft_type;
	
	@Column(name = "start_date")
	private Date start_date;

	public Integer getDraft_id() {
		return draft_id;
	}

	public void setDraft_id(Integer draft_id) {
		this.draft_id = draft_id;
	}

	public Integer getLeague_id() {
		return league_id;
	}

	public void setLeague_id(Integer league_id) {
		this.league_id = league_id;
	}

	public Integer getTeam1_id() {
		return team1_id;
	}

	public void setTeam1_id(Integer team1_id) {
		this.team1_id = team1_id;
	}

	public Integer getTeam2_id() {
		return team2_id;
	}

	public void setTeam2_id(Integer team2_id) {
		this.team2_id = team2_id;
	}

	public Integer getTeam3_id() {
		return team3_id;
	}

	public void setTeam3_id(Integer team3_id) {
		this.team3_id = team3_id;
	}

	public Integer getTeam4_id() {
		return team4_id;
	}

	public void setTeam4_id(Integer team4_id) {
		this.team4_id = team4_id;
	}

	public Integer getTeam5_id() {
		return team5_id;
	}

	public void setTeam5_id(Integer team5_id) {
		this.team5_id = team5_id;
	}

	public Integer getTeam6_id() {
		return team6_id;
	}

	public void setTeam6_id(Integer team6_id) {
		this.team6_id = team6_id;
	}

	public Integer getTeam7_id() {
		return team7_id;
	}

	public void setTeam7_id(Integer team7_id) {
		this.team7_id = team7_id;
	}

	public Integer getTeam8_id() {
		return team8_id;
	}

	public void setTeam8_id(Integer team8_id) {
		this.team8_id = team8_id;
	}

	public Integer getTeam9_id() {
		return team9_id;
	}

	public void setTeam9_id(Integer team9_id) {
		this.team9_id = team9_id;
	}

	public Integer getTeam10_id() {
		return team10_id;
	}

	public void setTeam10_id(Integer team10_id) {
		this.team10_id = team10_id;
	}

	public Integer getTeam11_id() {
		return team11_id;
	}

	public void setTeam11_id(Integer team11_id) {
		this.team11_id = team11_id;
	}

	public Integer getTeam12_id() {
		return team12_id;
	}

	public void setTeam12_id(Integer team12_id) {
		this.team12_id = team12_id;
	}

	public Integer getTeam13_id() {
		return team13_id;
	}

	public void setTeam13_id(Integer team13_id) {
		this.team13_id = team13_id;
	}

	public Integer getTeam14_id() {
		return team14_id;
	}

	public void setTeam14_id(Integer team14_id) {
		this.team14_id = team14_id;
	}

	public Integer getTeam15_id() {
		return team15_id;
	}

	public void setTeam15_id(Integer team15_id) {
		this.team15_id = team15_id;
	}

	public Integer getTeam16_id() {
		return team16_id;
	}

	public void setTeam16_id(Integer team16_id) {
		this.team16_id = team16_id;
	}

	public Integer getTeam17_id() {
		return team17_id;
	}

	public void setTeam17_id(Integer team17_id) {
		this.team17_id = team17_id;
	}

	public Integer getTeam18_id() {
		return team18_id;
	}

	public void setTeam18_id(Integer team18_id) {
		this.team18_id = team18_id;
	}

	public Integer getTeam19_id() {
		return team19_id;
	}

	public void setTeam19_id(Integer team19_id) {
		this.team19_id = team19_id;
	}

	public Integer getTeam20_id() {
		return team20_id;
	}

	public void setTeam20_id(Integer team20_id) {
		this.team20_id = team20_id;
	}

	public String getDraft_type() {
		return draft_type;
	}

	public void setDraft_type(String draft_type) {
		this.draft_type = draft_type;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
}