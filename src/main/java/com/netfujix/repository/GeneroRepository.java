package com.netfujix.repository;

import java.util.Optional;

import com.netfujix.model.Genero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {
    Optional<Genero> findById(Integer id);
}
