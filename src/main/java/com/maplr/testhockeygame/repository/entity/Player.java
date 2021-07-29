package com.maplr.testhockeygame.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_player")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_gen")
	@SequenceGenerator(name = "player_gen", sequenceName = "seq_pla_number", allocationSize = 1)
	Long pla_number;
	Long pla_team_id;
	String pla_name;
	String pla_lastname;
	String pla_position;
	Boolean pla_is_captain;

	public Long getPla_number() {
		return pla_number;
	}

	public Player setPla_number(Long pla_number) {
		this.pla_number = pla_number;
		return this;
	}

	public Long getPla_team_id() {
		return pla_team_id;
	}

	public Player setPla_team_id(Long pla_team_id) {
		this.pla_team_id = pla_team_id;
		return this;
	}

	public String getPla_name() {
		return pla_name;
	}

	public Player setPla_name(String pla_name) {
		this.pla_name = pla_name;
		return this;
	}

	public String getPla_lastname() {
		return pla_lastname;
	}

	public Player setPla_lastname(String pla_lastname) {
		this.pla_lastname = pla_lastname;
		return this;
	}

	public String getPla_position() {
		return pla_position;
	}

	public Player setPla_position(String pla_position) {
		this.pla_position = pla_position;
		return this;
	}

	public Boolean getPla_is_captain() {
		return pla_is_captain;
	}

	public Player setPla_is_captain(Boolean pla_is_captain) {
		this.pla_is_captain = pla_is_captain;
		return this;
	}

	@Override
	public String toString() {
		return "Player{" +
				"pla_number=" + pla_number +
				", pla_team_id=" + pla_team_id +
				", pla_name='" + pla_name + '\'' +
				", pla_lastname='" + pla_lastname + '\'' +
				", pla_position='" + pla_position + '\'' +
				", pla_is_captain=" + pla_is_captain +
				'}';
	}
}