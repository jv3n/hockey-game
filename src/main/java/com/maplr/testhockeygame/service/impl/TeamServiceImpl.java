package com.maplr.testhockeygame.service.impl;

import com.maplr.testhockeygame.bean.TeamBean;
import com.maplr.testhockeygame.repository.TeamRepository;
import com.maplr.testhockeygame.service.TeamService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

	private final TeamRepository teamRepository;

	public TeamServiceImpl(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public TeamBean findTeamByYear(String year) {
		return teamRepository.findByYear(year);
	}
}