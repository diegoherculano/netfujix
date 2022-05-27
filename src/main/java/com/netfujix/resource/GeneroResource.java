package com.netfujix.resource;

import com.netfujix.model.Genero;
import com.netfujix.service.GeneroService;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/genero")
public class GeneroResource {

    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar (@RequestBody Genero genero){
        return service.salvar(genero);
    }

    @PutMapping
    public Genero atualizar (@RequestBody Genero genero) throws Exception {
        return service.atualizar(genero);
    }

    @GetMapping
    public List<Genero> listar (){
        return service.listarTodos();
    }

    @DeleteMapping ("{id}")
    public void remover (@PathVariable int id){
        service.deletar(id);
    }

    @GetMapping("{id}")
    public Optional<Genero> findById (@PathVariable int id){
        return service.buscaPorId(id);
    }
}
