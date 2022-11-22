package it.unikey.esdata_01.BLL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.DAL.entity.ClassEntity;
import it.unikey.esdata_01.DAL.entity.SchoolEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-22T12:49:38+0100",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
@Component
public class ClassMapperImpl implements ClassMapper {

    @Override
    public ClassEntity fromDtoToEntity(ClassDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ClassEntity classEntity = new ClassEntity();

        classEntity.setId( dto.getId() );
        classEntity.setSection( dto.getSection() );
        classEntity.setNumber( dto.getNumber() );
        classEntity.setHour( dto.getHour() );
        classEntity.setSchool( schoolDTOToSchoolEntity( dto.getSchool() ) );

        return classEntity;
    }

    @Override
    public List<ClassEntity> fromDtoToEntityList(List<ClassDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ClassEntity> list = new ArrayList<ClassEntity>( dtos.size() );
        for ( ClassDTO classDTO : dtos ) {
            list.add( fromDtoToEntity( classDTO ) );
        }

        return list;
    }

    @Override
    public ClassDTO fromEntityToDto(ClassEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ClassDTO classDTO = new ClassDTO();

        classDTO.setId( entity.getId() );
        classDTO.setSection( entity.getSection() );
        classDTO.setNumber( entity.getNumber() );
        classDTO.setHour( entity.getHour() );
        classDTO.setSchool( schoolEntityToSchoolDTO( entity.getSchool() ) );

        return classDTO;
    }

    @Override
    public List<ClassDTO> fromEntityToDtoList(List<ClassEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ClassDTO> list = new ArrayList<ClassDTO>( entities.size() );
        for ( ClassEntity classEntity : entities ) {
            list.add( fromEntityToDto( classEntity ) );
        }

        return list;
    }

    protected SchoolEntity schoolDTOToSchoolEntity(SchoolDTO schoolDTO) {
        if ( schoolDTO == null ) {
            return null;
        }

        SchoolEntity schoolEntity = new SchoolEntity();

        schoolEntity.setId( schoolDTO.getId() );
        schoolEntity.setFieldOfStudy( schoolDTO.getFieldOfStudy() );
        schoolEntity.setName( schoolDTO.getName() );
        schoolEntity.setAddress( schoolDTO.getAddress() );
        schoolEntity.setCity( schoolDTO.getCity() );

        return schoolEntity;
    }

    protected SchoolDTO schoolEntityToSchoolDTO(SchoolEntity schoolEntity) {
        if ( schoolEntity == null ) {
            return null;
        }

        SchoolDTO schoolDTO = new SchoolDTO();

        schoolDTO.setId( schoolEntity.getId() );
        schoolDTO.setFieldOfStudy( schoolEntity.getFieldOfStudy() );
        schoolDTO.setName( schoolEntity.getName() );
        schoolDTO.setAddress( schoolEntity.getAddress() );
        schoolDTO.setCity( schoolEntity.getCity() );

        return schoolDTO;
    }
}
