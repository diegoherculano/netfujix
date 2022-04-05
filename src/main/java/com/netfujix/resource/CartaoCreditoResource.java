package com.netfujix.resource;

import com.netfujix.model.CartaoCredito;
import com.netfujix.service.CartaoCreditoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartao")
public class CartaoCreditoResource {

    @Autowired
    private CartaoCreditoService service;

    @PostMapping
    public CartaoCredito salvar(@RequestBody CartaoCredito cartaoCredito) {
        return service.salvar(cartaoCredito);
    }

}
