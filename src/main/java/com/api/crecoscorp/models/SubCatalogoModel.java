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
@Table(name = "sub_catalogo")
@Getter
@Setter
public class SubCatalogoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBCATALOGO")
    private Long id;

    @Column(name = "CODIGO_SUBCATALOGO")
    private String codigoSubcatalogo;

    @Column(name = "NOMBRE_SUBCATALOGO")
    private String nombreSubcatalogo;

    @Column(name = "DESCRIPCION_SUBCATALOGO")
    private String descripcionSubcatalogo;

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
