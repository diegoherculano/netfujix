package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Filme {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String titulo;

    @NotNull
    private String duracao;

    @NotNull
    private String sinopse;

    @NotNull
    @NumberFormat
    private String ano;

    @NotNull
    private String relevancia;

    @NotNull
    private String trailer;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Genero genero;

}
