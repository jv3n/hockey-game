package com.maplr.testhockeygame.repository.mapperrepository;

import com.maplr.testhockeygame.bean.PlayerBean;
import com.maplr.testhockeygame.mapper.config.StandardMapperConfig;
import com.maplr.testhockeygame.repository.entity.Player;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = StandardMapperConfig.class)
public interface PlayerRepositoryMapper {

	@Mapping(target = "pla_number", source = "number")
	@Mapping(target = "pla_team_id", source = "teamId")
	@Mapping(target = "pla_name", source = "name")
	@Mapping(target = "pla_lastname", source = "lastname")
	@Mapping(target = "pla_position", source = "position")
	@Mapping(target = "pla_is_captain", source = "isCaptain")
	Player toEntity(PlayerBean bean);

	@InheritInverseConfiguration
	PlayerBean toBean(Player entity);

}