package com.netfujix.service;

import java.util.List;

import com.netfujix.model.PessoaFisica;
import com.netfujix.repository.PessoaFisicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaFisicaService {
    @Autowired
    private PessoaFisicaRepository repository;
    Integer IdNull = null;

    public PessoaFisica salvar(PessoaFisica userCpf){
        return repository.save(userCpf);
    }
    
    public PessoaFisica atualizar(PessoaFisica pessoa)throws Exception{
        if (pessoa.getId() == IdNull) {
            throw new NullPointerException("ID não encontrado");
        }
        return repository.save(pessoa);
        
    }
    public void deletar(int id) throws Exception {
        if(Integer.valueOf(id)!= null){
            repository.deleteById(id);

        }else{
            throw new Exception("INVALID PARAMETER");
        }
    }

    public List<PessoaFisica> listar() {
        return repository.findAll();
    }

}
