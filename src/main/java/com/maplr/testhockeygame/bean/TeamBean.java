package com.maplr.testhockeygame.bean;

import java.util.List;

public class TeamBean {
	Long id;
	String coach;
	String year;
	List<PlayerBean> players;

	public Long getId() {
		return id;
	}

	public TeamBean setId(Long id) {
		this.id = id;
		return this;
	}

	public String getCoach() {
		return coach;
	}

	public TeamBean setCoach(String coach) {
		this.coach = coach;
		return this;
	}

	public String getYear() {
		return year;
	}

	public TeamBean setYear(String year) {
		this.year = year;
		return this;
	}

	public List<PlayerBean> getPlayers() {
		return players;
	}

	public TeamBean setPlayers(List<PlayerBean> players) {
		this.players = players;
		return this;
	}
}
