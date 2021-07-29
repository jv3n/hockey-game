package com.maplr.testhockeygame.service.impl;

import com.maplr.testhockeygame.bean.PlayerBean;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

	private final PlayerRepository repository;

	public PlayerServiceImpl(PlayerRepository repository) {
		this.repository = repository;
	}

	public PlayerBean create(PlayerBean player) {
		return repository.create(player);
	}

	public PlayerBean updateCaptain(Long number) {
		return repository.updateCaptain(number);
	}
}