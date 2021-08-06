package com.maplr.testhockeygame.bean;

public class PlayerBean {
	Long number;
	Long teamId;
	String name;
	String lastname;
	String position;
	Boolean isCaptain;

	public Long getNumber() {
		return number;
	}

	public PlayerBean setNumber(Long number) {
		this.number = number;
		return this;
	}

	public Long getTeamId() {
		return teamId;
	}

	public PlayerBean setTeamId(Long teamId) {
		this.teamId = teamId;
		return this;
	}

	public String getName() {
		return name;
	}

	public PlayerBean setName(String name) {
		this.name = name;
		return this;
	}

	public String getLastname() {
		return lastname;
	}

	public PlayerBean setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public PlayerBean setPosition(String position) {
		this.position = position;
		return this;
	}

	public boolean getIsCaptain() {
		return isCaptain;
	}

	public PlayerBean setIsCaptain(boolean captain) {
		isCaptain = captain;
		return this;
	}

	@Override
	public String toString() {
		return "PlayerDto{" +
				"number=" + number +
				", teamId=" + teamId +
				", name='" + name + '\'' +
				", lastname='" + lastname + '\'' +
				", position='" + position + '\'' +
				", isCaptain=" + isCaptain +
				'}';
	}
}