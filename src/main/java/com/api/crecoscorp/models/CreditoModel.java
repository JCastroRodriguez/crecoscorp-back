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
@Table(name = "credito_crecoscorp")
@Getter
@Setter
public class CreditoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CREDITO")
    private Long id;

    @Column(name = "MONTO_CREDITO")
    private Float montoCredito;

    @Column(name = "INTERES")
    private Float interes;

    @Column(name = "NUMERO_CUOTAS")
    private Integer numeroCuotas;

    @Column(name = "FORMA_PAGO")
    private Integer formaPago;

    @Column(name = "FECHA_EMISION")
    private Date fechaEmision;

    @Column(name = "VALOR_POR_CUOTA")
    private Float valorPorCuota;

    @Column(name = "VALOR_INTERES")
    private Float valorInteres;

    @Column(name = "MONTO_TOTAL")
    private Float montoTotal;

    @Column(name = "FECHA_FINALIZACION")
    private Date fechaFinalizacion;

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
