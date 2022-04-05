package com.netfujix.service;

import com.netfujix.model.CartaoCredito;
import com.netfujix.repository.CartaoCreditoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartaoCreditoService {
    @Autowired
    private CartaoCreditoRepository repository;

    public CartaoCredito salvar(CartaoCredito cartaoCredito) {
        return repository.save(cartaoCredito);
    }
}
