package com.league.t20.dao;

import java.util.Optional;

import com.league.t20.model.teamlanding.TeamLanding;

public interface TeamDAO {
	
	public Optional<TeamLanding> getAllTeams();

}
