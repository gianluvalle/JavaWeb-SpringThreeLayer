package it.unikey.esdata_01.PL.rest;

import lombok.Data;

@Data
public class StudentRest {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String fiscalCode;
    private ClassRest classes;
}
