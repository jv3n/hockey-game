package com.maplr.testhockeygame.repository.springrepository;

import com.maplr.testhockeygame.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SpringTeamRepository extends JpaRepository<Team, Long> {

	@Query("select t from Team t where t.year = :year")
	Team findByYear(@Param("year") String year);

}