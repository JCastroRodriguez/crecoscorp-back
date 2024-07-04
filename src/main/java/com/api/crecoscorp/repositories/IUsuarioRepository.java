package com.api.crecoscorp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.crecoscorp.context.UsuarioContext;
import com.api.crecoscorp.models.UsuarioModel;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioModel, Long>{
    
    /**
     * Autor: JEAN CARLOS CASTRO
     * VALIDA QUE SEA UN USUARIO REGISTRADO EN LA BD PARA INGRESAR AL APLICATIVO
     * @return
     */
    @Query(value = "SELECT * FROM usuario WHERE nombre_usuario = ?1 AND clave_usuario = ?2", nativeQuery = true)
    UsuarioModel getValidaUsuarioLogeado(String nombreUsuario, String claveUsuario);

    /**
     * Autor: JEAN CARLOS CASTRO
     * LISTA TODOS LOS USUARIOS
     * @return
     */
    @Query(value = "SELECT new com.api.crecoscorp.context.UsuarioContext( usu.id, " +
                " usu.nombreUsuario, usu.claveUsuario, usu.celular, usu.correo, usu.idPerfil, p.nombrePerfil, " + 
                " sb.estado, sb.nombreSubcatalogo as descripcionEstado ) " +
            " FROM UsuarioModel usu " +
            " INNER JOIN PerfilModel p ON p.id = usu.idPerfil " +
            " INNER JOIN SubCatalogoModel sb ON sb.id = usu.estado ")
    List<UsuarioContext> getUsuarioAll();
}
