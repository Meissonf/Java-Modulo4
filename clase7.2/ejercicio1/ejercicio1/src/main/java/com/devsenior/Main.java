package com.devsenior;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<Usuario> usuarios = List.of(
            new Usuario("David", 22, "ingenieria de sistemas", 8, List.of("IA", "robotica")),
            new Usuario("Luis", 19, "psicologia", 22, List.of("lectura", "educacion")),
            new Usuario("jaime", 26, "ingenieria de sistemas", 23, List.of("IA", "desarrollo")),
            new Usuario("Alfonso", 33, "ingenieria de sistemas", 18, List.of("IA", "analisis de datos")),
            new Usuario("Julian", 24, "Diseño", 45, List.of("UX", "arte")),
            new Usuario("Sofia", 25, "ingenieria de sistemas", 8, List.of("videojuegos", "IA"))
       );

       List<String> nombresFiltrados=  
        usuarios.stream()
       .filter(u -> u.getEdad() > 20)
       .filter(u -> u.getCarrera().equals("ingenieria de sistemas"))
       .filter(u -> u.getPublicaciones() > 10)
       .map(Usuario::getNombre)
       .collect(Collectors.toList());

       System.out.println("usuarios filtrados: " + nombresFiltrados);


    }
}