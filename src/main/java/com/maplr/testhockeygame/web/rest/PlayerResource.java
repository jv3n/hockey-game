package com.maplr.testhockeygame.web.rest;

import com.maplr.testhockeygame.bean.PlayerBean;
import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.mapper.PlayerMapper;
import com.maplr.testhockeygame.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/player", headers = "Accept=application/json")
public class PlayerResource {

	private final PlayerService playerService;
	private final PlayerMapper playerMapper;

	public PlayerResource(PlayerService playerService, PlayerMapper playerMapper) {
		this.playerService = playerService;
		this.playerMapper = playerMapper;
	}

	@PostMapping()
	public ResponseEntity<PlayerDto> create(@RequestBody PlayerDto playerDto) {
		PlayerBean createdPlayer = playerService.create(playerMapper.toBean(playerDto));
		return ResponseEntity.status(201).body(playerMapper.toDto(createdPlayer));
	}

	@PutMapping("/captain/{number}")
	public ResponseEntity<PlayerDto> updateCaptain(@PathVariable Long number) {
		return ResponseEntity.ok(playerMapper.toDto(playerService.updateCaptain(number)));
	}
}
