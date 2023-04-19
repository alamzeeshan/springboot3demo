package com.league.t20.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.league.t20.model.teamlanding.Team;
import com.league.t20.model.teamlanding.TeamLanding;
import com.league.t20.service.TeamService;

@RestController
@RequestMapping("/api/teams")
public class TeamsController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/")
    public ResponseEntity<TeamLanding> findTeams() {
		
		Optional<TeamLanding> result = teamService.getAllTeams();
		
		if(result.isPresent()) {
			//return ResponseEntity.ok(result.get());
			return new ResponseEntity<TeamLanding>(result.get(), HttpStatus.OK);
		}		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
    }
	
	
	@GetMapping("/teamStr")
    public TeamLanding findTeamsStr() throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://cdn.jsdelivr.net/gh/alamshaan/testrepo@1.0.1/teams_landing.json";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		String resStr = response.getBody();
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(resStr);
		TeamLanding result = mapper.readValue(resStr, TeamLanding.class);
		
		List<Team> teamList = result.getIpl().getTeams();
		Collections.sort(teamList, (o1, o2) -> {
			return o1.getId().compareTo(o2.getId());
		});
		
		
		/*-
		Collections.sort(teamList, new Comparator<Team>() {
			@Override
			public int compare(Team o1, Team o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});*/
		
		return result;
    }

}
