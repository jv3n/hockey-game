package com.maplr.testhockeygame.repository.springrepository;

import com.maplr.testhockeygame.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SpringPlayerRepository extends JpaRepository<Player, Long> {

	Player save(Player pLayer);

	@Modifying
	@Query("update Player p set p.isCaptain = :isCaptain where p.teamId = :teamId")
	void updateIsCaptain(@Param("teamId") Long teamId, @Param("isCaptain") Boolean isCaptain);

}