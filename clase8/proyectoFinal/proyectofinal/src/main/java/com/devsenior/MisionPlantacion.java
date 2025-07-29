package com.devsenior;

import java.time.LocalDate;

public class MisionPlantacion extends Mision{
   
    public MisionPlantacion(String id, String descripcion, String ubicacion,
                 LocalDate fecha, String nivelDificultad) {
        super(id, descripcion, ubicacion, fecha, nivelDificultad);
    }
}
