package com.api.crecoscorp.context;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioContext {
    private Long id;

    private String nombreUsuario;

    private String claveUsuario;

    private String celular;

    private String correo;

    private Integer genero;

    private Integer idPerfil;

    private String nombrePerfil;

    private Integer estado;

    private String descripcionEstado;

    public UsuarioContext(
        Long id,
        String nombreUsuario,
        String claveUsuario,
        String celular,
        String correo,
        Integer genero,
        Integer idPerfil,
        String nombrePerfil,
        Integer estado,
        String descripcionEstado
    ){
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.celular = celular;
        this.correo = correo;
        this.genero = genero;
        this.idPerfil = idPerfil;
        this.nombrePerfil = nombrePerfil;
        this.estado = estado;
        this.descripcionEstado = descripcionEstado;
    }
}
