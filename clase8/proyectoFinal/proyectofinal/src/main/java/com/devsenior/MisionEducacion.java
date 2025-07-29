package com.devsenior;

import java.time.LocalDate;

public class MisionEducacion extends Mision {

    public MisionEducacion(String id, String descripcion, String ubicacion,
                           LocalDate fecha, String nivelDificultad) {
        super(id, descripcion, ubicacion, fecha, nivelDificultad);
    }   

}
