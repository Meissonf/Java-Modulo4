package com.devsenior;

public class PuntoInteres {
    private String nombre;
    private String descripcion;
    private String coordenadas;
    
    public PuntoInteres(String nombre, String descripcion, String coordenadas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    @Override
    public String toString() {
        return "PuntoInteres [nombre=" + nombre + ", descripcion=" + descripcion + ", coordenadas=" + coordenadas + "]";
    }

    
    

}
