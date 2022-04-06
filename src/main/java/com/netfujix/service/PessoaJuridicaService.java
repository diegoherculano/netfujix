package com.netfujix.service;

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
}
