package com.ventas.ventas.exception;

import java.util.Date;
import java.util.Map;

public class ExceptionResponse {

    private Date timestamp;
    private String mensajes;
    private String detalles;
    private Map <String, String> erroresValidacion;

    public ExceptionResponse(){

    }
    public ExceptionResponse(Date timestamp, String mensajes, String detalles) {
        this.timestamp = timestamp;
        this.mensajes = mensajes;
        this.detalles = detalles;
    }

    public ExceptionResponse(Date timestamp, String mensajes, String detalles, Map<String, String> erroresValidacion) {
        this.timestamp = timestamp;
        this.mensajes = mensajes;
        this.detalles = detalles;
        this.erroresValidacion = erroresValidacion;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Map<String, String> getErroresValidacion() {
        return erroresValidacion;
    }

    public void setErroresValidacion(Map<String, String> erroresValidacion) {
        this.erroresValidacion = erroresValidacion;
    }
}
