package it.unikey.esdata_01.PL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.StudentDTO;
import it.unikey.esdata_01.PL.mapper.abstracts.GenericRestMapper;
import it.unikey.esdata_01.PL.rest.StudentRest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentRestMapper extends GenericRestMapper<StudentDTO, StudentRest> {
    @Override
    StudentRest fromDtoToRest(StudentDTO dto);

    @Override
    List<StudentRest> fromDtoListToRestList(List<StudentDTO> dtos);
}
