package com.api.crecoscorp.models;

public class ResponseData<T>  {

    private T datos;

    private String mensaje;

    private Integer codigo;

    private Boolean error;

    public ResponseData(T datos, String mensaje, Integer codigo) {
        this.datos = datos;
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.error = false;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
