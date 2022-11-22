package it.unikey.esdata_01.BLL.mapper.impl;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.BLL.Dto.StudentDTO;
import it.unikey.esdata_01.DAL.entity.ClassEntity;
import it.unikey.esdata_01.DAL.entity.SchoolEntity;
import it.unikey.esdata_01.DAL.entity.StudentEntity;
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
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentEntity fromDtoToEntity(StudentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setId( dto.getId() );
        studentEntity.setName( dto.getName() );
        studentEntity.setSurname( dto.getSurname() );
        studentEntity.setAge( dto.getAge() );
        studentEntity.setFiscalCode( dto.getFiscalCode() );
        studentEntity.setClasses( classDTOToClassEntity( dto.getClasses() ) );

        return studentEntity;
    }

    @Override
    public List<StudentEntity> fromDtoToEntityList(List<StudentDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<StudentEntity> list = new ArrayList<StudentEntity>( dtos.size() );
        for ( StudentDTO studentDTO : dtos ) {
            list.add( fromDtoToEntity( studentDTO ) );
        }

        return list;
    }

    @Override
    public StudentDTO fromEntityToDto(StudentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( entity.getId() );
        studentDTO.setName( entity.getName() );
        studentDTO.setSurname( entity.getSurname() );
        studentDTO.setAge( entity.getAge() );
        studentDTO.setFiscalCode( entity.getFiscalCode() );
        studentDTO.setClasses( classEntityToClassDTO( entity.getClasses() ) );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> fromEntityToDtoList(List<StudentEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( entities.size() );
        for ( StudentEntity studentEntity : entities ) {
            list.add( fromEntityToDto( studentEntity ) );
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

    protected ClassEntity classDTOToClassEntity(ClassDTO classDTO) {
        if ( classDTO == null ) {
            return null;
        }

        ClassEntity classEntity = new ClassEntity();

        classEntity.setId( classDTO.getId() );
        classEntity.setSection( classDTO.getSection() );
        classEntity.setNumber( classDTO.getNumber() );
        classEntity.setHour( classDTO.getHour() );
        classEntity.setSchool( schoolDTOToSchoolEntity( classDTO.getSchool() ) );

        return classEntity;
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

    protected ClassDTO classEntityToClassDTO(ClassEntity classEntity) {
        if ( classEntity == null ) {
            return null;
        }

        ClassDTO classDTO = new ClassDTO();

        classDTO.setId( classEntity.getId() );
        classDTO.setSection( classEntity.getSection() );
        classDTO.setNumber( classEntity.getNumber() );
        classDTO.setHour( classEntity.getHour() );
        classDTO.setSchool( schoolEntityToSchoolDTO( classEntity.getSchool() ) );

        return classDTO;
    }
}
