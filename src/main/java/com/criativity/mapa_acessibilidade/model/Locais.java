package com.criativity.mapa_acessibilidade.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "locais")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Locais {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locais_seq")
    @SequenceGenerator(name = "locais_seq", sequenceName = "seq_locais", allocationSize = 1)
    private Long id;

    @Column(name = "bairro")
    @NotNull
    private String bairro;

    @Column(name = "rua")
    @NotNull
    private String rua;

    @Column(name = "tipo_local")
    @NotNull
    private String tipoLocal;

    @Column(name = "acessivel")
    @NotNull
    private boolean acessivel;

    @Column(name = "descricao")
    private String descricao;
}
