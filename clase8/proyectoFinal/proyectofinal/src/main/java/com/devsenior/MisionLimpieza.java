package com.devsenior;

import java.time.LocalDate;

public class MisionLimpieza extends Mision {

    public MisionLimpieza(String id, String descripcion, String ubicacion,
                          LocalDate fecha, String nivelDificultad) {
        super(id, descripcion, ubicacion, fecha, nivelDificultad);
    }

}
