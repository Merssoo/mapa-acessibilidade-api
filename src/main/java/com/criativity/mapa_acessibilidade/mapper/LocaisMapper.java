package com.criativity.mapa_acessibilidade.mapper;

import com.criativity.mapa_acessibilidade.dto.LocaisDto;
import com.criativity.mapa_acessibilidade.model.Locais;

public class LocaisMapper {

    public LocaisDto toDTO(Locais locais) {
        return new LocaisDto(
                locais.getId(),
                locais.getBairro(),
                locais.getRua(),
                locais.getTipoLocal(),
                locais.isAcessivel(),
                locais.getDescricao()
        );
    }

    public Locais ToEntity(LocaisDto locaisDto) {
        return Locais.builder()
                .bairro(locaisDto.bairro())
                .rua(locaisDto.rua())
                .tipoLocal(locaisDto.tipoLocal())
                .acessivel(locaisDto.acessivel())
                .descricao(locaisDto.descricao())
                .build();
    }
}
