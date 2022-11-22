package it.unikey.esdata_01.PL.rest;

import lombok.Data;

@Data
public class SchoolRest {
    private Integer id;
    private String fieldOfStudy;
    private String name;
    private String address;
    private String city;
}
