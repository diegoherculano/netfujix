package com.netfujix.resource;

import com.netfujix.model.PessoaJuridica;
import com.netfujix.service.PessoaJuridicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoajuridica")
public class PessoaJuridicaResource {

    @Autowired
    private PessoaJuridicaService service;

    @PostMapping
    public PessoaJuridica salvar(@RequestBody PessoaJuridica pessoajuridica) {
        return service.salvar(pessoajuridica);
    }

}
