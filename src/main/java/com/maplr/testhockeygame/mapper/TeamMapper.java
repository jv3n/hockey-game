package com.maplr.testhockeygame.mapper;

import com.maplr.testhockeygame.bean.TeamBean;
import com.maplr.testhockeygame.dto.TeamDto;
import com.maplr.testhockeygame.mapper.config.StandardMapperConfig;
import org.mapstruct.Mapper;

@Mapper(config = StandardMapperConfig.class)
public interface TeamMapper {

	TeamBean toBean(TeamDto dto);

	TeamDto toDto(TeamBean bean);

}