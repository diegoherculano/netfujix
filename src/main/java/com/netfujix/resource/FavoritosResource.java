package com.netfujix.resource;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.Favoritos;
import com.netfujix.service.FavoritosService;

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
@RequestMapping("/Favoritos")
public class FavoritosResource {

    @Autowired
    private FavoritosService service;

    @PostMapping
    public Favoritos salvar(@RequestBody Favoritos favoritos) {
        return service.salvar(favoritos);
    }

    @PutMapping
    public Favoritos atualizar(@RequestBody Favoritos favoritos) throws Exception {
        return service.atualizar(favoritos);
    }

    @GetMapping
    public List<Favoritos> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }


    @GetMapping("{id}")
    public Optional<Favoritos> findById(@PathVariable int id) {
        return service.buscaPorId(id);
    }

}
