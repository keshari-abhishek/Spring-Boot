package com.abhi.crick.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.crick.entity.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>{

	Optional<Match> findByTeamHeading(String teamHeading);
	
}
