package com.league.t20.dao;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.league.t20.model.teamlanding.TeamLanding;

@Repository
public class TeamDAOImpl implements TeamDAO {

	@Override
	public Optional<TeamLanding> getAllTeams() {
		RestTemplate restTemplate = new RestTemplate();
		TeamLanding results = null;
		ResponseEntity<TeamLanding> response;
		try {
			String url = "https://cdn.jsdelivr.net/gh/alamshaan/testrepo@1.0.1/teams_landing.json";
			response = restTemplate.getForEntity(url, TeamLanding.class);
			results = response.getBody();
		} catch (Exception e) {
			return Optional.empty();
		}		
		return Optional.of(results);
	}
	
	

}
