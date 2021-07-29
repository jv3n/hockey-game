package com.maplr.testhockeygame.repository.impl;

import com.maplr.testhockeygame.bean.TeamBean;
import com.maplr.testhockeygame.repository.TeamRepository;
import com.maplr.testhockeygame.repository.mapperrepository.TeamRepositoryMapper;
import com.maplr.testhockeygame.repository.springrepository.SpringTeamRepository;
import org.springframework.stereotype.Component;

@Component
public class TeamRepositoryImpl implements TeamRepository {

	private final SpringTeamRepository repository;
	private final TeamRepositoryMapper teamRepositoryMapper;

	public TeamRepositoryImpl(SpringTeamRepository repository, TeamRepositoryMapper teamRepositoryMapper) {
		this.repository = repository;
		this.teamRepositoryMapper = teamRepositoryMapper;
	}

	public TeamBean findByYear(String year) {
		return teamRepositoryMapper.toBean(repository.findByYear(year));
	}

}