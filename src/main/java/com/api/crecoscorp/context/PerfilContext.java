package com.api.crecoscorp.context;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilContext {
    
    private Long id;

    private String nombrePerfil;

    private String descripcionPerfil;

    private Integer estado;

    private String descripcionEstado;

    public PerfilContext(
        Long id,
        String nombrePerfil,
        String descripcionPerfil,
        Integer estado,
        String descripcionEstado
    ){
        this.id = id;
        this.nombrePerfil = nombrePerfil;
        this.descripcionPerfil = descripcionPerfil;
        this.estado = estado;
        this.descripcionEstado = descripcionEstado;
    }
 
}
