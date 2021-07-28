package com.maplr.testhockeygame.repository.impl;

import com.maplr.testhockeygame.entity.Player;
import com.maplr.testhockeygame.exception.PlayerNotFoundException;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.repository.springrepository.SpringPlayerRepository;
import org.springframework.stereotype.Component;

@Component
public class PlayerRepositoryImpl implements PlayerRepository {

	private final SpringPlayerRepository repository;

	public PlayerRepositoryImpl(SpringPlayerRepository repository) {
		this.repository = repository;
	}

	public Player create(Player player) {
		return repository.save(player);
	}

	public Player updateCaptain(Long number) {
		Player player = repository.findById(number).orElseThrow(() -> new PlayerNotFoundException("Erreur: le joueur n'existe pas en base"));

		// On met tous les cpitaines de l'equipe à false
		repository.updateIsCaptain(player.getTeamId(), false);

		return repository.save(player.setIsCaptain(true));
	}
}