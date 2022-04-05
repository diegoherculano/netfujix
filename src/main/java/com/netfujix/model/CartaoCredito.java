package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CartaoCredito {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer usuarioID;
    private String numero;
    private String dataValidade;
    private Integer codigoSeguranca;
    private String nomeCartao;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioID() {
        return this.usuarioID;
    }

    public void setUsuarioID(Integer usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Integer getCodigoSeguranca() {
        return this.codigoSeguranca;
    }

    public void setCodigoSeguranca(Integer codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNomeCartao() {
        return this.nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

}
