package br.com.augustobellinaso.myinvest.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long codigo;

    private String codigoAtivo;

    private Double valorCota;

    private Integer quantidadeCotas;

    private LocalDate dataCompra;

    @ManyToOne
    @JoinColumn(name = "fk_codigo_categoria")
    private Categoria categoria;
}
