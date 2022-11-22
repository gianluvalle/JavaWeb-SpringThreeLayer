package it.unikey.esdata_01.PL.mapper.abstracts;

import java.util.List;

public interface GenericRestMapper<D, R> {
    R fromDtoToRest(D dto);
    D fromRestToDto(R rest);
    List<R> fromDtoListToRestList(List<D> dtos);
    List<D> fromRestListToDtoList(List<R> rests);
}
