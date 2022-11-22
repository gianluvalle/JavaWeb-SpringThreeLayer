package it.unikey.esdata_01.BLL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.StudentDTO;
import it.unikey.esdata_01.BLL.mapper.abstracts.GenericMapper;
import it.unikey.esdata_01.DAL.entity.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper extends GenericMapper<StudentEntity, StudentDTO> {

    @Override
    StudentDTO fromEntityToDto(StudentEntity entity);

    @Override
    List<StudentDTO> fromEntityToDtoList(List<StudentEntity> entities);
}
