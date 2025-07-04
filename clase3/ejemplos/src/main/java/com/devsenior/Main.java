package com.devsenior;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
        ejemplo1();
    }

    public static void ejemplo1() {
        List<String> lista = new ArrayList<>();
        lista.add("A"); //índice 0
        lista.add("B"); //índice 1
        lista.add("D"); //índice 2

        lista.add(1, "X");
        //[A, B, C, D]
        System.out.println(lista);

        List<String> colores = new ArrayList<>();
        colores.add("Amarillo");// indice 0
        colores.add("Verde"); // indice 1
        colores.add("Azul");

        colores.set(1, "Rojo");

        System.out.println(colores);



    }


}