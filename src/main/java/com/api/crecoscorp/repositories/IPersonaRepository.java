package com.api.crecoscorp.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.api.crecoscorp.models.PersonaModel;

@Repository
public interface IPersonaRepository extends JpaRepository<PersonaModel, Long>{

    /**
     * Autor: JEAN CARLOS CASTRO
     * OBTIENE UN SOLICITANTE POR SU IDENTIFICACION
     * 
     * @return
     */
    @Query(value = " SELECT p FROM PersonaModel p " +
        "   INNER JOIN UsuarioModel u ON u.id = p.idUsuario " +
        "   WHERE u.idPerfil = 3 AND p.identificacion=?1 ")
    Optional<PersonaModel> getSolicitanteByIdentificacion(String identificacion);

    /**
     * Autor: JEAN CARLOS CASTRO
     * OBTIENE UN SOLICITANTE POR SU CELULAR
     * 
     * @return
     */
    @Query(value = " SELECT p FROM PersonaModel p " +
        "   INNER JOIN UsuarioModel u ON u.id = p.idUsuario " +
        "   WHERE u.idPerfil = 3 AND p.celular=?1 ")
    Optional<PersonaModel> getSolicitanteByCelular(String celular);

    /**
     * Autor: JEAN CARLOS CASTRO
     * OBTIENE UN SOLICITANTE POR SU EMAIL
     * 
     * @return
     */
    @Query(value = " SELECT p FROM PersonaModel p " +
        "   INNER JOIN UsuarioModel u ON u.id = p.idUsuario " +
        "   WHERE u.idPerfil = 3 AND p.correo=?1 ")
    Optional<PersonaModel> getSolicitanteByEmail(String email);
    
}
