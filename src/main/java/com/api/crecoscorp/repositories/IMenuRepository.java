package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.MenuModel;

@Repository
public interface IMenuRepository extends JpaRepository<MenuModel, Long>{
    
}
