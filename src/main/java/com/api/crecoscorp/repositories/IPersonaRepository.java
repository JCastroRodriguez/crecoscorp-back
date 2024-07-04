package com.api.crecoscorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.PersonaModel;

@Repository
public interface IPersonaRepository extends JpaRepository<PersonaModel, Long>{
    
}
