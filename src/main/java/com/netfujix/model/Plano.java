package com.netfujix.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Plano {

    @Id
    @GeneratedValue
    @NotNull
    private Integer id;
    @NotNull
    private Integer duracaoDias;
    @NotNull
    private String nome;
    @NotNull
    private Double valor;



}
