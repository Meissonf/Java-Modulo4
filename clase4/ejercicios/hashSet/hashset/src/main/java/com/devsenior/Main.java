package com.devsenior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TokenManager gestor = new TokenManager();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("----Sistema de tokens-----");
            System.out.println("1. Registrar Tokens");
            System.out.println("2. Verificar token");
            System.out.println("3. Eliminar token");
            System.out.println("4. Mostrar tokens Activos");
            System.out.println("0. Salir");
            System.out.print("Seleccione la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el token a registrar: ");
                    String tokenRegistrar = scanner.nextLine();
                    gestor.registrarToken(tokenRegistrar);
                    break;
                case 2: 
                    System.out.print("Ingrese el token a verificar: ");
                    String tokenVerificar = scanner.nextLine();
                    gestor.verificarToken(tokenVerificar);
                break;

                case 3:
                    System.out.print("Ingrese el token a eliminar: ");
                    String tokenEliminar = scanner.nextLine();
                    gestor.eliminarToken(tokenEliminar);
                break;
                case 4:
                    System.out.println("Tokens activos:");
                    gestor.mostrarTokens();
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