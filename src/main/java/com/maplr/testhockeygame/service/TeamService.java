package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.entity.Team;
import com.maplr.testhockeygame.repository.TeamRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TeamService {

	private final TeamRepository teamRepository;

	public TeamService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public Team findTeamByYear(String year) {
		return teamRepository.findByYear(year);
	}
}