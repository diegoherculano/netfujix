package com.netfujix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Compra {
    @Id
    @GeneratedValue
    private int id;

    private int cartaoCreditoId;
    private int usuarioID;
    private String data;
    private String planoId;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCartaoCreditoId() {
        return cartaoCreditoId;
    }
    public void setCartaoCreditoId(int cartaoCreditoId) {
        this.cartaoCreditoId = cartaoCreditoId;
    }
    public int getUsuarioID() {
        return usuarioID;
    }
    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getPlanoId() {
        return planoId;
    }
    public void setPlanoId(String planoId) {
        this.planoId = planoId;
    }


    
}
