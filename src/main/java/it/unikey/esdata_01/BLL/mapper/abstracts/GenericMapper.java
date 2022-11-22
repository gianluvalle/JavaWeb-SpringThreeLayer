package it.unikey.esdata_01.BLL.mapper.abstracts;

import java.util.List;

public interface GenericMapper<E, D> {
    D fromEntityToDto(E entity);
    E fromDtoToEntity(D dto);
    List<D> fromEntityToDtoList(List<E> entities);
    List<E> fromDtoToEntityList(List<D> dtos);
}
