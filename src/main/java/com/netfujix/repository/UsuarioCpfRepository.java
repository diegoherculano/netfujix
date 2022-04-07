package com.netfujix.repository;

import com.netfujix.model.UsuarioCpf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioCpfRepository extends JpaRepository<UsuarioCpf, Integer> {
    
}
