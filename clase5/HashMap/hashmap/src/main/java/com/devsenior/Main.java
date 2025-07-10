package com.devsenior;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Usuario> usuarios = new HashMap<>();

        usuarios.put("jperez", new Usuario("Juan Perez", "1234"));
        usuarios.put("alara", new Usuario("Alfonso Lara", "admin123"));
        usuarios.put("dgomez", new Usuario("Diego Gomez", "rol234"));

        String userName = "dgomez";
        String inputContrasena = "rol234";

        if(usuarios.containsKey(userName)){
            Usuario u = usuarios.get(userName);
            if (u.validarContrasena(inputContrasena)) {
                System.out.println("!Bienvenido al sistema: " + u.getNombreCompleto());
            }
            else{
                System.out.println("Contaseña incorrecta");
            }
        }else{
            System.out.println("usuario no encontrado");
        }
    }
}