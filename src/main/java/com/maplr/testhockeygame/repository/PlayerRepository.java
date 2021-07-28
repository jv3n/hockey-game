package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.entity.Player;

public interface PlayerRepository {
	Player create(Player player);

	Player updateCaptain(Long number);
}