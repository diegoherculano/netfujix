package com.netfujix.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

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
    @DateTimeFormat
    private String dataValidade;

    @Max(3)
    private Integer codigoSeguranca;

    @NotNull
    private String nomeCartao;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;


}