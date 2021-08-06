package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.bean.PlayerBean;

public interface PlayerService {

	/**
	 * Creation d'un player
	 *
	 * @param player player
	 * @return {@link PlayerBean}
	 */
	PlayerBean create(PlayerBean player);

	/**
	 * Update d'un player pour le passer en capitaine de son équipe
	 *
	 * @param number numero du player
	 * @return {@link PlayerBean}
	 */
	PlayerBean updateCaptain(Long number);
}