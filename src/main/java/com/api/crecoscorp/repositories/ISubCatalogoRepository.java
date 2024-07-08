package com.api.crecoscorp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.models.SubCatalogoModel;

@Repository
public interface ISubCatalogoRepository extends JpaRepository<SubCatalogoModel, Long>{

    /**
     * Autor: JEAN CARLOS CASTRO
     * OBTIENE UN LISTADO DE SUBCATALOGOS DESDE UN ID CATALOGO
     * 
     * @return
     */
    @Query(value = "SELECT * FROM sub_catalogo WHERE id_catalogo = ?1 and estado=1", nativeQuery = true)
    List<SubCatalogoModel> getSubcatalogoByIdCatalogo(Long idCatalogo);
    
}
