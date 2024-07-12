package com.api.crecoscorp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.GaranteModel;

@Repository
public interface IGaranteRepository extends JpaRepository<GaranteModel, Long>{
    
    /**
     * Autor: JEAN CARLOS CASTRO
     * OBTIENE UN GARANTE ACTIVO POR SU IDENTIFICACION
     * 
     * @return
     */
    @Query(value = " SELECT g FROM GaranteModel g " +
        "   WHERE g.identificacion=?1 and g.estado = 1")
    Optional<GaranteModel> getGaranteByIdentificacion(String identificacion);

    /**
     * Autor: JEAN CARLOS CASTRO
     * OBTIENE GARANTE POR SU CELULAR
     * 
     * @return
     */
    @Query(value = " SELECT g FROM GaranteModel g " +
        "   WHERE g.celular=?1 and g.estado = 1 ")
    Optional<GaranteModel> getGaranteByCelular(String celular);
}
