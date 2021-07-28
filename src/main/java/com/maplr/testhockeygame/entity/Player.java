package com.maplr.testhockeygame.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_player")
public class Player {
	@Id
	@GeneratedValue
	Long number;
	Long teamId;
	String name;
	String lastname;
	String position;
	Boolean isCaptain;

	public Long getNumber() {
		return number;
	}

	public Player setNumber(Long number) {
		this.number = number;
		return this;
	}

	public Long getTeamId() {
		return teamId;
	}

	public Player setTeamId(Long teamId) {
		this.teamId = teamId;
		return this;
	}

	public String getName() {
		return name;
	}

	public Player setName(String name) {
		this.name = name;
		return this;
	}

	public String getLastname() {
		return lastname;
	}

	public Player setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public Player setPosition(String position) {
		this.position = position;
		return this;
	}

	public boolean getIsCaptain() {
		return isCaptain;
	}

	public Player setIsCaptain(boolean captain) {
		isCaptain = captain;
		return this;
	}

	@Override
	public String toString() {
		return "Player{" +
				"number=" + number +
				", teamId=" + teamId +
				", name='" + name + '\'' +
				", lastname='" + lastname + '\'' +
				", position='" + position + '\'' +
				", isCaptain=" + isCaptain +
				'}';
	}
}