package com.netfujix.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
    private String email;
    private String senha;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<CartaoCredito> listCartaoCredito = new ArrayList<>();

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
