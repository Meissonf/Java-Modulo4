package com.devsenior;

import java.util.Scanner;

public class Menu {
    private Sala sala;
    private Scanner scanner;

    public Menu(){
        sala = new Sala();
        scanner = new Scanner(System.in);
    }

    public void ejecutar(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leerEntero("Seleccione una opcion: ");
            switch (opcion) {
                case 1 -> mostrarMapa();
                case 2 -> reservar();
                case 3 -> cancelar();
                case 4 -> mostrarEstadisticas();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida");
            }
        }while(opcion != 5);
    }

    private void  mostrarOpciones(){
        System.out.println("--------Menú--------");
        System.out.println("1. Mostrar mapa asientos");
        System.out.println("2. Reservar un asiento");
        System.out.println("3. Cancelar una resrva");
        System.out.println("4. Mostrar resumen de ocupacion");
        System.out.println("5. Salir");
    }

    private void mostrarMapa(){
        EstadoAsiento[][] mapa = sala.obtenerMapaEstado();
        for(int i =0; i < mapa.length; i++){
            System.out.print("Fila " + i + ": ");
            for(int j = 0; j < mapa[i].length; j++){
                System.out.println(mapa[i][j] == EstadoAsiento.LIBRE ? "L" : "O");
            }
            System.out.println();
        }
    }

}
