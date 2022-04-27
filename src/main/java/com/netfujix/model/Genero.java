package com.netfujix.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Genero {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    @OneToMany
    private Set<Filme> filme;

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

    public Set<Filme> getFilme() {
        return this.filme;
    }

    public void setFilme(Set<Filme> filme) {
        this.filme = filme;
    }

}
