package com.netfujix.service;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.Favoritos;
import com.netfujix.repository.FavoritosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoritosService {
    @Autowired
    private FavoritosRepository repository;

    public Favoritos salvar(Favoritos favoritos) {
        return repository.save(favoritos);
    }

    public Favoritos atualizar(Favoritos favoritos) throws Exception {
        if (favoritos.getId() == null) {
            throw new Exception("ID Não encontrado");
        }
        return repository.save(favoritos);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<Favoritos> listar() {
        return repository.findAll();
    }


    public Optional<Favoritos> buscaPorId(int id) {
        return repository.findById(id);
    }
}
