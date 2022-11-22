package it.unikey.esdata_01.PL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.PL.rest.SchoolRest;
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
public class SchoolRestMapperImpl implements SchoolRestMapper {

    @Override
    public SchoolDTO fromRestToDto(SchoolRest rest) {
        if ( rest == null ) {
            return null;
        }

        SchoolDTO schoolDTO = new SchoolDTO();

        schoolDTO.setId( rest.getId() );
        schoolDTO.setFieldOfStudy( rest.getFieldOfStudy() );
        schoolDTO.setName( rest.getName() );
        schoolDTO.setAddress( rest.getAddress() );
        schoolDTO.setCity( rest.getCity() );

        return schoolDTO;
    }

    @Override
    public List<SchoolDTO> fromRestListToDtoList(List<SchoolRest> rests) {
        if ( rests == null ) {
            return null;
        }

        List<SchoolDTO> list = new ArrayList<SchoolDTO>( rests.size() );
        for ( SchoolRest schoolRest : rests ) {
            list.add( fromRestToDto( schoolRest ) );
        }

        return list;
    }

    @Override
    public SchoolRest fromDtoToRest(SchoolDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SchoolRest schoolRest = new SchoolRest();

        schoolRest.setId( dto.getId() );
        schoolRest.setFieldOfStudy( dto.getFieldOfStudy() );
        schoolRest.setName( dto.getName() );
        schoolRest.setAddress( dto.getAddress() );
        schoolRest.setCity( dto.getCity() );

        return schoolRest;
    }

    @Override
    public List<SchoolRest> fromDtoListToRestList(List<SchoolDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<SchoolRest> list = new ArrayList<SchoolRest>( dtos.size() );
        for ( SchoolDTO schoolDTO : dtos ) {
            list.add( fromDtoToRest( schoolDTO ) );
        }

        return list;
    }
}
