package com.netfujix.resource;

import java.util.List;

import com.netfujix.model.Usuario;
import com.netfujix.service.UsuarioService;

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
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) throws Exception {
        return service.atualizar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        service.deletar(id);
    }

}
