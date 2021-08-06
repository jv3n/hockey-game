package com.maplr.testhockeygame.dto;

public class PlayerDto {
	Long number;
	Long teamId;
	String name;
	String lastname;
	String position;
	Boolean isCaptain;

	public Long getNumber() {
		return number;
	}

	public PlayerDto setNumber(Long number) {
		this.number = number;
		return this;
	}

	public Long getTeamId() {
		return teamId;
	}

	public PlayerDto setTeamId(Long teamId) {
		this.teamId = teamId;
		return this;
	}

	public String getName() {
		return name;
	}

	public PlayerDto setName(String name) {
		this.name = name;
		return this;
	}

	public String getLastname() {
		return lastname;
	}

	public PlayerDto setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public PlayerDto setPosition(String position) {
		this.position = position;
		return this;
	}

	public boolean getIsCaptain() {
		return isCaptain;
	}

	public PlayerDto setIsCaptain(boolean captain) {
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