package com.netfujix.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class PessoaJuridica {

    @Id
    @GeneratedValue
    @NotNull
    private Integer id;

    @NotNull
    @Max(14)
    private String cnpj;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    private Usuario usuario;


}
