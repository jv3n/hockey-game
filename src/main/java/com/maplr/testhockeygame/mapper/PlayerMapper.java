package com.maplr.testhockeygame.mapper;

import com.maplr.testhockeygame.entity.Player;
import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.mapper.config.StandardMapperConfig;
import org.mapstruct.Mapper;

@Mapper(config = StandardMapperConfig.class)
public interface PlayerMapper {

	Player toBean(PlayerDto dto);

	PlayerDto toDto(Player bean);

}