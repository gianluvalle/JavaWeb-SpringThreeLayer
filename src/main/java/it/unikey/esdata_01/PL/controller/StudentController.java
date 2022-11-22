package it.unikey.esdata_01.PL.controller;

import it.unikey.esdata_01.BLL.Dto.StudentDTO;
import it.unikey.esdata_01.BLL.exception.NotFoundException;
import it.unikey.esdata_01.BLL.service.abstracts.StudentService;
import it.unikey.esdata_01.PL.mapper.impl.StudentRestMapper;
import it.unikey.esdata_01.PL.rest.StudentRest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;
    private final StudentRestMapper studentRestMapper;

    @GetMapping
    private ResponseEntity<List<StudentRest>> getAllStudents(){
        List<StudentDTO> studentDTOList = studentService.getAll();
        List<StudentRest> studentRestList = studentRestMapper.fromDtoListToRestList(studentDTOList);
        return new ResponseEntity<>(studentRestList, HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<StudentRest> postStudent(@RequestBody StudentRest student){
        StudentDTO studentDTO = studentService.insert(studentRestMapper.fromRestToDto(student));
        StudentRest studentRest = studentRestMapper.fromDtoToRest(studentDTO);
        return new ResponseEntity<>(studentRest, HttpStatus.CREATED);
    }

    @PutMapping
    private ResponseEntity<StudentRest> putStudent(@RequestBody StudentRest student){

        try {
            StudentDTO studentDTO = studentService.update(studentRestMapper.fromRestToDto(student));
            StudentRest studentRest = studentRestMapper.fromDtoToRest(studentDTO);
            return new ResponseEntity<>(studentRest, HttpStatus.OK);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    private ResponseEntity<Void> deleteStudent(@PathVariable("id") Integer id){
        try {
            studentService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
