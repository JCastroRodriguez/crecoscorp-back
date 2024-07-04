package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.CreditoModel;

@Repository
public interface ICreditoRepository extends JpaRepository<CreditoModel, Long>{
    
}
