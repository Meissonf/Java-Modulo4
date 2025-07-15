package com.devsenior;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RutaTuristica {
    
    //Atributos
    private String nombre;
    private String descripcion;
    private String region;
    private List<PuntoInteres> puntos;
    private Set<String> etiquetas;
   
    public RutaTuristica(String nombre, String descripcion, String region) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.region = region;
        this.puntos = new ArrayList<>();
        this.etiquetas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRegion() {
        return region;
    }

    public List<PuntoInteres> getPuntos() {
        return puntos;
    }

    public Set<String> getEtiquetas() {
        return etiquetas;
    }

    public void agregarPunto(PuntoInteres punto){
        puntos.add(punto);
    }

    public void agregarEtiqueta(String etiqueta){
            etiquetas.add(etiqueta.toLowerCase());
    }

    @Override
    public String toString() {
        return "RutaTuristica [nombre=" + nombre + ", descripcion=" + descripcion + ", region=" + region + ", puntos="
                + puntos + ", etiquetas=" + etiquetas + "]";
    }

    

    


}
