package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CartaoCredito {

    @NotNull
    @Id
    @GeneratedValue
    private Integer id;

    @CreditCardNumber
    private String numero;

    @NotNull
    private String dataValidade;

    @Max(3)
    private Integer codigoSeguranca;

    @NotNull
    @Max(255)
    private String nomeCartao;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

}