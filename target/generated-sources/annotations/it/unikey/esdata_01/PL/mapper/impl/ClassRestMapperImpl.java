package it.unikey.esdata_01.PL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.PL.rest.ClassRest;
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
public class ClassRestMapperImpl implements ClassRestMapper {

    @Override
    public ClassDTO fromRestToDto(ClassRest rest) {
        if ( rest == null ) {
            return null;
        }

        ClassDTO classDTO = new ClassDTO();

        classDTO.setId( rest.getId() );
        classDTO.setSection( rest.getSection() );
        classDTO.setNumber( rest.getNumber() );
        classDTO.setHour( rest.getHour() );
        classDTO.setSchool( schoolRestToSchoolDTO( rest.getSchool() ) );

        return classDTO;
    }

    @Override
    public List<ClassDTO> fromRestListToDtoList(List<ClassRest> rests) {
        if ( rests == null ) {
            return null;
        }

        List<ClassDTO> list = new ArrayList<ClassDTO>( rests.size() );
        for ( ClassRest classRest : rests ) {
            list.add( fromRestToDto( classRest ) );
        }

        return list;
    }

    @Override
    public ClassRest fromDtoToRest(ClassDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ClassRest classRest = new ClassRest();

        classRest.setId( dto.getId() );
        classRest.setSection( dto.getSection() );
        classRest.setNumber( dto.getNumber() );
        classRest.setHour( dto.getHour() );
        classRest.setSchool( schoolDTOToSchoolRest( dto.getSchool() ) );

        return classRest;
    }

    @Override
    public List<ClassRest> fromDtoListToRestList(List<ClassDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ClassRest> list = new ArrayList<ClassRest>( dtos.size() );
        for ( ClassDTO classDTO : dtos ) {
            list.add( fromDtoToRest( classDTO ) );
        }

        return list;
    }

    protected SchoolDTO schoolRestToSchoolDTO(SchoolRest schoolRest) {
        if ( schoolRest == null ) {
            return null;
        }

        SchoolDTO schoolDTO = new SchoolDTO();

        schoolDTO.setId( schoolRest.getId() );
        schoolDTO.setFieldOfStudy( schoolRest.getFieldOfStudy() );
        schoolDTO.setName( schoolRest.getName() );
        schoolDTO.setAddress( schoolRest.getAddress() );
        schoolDTO.setCity( schoolRest.getCity() );

        return schoolDTO;
    }

    protected SchoolRest schoolDTOToSchoolRest(SchoolDTO schoolDTO) {
        if ( schoolDTO == null ) {
            return null;
        }

        SchoolRest schoolRest = new SchoolRest();

        schoolRest.setId( schoolDTO.getId() );
        schoolRest.setFieldOfStudy( schoolDTO.getFieldOfStudy() );
        schoolRest.setName( schoolDTO.getName() );
        schoolRest.setAddress( schoolDTO.getAddress() );
        schoolRest.setCity( schoolDTO.getCity() );

        return schoolRest;
    }
}
