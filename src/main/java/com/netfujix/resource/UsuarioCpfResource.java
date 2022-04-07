package com.netfujix.resource;

import com.netfujix.model.UsuarioCpf;
import com.netfujix.service.UsuarioCpfService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarioCpf")
public class UsuarioCpfResource {

    @Autowired
    private UsuarioCpfService service;

    @PostMapping
    public UsuarioCpf salvar(@RequestBody UsuarioCpf usuario) {
        return service.salvar(usuario);
    }

}