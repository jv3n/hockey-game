package com.maplr.testhockeygame.repository.impl;

import com.maplr.testhockeygame.entity.Team;
import com.maplr.testhockeygame.repository.TeamRepository;
import com.maplr.testhockeygame.repository.springrepository.SpringTeamRepository;
import org.springframework.stereotype.Component;

@Component
public class TeamRepositoryImpl implements TeamRepository {

	private final SpringTeamRepository repository;

	public TeamRepositoryImpl(SpringTeamRepository repository) {
		this.repository = repository;
	}

	public Team findByYear(String year) {
		return repository.findByYear(year);
	}

}