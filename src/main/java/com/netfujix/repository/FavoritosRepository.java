package com.netfujix.repository;

import java.util.Optional;

import com.netfujix.model.Favoritos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritosRepository extends JpaRepository<Favoritos, Integer> {
    Optional<Favoritos> findById(Integer id);
}