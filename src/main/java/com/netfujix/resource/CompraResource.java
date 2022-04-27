package com.netfujix.resource;

import com.netfujix.model.Compra;
import com.netfujix.service.CompraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

}
