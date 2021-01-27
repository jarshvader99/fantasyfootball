package com.ff.fantasyfootball;

import com.ff.fantasyfootball.League;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {

	League save(List<Integer> teamsInLeague);
}