package com.netfujix.service;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.Genero;
import com.netfujix.repository.GeneroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository repository;
    Integer id = null;

    public Genero salvar(Genero genero) {
        return repository.save(genero);
    }

    public Genero atualizar(Genero genero) throws Exception {
        if (genero.getId() == null) {
            throw new Exception("ID Não encontrado");
        }
        return repository.save(genero);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<Genero> listarTodos() {
        return repository.findAll();
    }

    public Optional<Genero> buscaPorId(int id) {
        return repository.findById(id);
    }

}
