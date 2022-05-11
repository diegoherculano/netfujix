package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Favoritos {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Filme filme;
    @ManyToOne
    private Usuario usuario;

}
