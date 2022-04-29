package com.netfujix.repository;
import java.util.Optional;

import com.netfujix.model.Compra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {
    Optional<Compra> findById(Integer id);
}


