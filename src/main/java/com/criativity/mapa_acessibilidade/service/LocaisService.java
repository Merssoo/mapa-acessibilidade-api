package com.criativity.mapa_acessibilidade.service;

import com.criativity.mapa_acessibilidade.dto.LocaisDto;
import com.criativity.mapa_acessibilidade.mapper.LocaisMapper;
import com.criativity.mapa_acessibilidade.model.Locais;
import com.criativity.mapa_acessibilidade.repository.LocaisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocaisService {

    private final LocaisRepository repository;
    private final LocaisMapper mapper;


    public LocaisDto save(LocaisDto dto) {
        Locais locais = repository.save(mapper.ToEntity(dto));
        return mapper.toDTO(locais);
    }

    public Page<LocaisDto> findAll(int offset, int size) {
        int page = offset / size;
        PageRequest pageable = PageRequest.of(page, size);
        return repository.findAll(pageable)
                .map(mapper::toDTO);
    }
}
