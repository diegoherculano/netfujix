package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plano {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer duracaoDias;
    private String nome;
    private Double valor;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuracaoDias() {
        return this.duracaoDias;
    }

    public void setDuracaoDias(Integer duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
