package com.api.crecoscorp.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "ID_PERFIL")
    private Integer idPerfil;

    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;

    @Column(name = "CLAVE_USUARIO")
    private String claveUsuario;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "GENERO")
    private Integer genero;

    @Column(name = "ESTADO")
    private Integer estado;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "CODIGO_USUARIO")
    private Integer codigoUsuario;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "FECHA")
    private Date fecha;
}