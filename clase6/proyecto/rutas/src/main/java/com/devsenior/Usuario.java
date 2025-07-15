package com.devsenior;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nombre;
    private Set<String> intereses;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.intereses = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getIntereses() {
        return intereses;
    }

    public void agregarInteres(String interes){
        if(interes != null && !interes.trim().isEmpty()){
            intereses.add(interes.toLowerCase());
        }
    }

    public boolean tieneInteres(String interes){
        return intereses.contains(interes.toLowerCase());
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", \nintereses=" + intereses + "]";
    }
    
    

    
}
