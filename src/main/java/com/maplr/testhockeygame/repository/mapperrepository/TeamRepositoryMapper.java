package com.maplr.testhockeygame.repository.mapperrepository;

import com.maplr.testhockeygame.bean.TeamBean;
import com.maplr.testhockeygame.mapper.config.StandardMapperConfig;
import com.maplr.testhockeygame.repository.entity.Team;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = StandardMapperConfig.class, uses = PlayerRepositoryMapper.class)
public interface TeamRepositoryMapper {

	@Mapping(target = "tea_id", source = "id")
	@Mapping(target = "tea_coach", source = "coach")
	@Mapping(target = "tea_year", source = "year")
	@Mapping(target = "tea_players", source = "players")
	Team toEntity(TeamBean bean);

	@InheritInverseConfiguration
	TeamBean toBean(Team entity);

}