package com.finan.orcamento.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Casas")
public class Casa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quartos_casa")
    private BigDecimal quartos;

    @Column(name = "banheiros_casa")
    private BigDecimal banheiros;

    @Column(name = "churrasqueiras_casa")
    private BigDecimal churrasqueira;

    public BigDecimal getQuartos() {
        return quartos;
    }

    public BigDecimal getBanheiros() {
        return banheiros;
    }

    public boolean isChurrasqueira() {
        return churrasqueira.compareTo(BigDecimal.ZERO) > 0;
    }

    public Casa(BigDecimal quartos, BigDecimal banheiros, BigDecimal churrasqueira) {
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasqueira = churrasqueira;
    }

}
