package com.netfujix.service;

import com.netfujix.model.Plano;
import com.netfujix.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {
    @Autowired
    private PlanoRepository repository;

    public Plano salvar(Plano plano) {
        return repository.save(plano);
    }

    public Plano atualizar(Plano plano) throws Exception {
        if (plano.getId() == null) {
            throw new Exception("ID não encontrado");
        }
        return repository.save(plano);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<Plano> listar() {
        return repository.findAll();
    }

    public Optional<Plano> buscaPorId(int id) {
        return repository.findById(id);
    }
}
