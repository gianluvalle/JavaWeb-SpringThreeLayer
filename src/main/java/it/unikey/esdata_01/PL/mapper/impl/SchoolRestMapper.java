package it.unikey.esdata_01.PL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.PL.mapper.abstracts.GenericRestMapper;
import it.unikey.esdata_01.PL.rest.SchoolRest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SchoolRestMapper extends GenericRestMapper<SchoolDTO, SchoolRest> {
    @Override
    SchoolRest fromDtoToRest(SchoolDTO dto);

    @Override
    List<SchoolRest> fromDtoListToRestList(List<SchoolDTO> dtos);
}
