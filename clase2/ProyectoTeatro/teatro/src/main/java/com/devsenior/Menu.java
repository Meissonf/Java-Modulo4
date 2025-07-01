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
                System.out.print(mapa[i][j] == EstadoAsiento.LIBRE ? "L " : "O ");
            }
            System.out.println();
        }
    }

    private void reservar() {
        int fila = leerEntero("Ingrese la fila: ");
        int col = leerEntero("Ingrese la columna: ");
        try {
            sala.reservar(fila, col);
            System.out.println("Reserva realizada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void cancelar() {
        int fila = leerEntero("Ingrese la fila: ");
        int col = leerEntero("Ingrese la columna: ");
        try {
            sala.cancelarReserva(fila, col);
            System.out.println("Reserva cancelada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void mostrarEstadisticas() {
        int[] stats = sala.calcularEstadisticas();
        int total = stats[0] + stats[1];
        double porcentaje = (stats[1] * 100.0) / total;
        System.out.println("\nAsientos disponibles: " + stats[0]);
        System.out.println("Asientos ocupados: " + stats[1]);
        System.out.printf("Porcentaje de ocupación: %.2f%%\n", porcentaje);
    }

    private int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. " + mensaje);
            scanner.next();
        }
        return scanner.nextInt();
    }

}
