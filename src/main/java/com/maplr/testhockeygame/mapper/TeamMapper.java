package com.maplr.testhockeygame.mapper;

import com.maplr.testhockeygame.entity.Team;
import com.maplr.testhockeygame.dto.TeamDto;
import com.maplr.testhockeygame.mapper.config.StandardMapperConfig;
import org.mapstruct.Mapper;

@Mapper(config = StandardMapperConfig.class)
public interface TeamMapper {

	Team toBean(TeamDto dto);

	TeamDto toDto(Team bean);

}