package com.netfujix.service;

import java.util.List;

import com.netfujix.model.Usuario;
import com.netfujix.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario atualizar(Usuario usuario) throws Exception {
        if (usuario.getId() == null) {
            throw new Exception("ID não encontrado");
        }
        return repository.save(usuario);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }
}
