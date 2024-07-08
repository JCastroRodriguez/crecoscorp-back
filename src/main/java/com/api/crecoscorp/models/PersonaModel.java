package com.api.crecoscorp.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class PersonaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA")
    private Long id;

    @Column(name = "NOMBRE_PERSONA")
    private String nombrePersona;

    @Column(name = "APELLIDO_PERSONA")
    private String apellidoPersona;

    @Column(name = "TIPO_IDENTIFICACION")
    private Integer tipoIdentificacion;

    @Column(name = "IDENTIFICACION")
    private String identificacion;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "GENERO")
    private Integer genero;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "PROVINCIA")
    private Integer provincia;

    @Column(name = "SECTOR_BARRIO")
    private String sectorBarrio;

    @Column(name = "LATITUD")
    private Integer latitud;

    @Column(name = "LONGITUD")
    private String longitud;

    @Column(name = "DIRECCION_DOMICILIO")
    private Integer direccionDomicilio;

    @Column(name = "REFERENCIA_DOMICILIO")
    private String referenciaDomicilio;

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
