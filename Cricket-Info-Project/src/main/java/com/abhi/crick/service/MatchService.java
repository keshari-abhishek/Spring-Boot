package com.abhi.crick.service;

import java.util.List;
import java.util.Map;

import com.abhi.crick.entity.Match;

public interface MatchService {
	
	List<Match> getAllMatches();
	
	List<Match> getLiveMatchs();
	
	List<Map<String,String>> getPointTable();
}
