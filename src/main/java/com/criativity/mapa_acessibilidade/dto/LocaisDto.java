package com.criativity.mapa_acessibilidade.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LocaisDto(

     Long id,

    @NotBlank(message = "O bairro não pode ser nulo")
    String bairro,

    @NotBlank(message = "A rua não poder ser nula")
    String rua,

    @NotBlank(message = "O tipo do local não pode ser nulo")
    String tipoLocal,

    @NotNull(message = "A acessibilidade precisa estar selecinada")
    boolean acessivel,

    String descricao

) {}
