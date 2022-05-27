package com.netfujix.service;

import java.util.List;

import com.netfujix.model.PessoaFisica;
import com.netfujix.model.Usuario;
import com.netfujix.repository.PessoaFisicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PessoaFisicaService {
    @Autowired
    private PessoaFisicaRepository repository;
    Integer IdNull = null;

    public PessoaFisica salvar(PessoaFisica userCpf) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Usuario usuario = userCpf.getUsuario();
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        userCpf.setUsuario(usuario);
        return repository.save(userCpf);
    }

    public PessoaFisica atualizar(PessoaFisica pessoa) throws Exception {
        if (pessoa.equals(null)) {
            throw new NullPointerException();
        }
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Usuario usuario = pessoa.getUsuario();
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        pessoa.setUsuario(usuario);
        return repository.save(pessoa);
    }

    public void deletar(int id) throws Exception {
        if (Integer.valueOf(id) != null) {
            repository.deleteById(id);

        } else {
            throw new Exception("INVALID PARAMETER");
        }
    }

    public List<PessoaFisica> listar() {
        return repository.findAll();
    }

}
