package com.netfujix.service;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.PessoaJuridica;
import com.netfujix.model.Usuario;
import com.netfujix.repository.PessoaJuridicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PessoaJuridicaService {
    @Autowired
    private PessoaJuridicaRepository repository;

    public PessoaJuridica salvar(PessoaJuridica pessoajuridica) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Usuario usuario = pessoajuridica.getUsuario();
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        pessoajuridica.setUsuario(usuario);
        return repository.save(pessoajuridica);
    }

    public PessoaJuridica atualizar(PessoaJuridica pessoajuridica) throws Exception {
        if (pessoajuridica.getId() == null) {
            throw new Exception("ID não encontrado");
        }
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Usuario usuario = pessoajuridica.getUsuario();
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        pessoajuridica.setUsuario(usuario);
        return repository.save(pessoajuridica);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<PessoaJuridica> listar() {
        return repository.findAll();
    }

    public Optional<PessoaJuridica> buscaPorId(int id) {
        return repository.findById(id);
    }
}
