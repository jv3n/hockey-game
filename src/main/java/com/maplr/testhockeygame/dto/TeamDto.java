package com.maplr.testhockeygame.dto;

import java.util.List;

public class TeamDto {
	Long id;
	String coach;
	String year;
	List<PlayerDto> players;

	public Long getId() {
		return id;
	}

	public TeamDto setId(Long id) {
		this.id = id;
		return this;
	}

	public String getCoach() {
		return coach;
	}

	public TeamDto setCoach(String coach) {
		this.coach = coach;
		return this;
	}

	public String getYear() {
		return year;
	}

	public TeamDto setYear(String year) {
		this.year = year;
		return this;
	}

	public List<PlayerDto> getPlayers() {
		return players;
	}

	public TeamDto setPlayers(List<PlayerDto> players) {
		this.players = players;
		return this;
	}
}
