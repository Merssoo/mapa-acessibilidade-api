package com.criativity.mapa_acessibilidade.mapper;

import com.criativity.mapa_acessibilidade.dto.LocaisDto;
import com.criativity.mapa_acessibilidade.model.Locais;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocaisMapper {

   LocaisDto toDTO(Locais locais);

   Locais toEntity(LocaisDto locaisDto);
}
