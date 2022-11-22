package it.unikey.esdata_01.BLL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.BLL.mapper.abstracts.GenericMapper;
import it.unikey.esdata_01.DAL.entity.SchoolEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SchoolMapper extends GenericMapper<SchoolEntity, SchoolDTO> {
    @Override
    SchoolDTO fromEntityToDto(SchoolEntity entity);

    @Override
    List<SchoolDTO> fromEntityToDtoList(List<SchoolEntity> entities);
}
