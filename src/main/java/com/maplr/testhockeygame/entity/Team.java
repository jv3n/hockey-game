package com.maplr.testhockeygame.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_team")
public class Team {
	@Id
	@GeneratedValue
	private Long id;
	private String coach;
	private String year;
	@OneToMany(mappedBy = "teamId", cascade = CascadeType.ALL)
	List<Player> players = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public Team setId(Long id) {
		this.id = id;
		return this;
	}

	public String getCoach() {
		return coach;
	}

	public Team setCoach(String coach) {
		this.coach = coach;
		return this;
	}

	public String getYear() {
		return year;
	}

	public Team setYear(String year) {
		this.year = year;
		return this;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public Team setPlayers(List<Player> players) {
		this.players = players;
		return this;
	}

	@Override
	public String toString() {
		return "Team{" +
				"id=" + id +
				", coach='" + coach + '\'' +
				", year='" + year + '\'' +
				", players=" + players +
				'}';
	}
}
