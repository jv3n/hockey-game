package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.bean.TeamBean;
import com.maplr.testhockeygame.repository.entity.Team;

public interface TeamRepository {

	/**
	 * Recherche la team selon l'année
	 *
	 * @param year année
	 * @return {@link Team}
	 */
	TeamBean findByYear(String year);
}