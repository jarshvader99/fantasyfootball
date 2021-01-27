package com.ff.fantasyfootball;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
	
	@Id
	@Column(name = "team_id")
	@GeneratedValue
	private Integer team_id;
	
	@Column(name = "owner_id")
	private Integer owner_id;
	
	@Column(name = "league_id")
	private Integer league_id;
	
	@Column(name = "qb1_id")
	private Integer qb1_id;
	
	@Column(name = "rb1_id")
	private Integer rb1_id;
	
	@Column(name = "rb2_id")
	private Integer rb2_id;
	
	@Column(name = "wr1_id")
	private Integer wr1_id;
	
	@Column(name = "wr2_id")
	private Integer wr2_id;
	
	@Column(name = "te_id")
	private Integer te_id;
	
	@Column(name = "flex_id")
	private Integer flex_id;
	
	@Column(name = "defense_id")
	private Integer defense_id;
	
	@Column(name = "kicker_id")
	private Integer kicker_id;
	
	@Column(name = "bench_id")
	private Integer bench_id;
	
	@Column(name = "bench1_id")
	private Integer bench1_id;
	
	@Column(name = "bench2_id")
	private Integer bench2_id;
	
	@Column(name = "bench3_id")
	private Integer bench3_id;
	
	@Column(name = "bench4_id")
	private Integer bench4_id;
	
	@Column(name = "bench5_id")
	private Integer bench5_id;

	@Column(name = "bench6_id")
	private Integer bench6_id;
	
	@Column(name = "bench7_id")
	private Integer bench7_id;
	
	@Column(name = "injured_id")
	private Integer injured_id;
	
	@Column(name = "division")
	private String division;
	
	public Team(){
        super();
    }
	
	public Team(Integer team_id) {
        super();
        this.team_id = team_id;
    }

	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public Integer getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(Integer owner_id) {
		this.owner_id = owner_id;
	}

	public Integer getLeague_id() {
		return league_id;
	}

	public void setLeague_id(Integer league_id) {
		this.league_id = league_id;
	}

	public Integer getQb1_id() {
		return qb1_id;
	}

	public void setQb1_id(Integer qb1_id) {
		this.qb1_id = qb1_id;
	}

	public Integer getRb1_id() {
		return rb1_id;
	}

	public void setRb1_id(Integer rb1_id) {
		this.rb1_id = rb1_id;
	}

	public Integer getRb2_id() {
		return rb2_id;
	}

	public void setRb2_id(Integer rb2_id) {
		this.rb2_id = rb2_id;
	}

	public Integer getWr1_id() {
		return wr1_id;
	}

	public void setWr1_id(Integer wr1_id) {
		this.wr1_id = wr1_id;
	}

	public Integer getWr2_id() {
		return wr2_id;
	}

	public void setWr2_id(Integer wr2_id) {
		this.wr2_id = wr2_id;
	}

	public Integer getTe_id() {
		return te_id;
	}

	public void setTe_id(Integer te_id) {
		this.te_id = te_id;
	}

	public Integer getFlex_id() {
		return flex_id;
	}

	public void setFlex_id(Integer flex_id) {
		this.flex_id = flex_id;
	}

	public Integer getDefense_id() {
		return defense_id;
	}

	public void setDefense_id(Integer defense_id) {
		this.defense_id = defense_id;
	}

	public Integer getKicker_id() {
		return kicker_id;
	}

	public void setKicker_id(Integer kicker_id) {
		this.kicker_id = kicker_id;
	}

	public Integer getBench_id() {
		return bench_id;
	}

	public void setBench_id(Integer bench_id) {
		this.bench_id = bench_id;
	}

	public Integer getBench1_id() {
		return bench1_id;
	}

	public void setBench1_id(Integer bench1_id) {
		this.bench1_id = bench1_id;
	}

	public Integer getBench2_id() {
		return bench2_id;
	}

	public void setBench2_id(Integer bench2_id) {
		this.bench2_id = bench2_id;
	}

	public Integer getBench3_id() {
		return bench3_id;
	}

	public void setBench3_id(Integer bench3_id) {
		this.bench3_id = bench3_id;
	}

	public Integer getBench4_id() {
		return bench4_id;
	}

	public void setBench4_id(Integer bench4_id) {
		this.bench4_id = bench4_id;
	}

	public Integer getBench5_id() {
		return bench5_id;
	}

	public void setBench5_id(Integer bench5_id) {
		this.bench5_id = bench5_id;
	}

	public Integer getBench6_id() {
		return bench6_id;
	}

	public void setBench6_id(Integer bench6_id) {
		this.bench6_id = bench6_id;
	}

	public Integer getBench7_id() {
		return bench7_id;
	}

	public void setBench7_id(Integer bench7_id) {
		this.bench7_id = bench7_id;
	}

	public Integer getInjured_id() {
		return injured_id;
	}

	public void setInjured_id(Integer injured_id) {
		this.injured_id = injured_id;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
}