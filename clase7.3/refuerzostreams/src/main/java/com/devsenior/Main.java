package com.devsenior;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pelicula> peliculas = List.of(
                new Pelicula("Interestelar", "ciencia ficción", 9.0, 2014),
                new Pelicula("Baby Driver","Acción", 10.0, 2017),
                new Pelicula("Imparable", "Suspenso", 8.5, 2010),
                new Pelicula("El lector", "Drama", 7.9, 2008),
                new Pelicula("El Pianista", "Drama", 8.1, 2002),
                new Pelicula("Matrix", "Ciencia Ficción", 8.7, 1999),
                new Pelicula("Terminator", "Acción", 8.2, 1984)
        );
        
        String generoPreferido = "Ciencia Ficción";

       List<String> recomendaciones =  peliculas.stream()
        .filter(p -> p.getCalificacionPromedio() >= 8)
        .filter(p -> p.getGenero().equalsIgnoreCase(generoPreferido))
        .sorted(Comparator.comparing(Pelicula::getCalificacionPromedio).reversed()
          .thenComparing(Pelicula::getAnio).reversed())
        .map(Pelicula::getTitulo)
        .limit(5)
        .collect(Collectors.toList());

        System.out.println("Peliculas recomendadas para ti del género " + generoPreferido + ": " + recomendaciones);
        



    }
}