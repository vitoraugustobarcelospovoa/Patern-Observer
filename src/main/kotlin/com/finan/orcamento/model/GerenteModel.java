package com.finan.orcamento.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Gerente")
public class GerenteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "NomeEstoque")
    private String nomeEstoque;

    @NotNull
    @Column(name = "Estoque")
    private BigDecimal estoque;

    public GerenteModel(Long id, String nome, BigDecimal estoque) {
        this.id = id;
        this.nomeEstoque = nome;
        this.estoque = estoque;
    }

    public GerenteModel(long id, String joão, double v) {
    }
}
