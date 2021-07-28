package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.entity.Team;

public interface TeamRepository {
	Team findByYear(String year);
}