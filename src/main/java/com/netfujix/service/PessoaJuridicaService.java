package com.netfujix.service;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.PessoaJuridica;
import com.netfujix.repository.PessoaJuridicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaJuridicaService {
    @Autowired
    private PessoaJuridicaRepository repository;

    public PessoaJuridica salvar(PessoaJuridica pessoajuridica) {
        return repository.save(pessoajuridica);
    }

    public PessoaJuridica atualizar(PessoaJuridica pessoajuridica) throws Exception {
        if (pessoajuridica.getId() == null) {
            throw new Exception("ID não encontrado");
        }
        return repository.save(pessoajuridica);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

    public List<PessoaJuridica> listar() {
        return repository.findAll();
    }

    public List<PessoaJuridica> listaByUsuario(String usuario) {
        return repository.buscaByUsuario(usuario);
    }

    public Optional<PessoaJuridica> buscaPorId(int id) {
        return repository.findById(id);
    }
}
