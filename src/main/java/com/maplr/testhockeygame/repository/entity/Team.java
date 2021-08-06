package com.maplr.testhockeygame.repository.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_gen")
	@SequenceGenerator(name = "team_gen", sequenceName = "seq_tea_id", allocationSize = 1)
	private Long tea_id;
	private String tea_coach;
	private String tea_year;
	@OneToMany(mappedBy = "pla_team_id", cascade = CascadeType.ALL)
	List<Player> tea_players = new ArrayList<>();

	public Long getTea_id() {
		return tea_id;
	}

	public void setTea_id(Long tea_id) {
		this.tea_id = tea_id;
	}

	public String getTea_coach() {
		return tea_coach;
	}

	public void setTea_coach(String tea_coach) {
		this.tea_coach = tea_coach;
	}

	public String getTea_year() {
		return tea_year;
	}

	public void setTea_year(String tea_year) {
		this.tea_year = tea_year;
	}

	public List<Player> getTea_players() {
		return tea_players;
	}

	public void setTea_players(List<Player> tea_players) {
		this.tea_players = tea_players;
	}

	@Override
	public String toString() {
		return "Team{" +
				"tea_id=" + tea_id +
				", tea_coach='" + tea_coach + '\'' +
				", tea_year='" + tea_year + '\'' +
				", tea_players=" + tea_players +
				'}';
	}
}
