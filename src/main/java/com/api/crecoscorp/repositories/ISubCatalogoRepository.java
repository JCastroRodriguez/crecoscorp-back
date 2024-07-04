package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.SubCatalogoModel;

@Repository
public interface ISubCatalogoRepository extends JpaRepository<SubCatalogoModel, Long>{
    
}
