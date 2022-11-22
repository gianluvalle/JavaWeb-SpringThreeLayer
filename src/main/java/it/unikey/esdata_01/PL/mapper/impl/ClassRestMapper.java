package it.unikey.esdata_01.PL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.PL.mapper.abstracts.GenericRestMapper;
import it.unikey.esdata_01.PL.rest.ClassRest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClassRestMapper extends GenericRestMapper<ClassDTO, ClassRest> {
    @Override
    ClassRest fromDtoToRest(ClassDTO dto);

    @Override
    List<ClassRest> fromDtoListToRestList(List<ClassDTO> dtos);
}
