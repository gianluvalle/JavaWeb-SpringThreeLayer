package it.unikey.esdata_01.PL.controller;

import it.unikey.esdata_01.BLL.Dto.SchoolDTO;
import it.unikey.esdata_01.BLL.service.abstracts.SchoolService;
import it.unikey.esdata_01.PL.mapper.impl.SchoolRestMapper;
import it.unikey.esdata_01.PL.rest.SchoolRest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;
    private final SchoolRestMapper schoolRestMapper;

    @GetMapping
    private ResponseEntity<List<SchoolRest>> getAllSchool(){
        List<SchoolDTO> schoolDTOList = schoolService.getAll();
        List<SchoolRest> schoolRestList = schoolRestMapper.fromDtoListToRestList(schoolDTOList);
        return new ResponseEntity<>(schoolRestList, HttpStatus.OK);
    }
}
