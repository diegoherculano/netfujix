package com.netfujix.repository;

import java.util.Optional;

import com.netfujix.model.PessoaJuridica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Integer> {
    Optional<PessoaJuridica> findById(Integer id);
}
