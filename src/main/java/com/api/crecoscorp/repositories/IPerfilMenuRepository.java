package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.PerfilMenuModel;

@Repository
public interface IPerfilMenuRepository extends JpaRepository<PerfilMenuModel, Long>{
    
}
