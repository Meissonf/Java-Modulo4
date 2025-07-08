package com.devsenior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HistorialBusqueda historial = new HistorialBusqueda();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("----Historial de busqueda-----");
            System.out.println("1. Agregar busqueda");
            System.out.println("2. Mostrar historial");
            System.out.println("3. Limpiar historial");
            System.out.println("0. Salir");
            System.out.print("Seleccione la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el termino de busqueda: ");
                    String termino = scanner.nextLine();
                    historial.agregarBusqueda(termino);
                    break;
                case 2: 
                    System.out.print("Historial de busqueda: ");
                    historial.mostrarHistorial();
                break;

                case 3:
                        historial.limpiarHistorial();
                break;
                case 0:
                    System.out.println("Saliendo...");
                break;
            
                default:
                    break;
            }


        }while(opcion != 0);
        scanner.close();
    }
}