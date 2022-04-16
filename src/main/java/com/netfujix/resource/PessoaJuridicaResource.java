package com.netfujix.resource;

import java.util.List;

import com.netfujix.model.PessoaJuridica;
import com.netfujix.service.PessoaJuridicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping
    public PessoaJuridica atualizar(@RequestBody PessoaJuridica pessoajuridica) throws Exception {
        return service.atualizar(pessoajuridica);
    }

    @GetMapping
    public List<PessoaJuridica> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }

}
