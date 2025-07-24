package com.devsenior;

public class Pelicula {
    
    private String titulo;
    private String genero;
    private double calificacionPromedio;
    private int anio;
    
    public Pelicula(String titulo, String genero, double calificacionPromedio, int anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.calificacionPromedio = calificacionPromedio;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", calificacionPromedio=" + calificacionPromedio
                + ", anio=" + anio + "]";
    }

    

    
}
