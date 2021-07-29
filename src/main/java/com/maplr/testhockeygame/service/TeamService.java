package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.bean.TeamBean;
import com.maplr.testhockeygame.repository.entity.Team;

public interface TeamService {

	/**
	 * Recherche la team selon l'année
	 *
	 * @param year année
	 * @return {@link Team}
	 */
	TeamBean findTeamByYear(String year);
}