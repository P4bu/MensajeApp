package org.example;

import java.util.Date;


public class Mensaje {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    Date fechaMensaje;

    public Mensaje() {
    }

    public Mensaje(String mensaje, String autor_mensaje, Date fechaMensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fechaMensaje = fechaMensaje;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public Date getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(Date fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }


}
