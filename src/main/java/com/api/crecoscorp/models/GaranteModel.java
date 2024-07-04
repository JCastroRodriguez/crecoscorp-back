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
@Table(name = "garante")
@Getter
@Setter
public class GaranteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GARANTE")
    private Long id;

    @Column(name = "NOMBRE_GARANTE")
    private String nombreGarante;

    @Column(name = "APELLIDO_GARANTE")
    private String apellidoGarante;

    @Column(name = "TIPO_IDENTIFICACION")
    private Integer tipoIdentificacion;

    @Column(name = "IDENTIFICACION")
    private String identificacion;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "PROVINCIA")
    private Integer provincia;

    @Column(name = "SECTOR_BARRIO")
    private String sectorBarrio;

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
