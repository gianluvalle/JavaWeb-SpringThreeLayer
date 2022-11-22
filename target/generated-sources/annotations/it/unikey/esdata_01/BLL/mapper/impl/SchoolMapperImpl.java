package it.unikey.esdata_01.BLL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
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
public class SchoolMapperImpl implements SchoolMapper {

    @Override
    public SchoolEntity fromDtoToEntity(SchoolDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SchoolEntity schoolEntity = new SchoolEntity();

        schoolEntity.setId( dto.getId() );
        schoolEntity.setFieldOfStudy( dto.getFieldOfStudy() );
        schoolEntity.setName( dto.getName() );
        schoolEntity.setAddress( dto.getAddress() );
        schoolEntity.setCity( dto.getCity() );

        return schoolEntity;
    }

    @Override
    public List<SchoolEntity> fromDtoToEntityList(List<SchoolDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<SchoolEntity> list = new ArrayList<SchoolEntity>( dtos.size() );
        for ( SchoolDTO schoolDTO : dtos ) {
            list.add( fromDtoToEntity( schoolDTO ) );
        }

        return list;
    }

    @Override
    public SchoolDTO fromEntityToDto(SchoolEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SchoolDTO schoolDTO = new SchoolDTO();

        schoolDTO.setId( entity.getId() );
        schoolDTO.setFieldOfStudy( entity.getFieldOfStudy() );
        schoolDTO.setName( entity.getName() );
        schoolDTO.setAddress( entity.getAddress() );
        schoolDTO.setCity( entity.getCity() );

        return schoolDTO;
    }

    @Override
    public List<SchoolDTO> fromEntityToDtoList(List<SchoolEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SchoolDTO> list = new ArrayList<SchoolDTO>( entities.size() );
        for ( SchoolEntity schoolEntity : entities ) {
            list.add( fromEntityToDto( schoolEntity ) );
        }

        return list;
    }
}
