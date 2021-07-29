package com.maplr.testhockeygame.web.rest;

import com.maplr.testhockeygame.dto.TeamDto;
import com.maplr.testhockeygame.mapper.TeamMapper;
import com.maplr.testhockeygame.service.TeamService;
import com.maplr.testhockeygame.service.impl.TeamServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/team")
public class TeamResource {

	private final TeamService teamService;
	private final TeamMapper teamMapper;

	public TeamResource(TeamService teamService, TeamMapper teamMapper) {
		this.teamService = teamService;
		this.teamMapper = teamMapper;
	}

	@GetMapping("/{year}")
	public ResponseEntity<TeamDto> getTeam(@PathVariable String year) {
		return ResponseEntity.ok(teamMapper.toDto(teamService.findTeamByYear(year)));
	}

}
