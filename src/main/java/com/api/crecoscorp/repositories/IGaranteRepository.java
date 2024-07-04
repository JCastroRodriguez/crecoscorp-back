package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.GaranteModel;

@Repository
public interface IGaranteRepository extends JpaRepository<GaranteModel, Long>{
    
}
