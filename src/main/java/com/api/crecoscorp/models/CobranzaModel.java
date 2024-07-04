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
@Table(name = "cobranza_crecoscorp")
@Getter
@Setter
public class CobranzaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COBRO")
    private Long id;

    @Column(name = "NUMERO_CUOTA")
    private Integer numeroCuota;

    @Column(name = "FECHA_PAGO")
    private Date fechaPago;

    @Column(name = "MONTO_CUOTA")
    private Float montoCuota;

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
