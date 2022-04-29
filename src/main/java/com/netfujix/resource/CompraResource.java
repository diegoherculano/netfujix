package com.netfujix.resource;

import com.netfujix.model.Compra;
import com.netfujix.service.CompraService;
import java.util.Optional;
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
@RequestMapping("/compra")
public class CompraResource {

    @Autowired
    private CompraService service;

    @PostMapping
    public Compra salvar(@RequestBody Compra compra) {
        return service.salvar(compra);
    }

    @PutMapping
    public Compra atualizar(@RequestBody Compra compra) throws Exception {
        return service.atualizar(compra);
    }

    @GetMapping
    public java.util.List<Compra> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) throws Exception {
        service.deletar(id);
    }

    
    @GetMapping("{id}")
    public Optional<Compra> findById(@PathVariable int id) {
        return service.buscaPorId(id);
    }


}
