package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Genero {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String nome;

}
