package it.unikey.esdata_01.BLL.Dto;

import lombok.Data;

@Data
public class SchoolDTO {
    private Integer id;
    private String fieldOfStudy;
    private String name;
    private String address;
    private String city;
}
