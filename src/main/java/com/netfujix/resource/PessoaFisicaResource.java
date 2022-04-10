package com.netfujix.resource;

import java.util.List;

import com.netfujix.model.PessoaFisica;
import com.netfujix.service.PessoaFisicaService;

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
@RequestMapping("/pessoaFisica")
public class PessoaFisicaResource {

    @Autowired
    private PessoaFisicaService service;

    @PostMapping
    public PessoaFisica salvar(@RequestBody PessoaFisica pessoaFisica) {
        return service.salvar(pessoaFisica);
    }

    @PutMapping
    public PessoaFisica atualizar(@RequestBody PessoaFisica pessoaFisica) throws Exception {
        return service.atualizar(pessoaFisica);
    }

    @GetMapping
    public List<PessoaFisica> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) throws Exception {
        service.deletar(id);
    }

}