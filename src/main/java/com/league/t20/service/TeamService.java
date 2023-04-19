package com.league.t20.service;

import java.util.Optional;

import com.league.t20.model.teamlanding.TeamLanding;

public interface TeamService {
	
	public Optional<TeamLanding> getAllTeams();

}
