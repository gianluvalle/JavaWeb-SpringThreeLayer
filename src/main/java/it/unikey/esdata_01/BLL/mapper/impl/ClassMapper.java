package it.unikey.esdata_01.BLL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.BLL.mapper.abstracts.GenericMapper;
import it.unikey.esdata_01.DAL.entity.ClassEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClassMapper extends GenericMapper<ClassEntity, ClassDTO> {
    @Override
    ClassDTO fromEntityToDto(ClassEntity entity);

    @Override
    List<ClassDTO> fromEntityToDtoList(List<ClassEntity> entities);
}
