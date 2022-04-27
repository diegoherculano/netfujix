package com.netfujix.service;

import java.util.List;

import com.netfujix.model.Filme;
import com.netfujix.repository.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme filme) {
        return repository.save(filme);
    }

    public Filme atualizar(Filme filme) throws Exception {
        if (filme.getId() == null) {
            throw new Exception("ID Não encontrado");
        }
        return repository.save(filme);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<Filme> listar() {
        return repository.findAll();
    }
}
