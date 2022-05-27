package com.netfujix.service;
import java.util.List;
import java.util.Optional;

import com.netfujix.model.Compra;
import com.netfujix.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {
    @Autowired
    private CompraRepository repository;
    

    public Compra salvar(Compra compra){
        return repository.save(compra);
    }
    
    public Compra atualizar(Compra compra)throws Exception{
        if (compra.equals(null)) {
            throw new NullPointerException("Compra não encontrada");
        }
        return repository.save(compra);
        
    }
    public void deletar(int id) throws Exception {
        if(Integer.valueOf(id)!= null){
            repository.deleteById(id);

        }else{
            throw new Exception("INVALID PARAMETER");
        }
    }

    public List<Compra> listar() {
        return repository.findAll();
    }
    
    public Optional<Compra> buscaPorId(int id) {
        return repository.findById(id);
    }

}