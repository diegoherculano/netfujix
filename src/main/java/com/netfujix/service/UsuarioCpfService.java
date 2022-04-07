package com.netfujix.service;

import com.netfujix.model.UsuarioCpf;
import com.netfujix.repository.UsuarioCpfRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCpfService {
    @Autowired
    private UsuarioCpfRepository repository;

    public UsuarioCpf salvar(UsuarioCpf userCpf){
        return repository.save(userCpf);
    }

}
