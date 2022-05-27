package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String nome;

    @Email
    @NotEmpty
    private String email;

    @NotNull
    private String senha;

    private boolean admin = false;
}
