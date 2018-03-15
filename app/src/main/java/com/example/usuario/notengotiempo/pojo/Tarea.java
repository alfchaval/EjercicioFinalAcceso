package com.example.usuario.notengotiempo.pojo;

import android.graphics.Picture;
import android.support.annotation.NonNull;

import java.net.URL;
import java.util.Date;

public class Tarea implements Comparable{

    private String nombre, descripcion;
    private int importancia;
    private Date fecha;
    private URL enlace;
    private Picture imagen;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public URL getEnlace() {
        return enlace;
    }

    public void setEnlace(URL enlace) {
        this.enlace = enlace;
    }

    public Picture getImagen() {
        return imagen;
    }

    public void setImagen(Picture imagen) {
        this.imagen = imagen;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        return 0;
    }
}