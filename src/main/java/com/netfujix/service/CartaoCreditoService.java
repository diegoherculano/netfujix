package com.netfujix.service;

import java.util.List;

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

    public CartaoCredito atualizar(CartaoCredito cartaoCredito) throws Exception {
        if (cartaoCredito.getId() == null) {
            throw new Exception("ID Não encontrado");
        }
        return repository.save(cartaoCredito);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<CartaoCredito> listar() {
        return repository.findAll();
    }
}
