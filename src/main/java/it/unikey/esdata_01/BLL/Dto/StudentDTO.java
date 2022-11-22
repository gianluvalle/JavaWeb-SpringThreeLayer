package it.unikey.esdata_01.BLL.Dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class StudentDTO {
    @NotNull
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private Integer age;
    @NotNull
    private String fiscalCode;
    @NotNull
    private ClassDTO classes;
}
