package com.league.t20.model.teamlanding;

import java.util.List;

public class Team {
	
	private String id;
	
	private String name;
	
	private String short_name;
	
	private CaptainDetails captain_details;
	
	private List<SocialDetails> social_details;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public CaptainDetails getCaptain_details() {
		return captain_details;
	}

	public void setCaptain_details(CaptainDetails captain_details) {
		this.captain_details = captain_details;
	}

	public List<SocialDetails> getSocial_details() {
		return social_details;
	}

	public void setSocial_details(List<SocialDetails> social_details) {
		this.social_details = social_details;
	}

}
																																					