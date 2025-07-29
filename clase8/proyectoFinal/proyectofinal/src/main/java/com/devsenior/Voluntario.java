package com.devsenior;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Voluntario {
    private String id;
    private String nombre;
    private List<String> habilidades;
    private Set<String> misionesCompletadas;

    public Voluntario(String id, String nombre, List<String> habilidades) {
        this.id = id;
        this.nombre = nombre;
        this.habilidades = habilidades;
        this.misionesCompletadas = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public Set<String> getMisionesCompletadas() {
        return misionesCompletadas;
    }

    @Override
    public String toString() {
        return "Voluntario [id=" + id + ", nombre=" + nombre + ", habilidades=" + habilidades + ", misionesCompletadas="
                + misionesCompletadas + "]";
    }

    

}
