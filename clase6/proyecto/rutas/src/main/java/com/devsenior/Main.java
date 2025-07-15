package com.devsenior;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GestorRutas gestor = new GestorRutas();
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1 -> registrarRuta();
                    case 2 -> gestor.mostrarTodasLasRutas();
                    case 3 -> buscarPorRegion();
                    case 4 -> recomendarRutas();
                    case 5 -> System.out.println("Gracias por usar el gestor. ¡Hasta pronto!");
                    default -> System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Debes ingresar un número entero.");
                opcion = 0;
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Registrar nueva ruta turística");
        System.out.println("2. Ver todas las rutas registradas");
        System.out.println("3. Buscar rutas por región");
        System.out.println("4. Recomendar rutas a un usuario");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarRuta() {
        System.out.println("\n REGISTRO DE RUTA");

        System.out.print("Nombre de la ruta: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Región: ");
        String region = scanner.nextLine();

        RutaTuristica ruta = new RutaTuristica(nombre, descripcion, region);

        // Agregar etiquetas
        System.out.println("Agrega etiquetas (escribe 'fin' para terminar):");
        while (true) {
            System.out.print("Etiqueta: ");
            String etiqueta = scanner.nextLine();
            if (etiqueta.equalsIgnoreCase("fin")) break;
            ruta.agregarEtiqueta(etiqueta);
        }

        // Agregar puntos de interés
        System.out.println("Agrega puntos de interés (escribe 'fin' como nombre para terminar):");
        while (true) {
            System.out.print("Nombre del punto: ");
            String nombrePunto = scanner.nextLine();
            if (nombrePunto.equalsIgnoreCase("fin")) break;

            System.out.print("Descripción del punto: ");
            String descPunto = scanner.nextLine();

            System.out.print("Coordenadas (ej. 4.62,-74.08): ");
            String coord = scanner.nextLine();

            ruta.agregarPunto(new PuntoInteres(nombrePunto, descPunto, coord));
        }

        gestor.agregarRuta(ruta);
        System.out.println("Ruta registrada con éxito.");
    }

    private static void buscarPorRegion() {
        System.out.print("\n🔎 Ingrese el nombre de la región: ");
        String region = scanner.nextLine();

        List<RutaTuristica> rutas = gestor.buscarPorRegion(region);

        if (rutas.isEmpty()) {
            System.out.println("No se encontraron rutas para esa región.");
        } else {
            System.out.println(" Rutas en la región '" + region + "':");
            for (RutaTuristica ruta : rutas) {
                System.out.println("- " + ruta.getNombre());
            }
        }
    }

    private static void recomendarRutas() {
        System.out.print("\n👤 Nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario);

        System.out.println("Agrega intereses (escribe 'fin' para terminar):");
        while (true) {
            System.out.print("Interés: ");
            String interes = scanner.nextLine();
            if (interes.equalsIgnoreCase("fin")) break;
            usuario.agregarInteres(interes);
        }

        List<RutaTuristica> sugeridas = gestor.recomendarRutas(usuario);

        if (sugeridas.isEmpty()) {
            System.out.println("No hay rutas que coincidan con los intereses de " + usuario.getNombre() + ".");
        } else {
            System.out.println("Rutas recomendadas para " + usuario.getNombre() + ":");
            for (RutaTuristica ruta : sugeridas) {
                System.out.println("- " + ruta.getNombre());
            }
        }
    }
}