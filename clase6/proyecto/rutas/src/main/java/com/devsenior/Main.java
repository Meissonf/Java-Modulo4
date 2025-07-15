package com.devsenior;

public class Main {
    public static void main(String[] args) {
        RutaTuristica ruta = new RutaTuristica("Ruta Cafetera", "Recorrido por fincas cafeteras", "Eje cafetero");

        ruta.agregarEtiqueta("café");
        ruta.agregarEtiqueta("naturaleza");
        ruta.agregarEtiqueta("cultura");

        ruta.agregarPunto(new PuntoInteres("Finca El atardecer", "Tour por eje cultural y productivo", "5.005, -75.343"));
        System.out.println(ruta);
    }
}