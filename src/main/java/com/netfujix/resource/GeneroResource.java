package com.netfujix.resource;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.Genero;
import com.netfujix.service.GeneroService;

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
@RequestMapping("/genero")
public class GeneroResource {

    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero) {
        return service.salvar(genero);
    }

    @PutMapping
    public Genero atualizar(@RequestBody Genero genero) throws Exception {
        return service.atualizar(genero);
    }

    @GetMapping
    public List<Genero> listar() {
        return service.listarTodos();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }

    @GetMapping("{id}")
    public Optional<Genero> findById(@PathVariable int id) {
        return service.buscaPorId(id);
    }
}
