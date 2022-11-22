package it.unikey.esdata_01.PL.rest;

import lombok.Data;

@Data
public class ClassRest {
    private Integer id;
    private String section;
    private Integer number;
    private Integer hour;
    private SchoolRest school;
}
