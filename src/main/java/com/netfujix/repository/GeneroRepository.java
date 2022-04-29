package com.netfujix.repository;

import com.netfujix.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface GeneroRepository extends JpaRepository<Genero,Integer> {
    Optional<Genero> findById(Integer id);
}
