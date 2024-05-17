package com.abhi.crick.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.crick.entity.Match;
import com.abhi.crick.repositories.MatchRepo;
import com.abhi.crick.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService{
	
	private MatchRepo matchRepo;
	
	public MatchServiceImpl(MatchRepo matchRepo) {
		this.matchRepo=matchRepo;
	}

	@Override
	public List<Match> getAllMatches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Match> getLiveMatchs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> getPointTable() {
		// TODO Auto-generated method stub
		return null;
	}

}
