package com.sus.open.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sus.open.model.Contatto;

@Repository("contattiRepository")
public interface ContattiRepository extends JpaRepository<Contatto, Long>{
}
