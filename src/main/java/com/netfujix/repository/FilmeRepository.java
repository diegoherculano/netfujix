package com.netfujix.repository;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.Filme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    Optional<Filme> findById(Integer id);

    @Query("select f from Filme f where f.genero.nome = :genero")
    List<Filme> buscaByGenero(@Param("genero") String genero);
}
