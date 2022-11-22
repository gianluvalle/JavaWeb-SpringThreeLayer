package it.unikey.esdata_01.BLL.service.impl;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.BLL.exception.NotFoundException;
import it.unikey.esdata_01.BLL.mapper.impl.ClassMapper;
import it.unikey.esdata_01.BLL.service.abstracts.ClassService;
import it.unikey.esdata_01.DAL.entity.ClassEntity;
import it.unikey.esdata_01.DAL.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    private final ClassRepository classRepository;
    private final ClassMapper classMapper;

    @Override
    public ClassDTO insert(ClassDTO dto) {
        ClassEntity classToInsert = classMapper.fromDtoToEntity(dto);
        ClassEntity classInsert = classRepository.save(classToInsert);
        return classMapper.fromEntityToDto(classInsert);
    }

    @Override
    public ClassDTO getById(Integer id) throws NotFoundException {
        ClassEntity classId = classRepository.findById(id).orElseThrow(() -> new NotFoundException("Student not found in DB"));
        return classMapper.fromEntityToDto(classId);
    }

    @Override
    public List<ClassDTO> getAll() {
        List<ClassEntity> classes = classRepository.findAll();
        return classMapper.fromEntityToDtoList(classes);
    }

    @Override
    public ClassDTO update(ClassDTO dto) throws NotFoundException {
        if(!classRepository.existsById(dto.getId()))
            throw new NotFoundException("Class not found in DB");
        ClassEntity classToUpdate = classMapper.fromDtoToEntity(dto);
        ClassEntity classUpdate = classRepository.save(classToUpdate);
        return classMapper.fromEntityToDto(classUpdate);
    }

    @Override
    public void delete(Integer id) throws NotFoundException {
        if(!classRepository.existsById(id))
            throw new NotFoundException("Class not found in DB");
        classRepository.deleteById(id);
    }
}
