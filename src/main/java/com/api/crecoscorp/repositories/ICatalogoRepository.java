package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.CatalogoModel;

@Repository
public interface ICatalogoRepository extends JpaRepository<CatalogoModel, Long>{
    
}
