package com.netfujix.repository;

import java.util.Optional;

import com.netfujix.model.Filme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    Optional<Filme> findById(Integer id);
}
