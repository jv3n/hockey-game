package com.maplr.testhockeygame.repository.impl;

import com.maplr.testhockeygame.bean.PlayerBean;
import com.maplr.testhockeygame.repository.entity.Player;
import com.maplr.testhockeygame.exception.PlayerNotFoundException;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.repository.mapperrepository.PlayerRepositoryMapper;
import com.maplr.testhockeygame.repository.springrepository.SpringPlayerRepository;
import org.springframework.stereotype.Component;

@Component
public class PlayerRepositoryImpl implements PlayerRepository {

	private final SpringPlayerRepository repository;
	private final PlayerRepositoryMapper repositoryMapper;

	public PlayerRepositoryImpl(SpringPlayerRepository repository, PlayerRepositoryMapper repositoryMapper) {
		this.repository = repository;
		this.repositoryMapper = repositoryMapper;
	}

	public PlayerBean create(PlayerBean player) {
		return repositoryMapper.toBean(repository.save(repositoryMapper.toEntity(player)));
	}

	public PlayerBean updateCaptain(Long number) {
		Player player = repository.findById(number).orElseThrow(() -> new PlayerNotFoundException("Erreur: le joueur n'existe pas en base"));

		// On met tous les cpitaines de l'equipe à false
		repository.updateIsCaptain(player.getPla_team_id(), false);

		return repositoryMapper.toBean(repository.save(player.setPla_is_captain(true)));
	}
}