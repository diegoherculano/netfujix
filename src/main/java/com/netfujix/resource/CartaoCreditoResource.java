package com.netfujix.resource;

import java.util.List;

import com.netfujix.model.CartaoCredito;
import com.netfujix.service.CartaoCreditoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping
    public CartaoCredito atualizar(@RequestBody CartaoCredito cartaoCredito) throws Exception {
        return service.atualizar(cartaoCredito);
    }

    @GetMapping
    public List<CartaoCredito> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }
}
