package com.api.crecoscorp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.context.PerfilContext;
import com.api.crecoscorp.models.PerfilModel;

@Repository
public interface IPerfilRepository extends JpaRepository<PerfilModel, Long>{
    
    /**
     * Autor: JEAN CARLOS CASTRO
     * LISTA TODOS LOS PERFILES
     * @return
     */
    @Query(value = "SELECT new com.api.crecoscorp.context.PerfilContext( p.id, " +
                " p.nombrePerfil, p.descripcionPerfil, p.estado, sc.nombreSubcatalogo as descripcionEstado ) " +
            " from PerfilModel p INNER JOIN SubCatalogoModel sc on sc.id = p.estado")
    List<PerfilContext> getPerfilAll();
}
