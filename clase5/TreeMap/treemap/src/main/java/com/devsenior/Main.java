package com.devsenior;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Double, Producto> productos = new TreeMap<>();

        Producto prod1 = new Producto("Silla", "Hogar");
        System.out.println(prod1);


        productos.put(199.0, new Producto("Auriculares inalmabricos", "tecnologia"));
        productos.put(15.5, new Producto("Cuaderno profesional", "Papeleria"));
        productos.put(200.0, new Producto("Silla ergonómica", "Oficina"));
        productos.put(500.75, new Producto("Televisor Ultra HD", "tecnologia"));


        System.out.println("Inventario ordenado?:");

        for (Double precio : productos.keySet()) {
            System.out.println("$"+ precio + " - " + productos.get(precio));
        }

    }
}