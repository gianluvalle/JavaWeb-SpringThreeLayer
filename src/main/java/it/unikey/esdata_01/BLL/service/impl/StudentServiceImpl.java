package it.unikey.esdata_01.BLL.service.impl;

import it.unikey.esdata_01.BLL.Dto.StudentDTO;
import it.unikey.esdata_01.BLL.exception.NotFoundException;
import it.unikey.esdata_01.BLL.mapper.impl.StudentMapper;
import it.unikey.esdata_01.BLL.service.abstracts.StudentService;
import it.unikey.esdata_01.DAL.entity.StudentEntity;
import it.unikey.esdata_01.DAL.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;


    @Override
    public StudentDTO insert(StudentDTO dto) {
        StudentEntity studentToInsert = studentMapper.fromDtoToEntity(dto);
        StudentEntity studentInsert = studentRepository.save(studentToInsert);
        return studentMapper.fromEntityToDto(studentInsert);
//        return studentMapper.fromEntityToDto(studentRepository.save(studentMapper.fromDtoToEntity(dto)))
    }

    @Override
    public StudentDTO getById(Integer id) throws NotFoundException {
        StudentEntity studentId = studentRepository.findById(id).orElseThrow(() -> new NotFoundException("Student not found in DB"));
        return studentMapper.fromEntityToDto(studentId);
    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentEntity> students = studentRepository.findAll();
        return studentMapper.fromEntityToDtoList(students);
    }

    @Override
    public StudentDTO update(StudentDTO dto) throws NotFoundException {
        if(!studentRepository.existsById(dto.getId()))
            throw new NotFoundException("Student not found in DB");
        StudentEntity studentToSave = studentMapper.fromDtoToEntity(dto);
        StudentEntity studentUpdate = studentRepository.save(studentToSave);
        return studentMapper.fromEntityToDto(studentUpdate);
//        return studentMapper.fromEntityToDto(studentRepository.save(studentMapper.fromDtoToEntity(dto)))
    }

    @Override
    public void delete(Integer id) throws NotFoundException {
        if(!studentRepository.existsById(id))
            throw new NotFoundException("Student not found in DB");
        studentRepository.deleteById(id);

    }
}
