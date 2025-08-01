package com.criativity.mapa_acessibilidade.controller;

import com.criativity.mapa_acessibilidade.dto.LocaisDto;
import com.criativity.mapa_acessibilidade.service.LocaisService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/locais", produces = "application/json")
public class LocaisController {

    @Autowired
    private LocaisService service;

    @PostMapping
    public ResponseEntity<LocaisDto> save(@Valid @RequestBody LocaisDto dto) {
        LocaisDto localSaved = service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(localSaved);
    }

    @GetMapping
    public Page<LocaisDto> findAll(
            @RequestParam(defaultValue = "2") int limit,
            @RequestParam(defaultValue = "0") int offset) {
        return service.findAll(offset, limit);
    }
}
