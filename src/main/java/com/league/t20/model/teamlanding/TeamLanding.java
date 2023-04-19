package com.league.t20.model.teamlanding;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamLanding {
	
	private TeamDetails international;
	
	private TeamDetails ipl;
	
	@JsonProperty("key_details")
	private List<String> keyDetails;

	public TeamDetails getInternational() {
		return international;
	}

	public void setInternational(TeamDetails international) {
		this.international = international;
	}

	public TeamDetails getIpl() {
		return ipl;
	}

	public void setIpl(TeamDetails ipl) {
		this.ipl = ipl;
	}

	public List<String> getKeyDetails() {
		return keyDetails;
	}

	public void setKeyDetails(List<String> keyDetails) {
		this.keyDetails = keyDetails;
	}

	
	
	

}
