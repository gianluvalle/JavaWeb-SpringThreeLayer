package it.unikey.esdata_01.BLL.service.abstracts;

import it.unikey.esdata_01.BLL.exception.NotFoundException;

import java.util.List;

public interface CrudService<T> {
    T insert(T dto);
    T getById(Integer id) throws NotFoundException;
    List<T> getAll();
    T update(T dto) throws NotFoundException;
    void delete(Integer id) throws NotFoundException;
}
