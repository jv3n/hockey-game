package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.entity.Player;
import com.maplr.testhockeygame.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PlayerService {

	private final PlayerRepository repository;

	public PlayerService(PlayerRepository repository) {
		this.repository = repository;
	}

	public Player create(Player player) {
		return repository.create(player);
	}

	public Player updateCaptain(Long number) {
		return repository.updateCaptain(number);
	}
}