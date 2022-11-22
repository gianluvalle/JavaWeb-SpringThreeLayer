package it.unikey.esdata_01.BLL.Dto;

import lombok.Data;

@Data
public class ClassDTO {
    private Integer id;
    private String section;
    private Integer number;
    private Integer hour;
    private SchoolDTO school;
}
