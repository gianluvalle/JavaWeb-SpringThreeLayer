package it.unikey.esdata_01.BLL.service.impl;

import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.BLL.exception.NotFoundException;
import it.unikey.esdata_01.BLL.mapper.impl.SchoolMapper;
import it.unikey.esdata_01.BLL.service.abstracts.SchoolService;
import it.unikey.esdata_01.DAL.entity.SchoolEntity;
import it.unikey.esdata_01.DAL.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;
    @Override
    public SchoolDTO insert(SchoolDTO dto) {
        SchoolEntity schoolToInsert = schoolMapper.fromDtoToEntity(dto);
        SchoolEntity schoolInsert = schoolRepository.save(schoolToInsert);
        return schoolMapper.fromEntityToDto(schoolInsert);
    }

    @Override
    public SchoolDTO getById(Integer id) throws NotFoundException {
        SchoolEntity schoolId = schoolRepository.findById(id).orElseThrow(() -> new NotFoundException("Student not found in DB"));
        return schoolMapper.fromEntityToDto(schoolId);
    }

    @Override
    public List<SchoolDTO> getAll() {
        List<SchoolEntity> classes = schoolRepository.findAll();
        return schoolMapper.fromEntityToDtoList(classes);
    }

    @Override
    public SchoolDTO update(SchoolDTO dto) throws NotFoundException {
        if(!schoolRepository.existsById(dto.getId()))
            throw new NotFoundException("Class not found in DB");
        SchoolEntity schoolToUpdate = schoolMapper.fromDtoToEntity(dto);
        SchoolEntity schoolUpdate = schoolRepository.save(schoolToUpdate);
        return schoolMapper.fromEntityToDto(schoolUpdate);
    }

    @Override
    public void delete(Integer id) throws NotFoundException {
        if(!schoolRepository.existsById(id))
            throw new NotFoundException("Class not found in DB");
        schoolRepository.deleteById(id);

    }
}
