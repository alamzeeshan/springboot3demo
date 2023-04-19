package com.league.t20.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.t20.dao.TeamDAO;
import com.league.t20.model.teamlanding.TeamLanding;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamDAO teamDAO;

	@Override
	public Optional<TeamLanding> getAllTeams() {
		return teamDAO.getAllTeams();
	}

}
