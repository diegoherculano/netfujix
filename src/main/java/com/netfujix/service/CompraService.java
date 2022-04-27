package com.netfujix.service;
import java.util.List;
import com.netfujix.model.Compra;
import com.netfujix.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {
    @Autowired
    private CompraRepository repository;
    Integer IdNull = null;

    public Compra salvar(Compra compra){
        return repository.save(compra);
    }
    
    public Compra atualizar(Compra compra)throws Exception{
        if (compra.getId() == IdNull) {
            throw new NullPointerException("ID não encontrado");
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

}