package it.unikey.esdata_01.PL.controller;

import it.unikey.esdata_01.BLL.Dto.ClassDTO;
import it.unikey.esdata_01.BLL.service.abstracts.ClassService;
import it.unikey.esdata_01.PL.mapper.impl.ClassRestMapper;
import it.unikey.esdata_01.PL.rest.ClassRest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/class")
public class ClassController {

    private final ClassService classService;
    private final ClassRestMapper classRestMapper;


    @GetMapping
    private ResponseEntity<List<ClassRest>> getAllClass(){
        List<ClassDTO> classDTOList = classService.getAll();
        List<ClassRest> classRests = classRestMapper.fromDtoListToRestList(classDTOList);
        return new ResponseEntity<>(classRests, HttpStatus.OK);
    }

}
