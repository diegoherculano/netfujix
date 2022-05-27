package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Compra {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String data;

    @OneToOne
    private CartaoCredito cartaoCredito;

    @OneToOne
    private Usuario usuario;

    @OneToOne
    private Plano plano;
}
