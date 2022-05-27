package com.netfujix.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class PessoaFisica {
    @Id
    @GeneratedValue
    private int id;
    
    @NotNull
    private String dataNasc;

    @NotNull
    @Column(name = "cpf", length = 11)
    private String cpf;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    private Usuario usuario;



}
