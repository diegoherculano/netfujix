package com.netfujix.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PessoaJuridica {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @CNPJ
    private String cnpj;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    private Usuario usuario;

}
