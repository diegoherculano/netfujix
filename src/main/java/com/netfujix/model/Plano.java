package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plano {

    @Id
    @GeneratedValue
    @NotNull
    private Integer id;
    @NotNull
    @NumberFormat
    private Integer duracaoDias;
    @NotNull
    private String nome;
    @NotNull
    private Double valor;

}
