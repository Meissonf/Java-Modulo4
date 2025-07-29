package com.devsenior;

import java.time.LocalDate;

public class Mision {
    //ID, descripción, ubicación, fecha, nivel de dificultad
    private String id;
    private String descripcion;
    private String ubicacion;
    private LocalDate fecha;
    private String nivelDificultad;

    public Mision(String id, String descripcion, String ubicacion, LocalDate fecha, String nivelDificultad) {
        this.id = id;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.nivelDificultad = nivelDificultad;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }
    
    @Override
    public String toString() {
        return "Mision [id=" + id + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", fecha=" + fecha
                + ", nivelDificultad=" + nivelDificultad + "]"; 
    }

}   
