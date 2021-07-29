package com.maplr.testhockeygame.mapper;

import com.maplr.testhockeygame.bean.PlayerBean;
import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.mapper.config.StandardMapperConfig;
import org.mapstruct.Mapper;

@Mapper(config = StandardMapperConfig.class)
public interface PlayerMapper {

	PlayerBean toBean(PlayerDto dto);

	PlayerDto toDto(PlayerBean bean);

}