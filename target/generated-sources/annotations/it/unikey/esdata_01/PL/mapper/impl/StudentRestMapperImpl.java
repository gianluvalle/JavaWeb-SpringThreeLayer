package it.unikey.esdata_01.PL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.BLL.Dto.StudentDTO;
import it.unikey.esdata_01.PL.rest.ClassRest;
import it.unikey.esdata_01.PL.rest.SchoolRest;
import it.unikey.esdata_01.PL.rest.StudentRest;
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
public class StudentRestMapperImpl implements StudentRestMapper {

    @Override
    public StudentDTO fromRestToDto(StudentRest rest) {
        if ( rest == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( rest.getId() );
        studentDTO.setName( rest.getName() );
        studentDTO.setSurname( rest.getSurname() );
        studentDTO.setAge( rest.getAge() );
        studentDTO.setFiscalCode( rest.getFiscalCode() );
        studentDTO.setClasses( classRestToClassDTO( rest.getClasses() ) );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> fromRestListToDtoList(List<StudentRest> rests) {
        if ( rests == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( rests.size() );
        for ( StudentRest studentRest : rests ) {
            list.add( fromRestToDto( studentRest ) );
        }

        return list;
    }

    @Override
    public StudentRest fromDtoToRest(StudentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StudentRest studentRest = new StudentRest();

        studentRest.setId( dto.getId() );
        studentRest.setName( dto.getName() );
        studentRest.setSurname( dto.getSurname() );
        studentRest.setAge( dto.getAge() );
        studentRest.setFiscalCode( dto.getFiscalCode() );
        studentRest.setClasses( classDTOToClassRest( dto.getClasses() ) );

        return studentRest;
    }

    @Override
    public List<StudentRest> fromDtoListToRestList(List<StudentDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<StudentRest> list = new ArrayList<StudentRest>( dtos.size() );
        for ( StudentDTO studentDTO : dtos ) {
            list.add( fromDtoToRest( studentDTO ) );
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

    protected ClassDTO classRestToClassDTO(ClassRest classRest) {
        if ( classRest == null ) {
            return null;
        }

        ClassDTO classDTO = new ClassDTO();

        classDTO.setId( classRest.getId() );
        classDTO.setSection( classRest.getSection() );
        classDTO.setNumber( classRest.getNumber() );
        classDTO.setHour( classRest.getHour() );
        classDTO.setSchool( schoolRestToSchoolDTO( classRest.getSchool() ) );

        return classDTO;
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

    protected ClassRest classDTOToClassRest(ClassDTO classDTO) {
        if ( classDTO == null ) {
            return null;
        }

        ClassRest classRest = new ClassRest();

        classRest.setId( classDTO.getId() );
        classRest.setSection( classDTO.getSection() );
        classRest.setNumber( classDTO.getNumber() );
        classRest.setHour( classDTO.getHour() );
        classRest.setSchool( schoolDTOToSchoolRest( classDTO.getSchool() ) );

        return classRest;
    }
}
