package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.CobranzaModel;

@Repository
public interface ICobranzaRepository extends JpaRepository<CobranzaModel, Long>{
    
}
