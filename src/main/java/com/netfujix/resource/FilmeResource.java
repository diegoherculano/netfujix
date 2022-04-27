package com.netfujix.resource;

import java.util.List;

import com.netfujix.model.Filme;
import com.netfujix.service.FilmeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @PostMapping
    public Filme salvar(@RequestBody Filme filme) {
        return service.salvar(filme);
    }

    @PutMapping
    public Filme atualizar(@RequestBody Filme filme) throws Exception {
        return service.atualizar(filme);
    }

    @GetMapping
    public List<Filme> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }

}
