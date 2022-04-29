package com.netfujix.resource;

import com.netfujix.model.Plano;
import com.netfujix.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plano")
public class PlanoResource {

    @Autowired
    private PlanoService service;

    @PostMapping
    public Plano salvar(@RequestBody Plano plano) {
        return service.salvar(plano);
    }

    @PutMapping
    public Plano atualizar(@RequestBody Plano plano) throws Exception {
        return service.atualizar(plano);
    }

    @GetMapping
    public List<Plano> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }


    @GetMapping("{id}")
    public Optional<Plano> findById(@PathVariable int id) {
        return service.buscaPorId(id);
    }

}

