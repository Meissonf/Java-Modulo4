package com.devsenior;

public class Usuario {
    private String nombreCompleto;
    private String contrasena;
    
    public Usuario(String nombreCompleto, String contrasena) {
        this.nombreCompleto = nombreCompleto;
        this.contrasena = contrasena;
    }

    public boolean validarContrasena(String input){
        return contrasena.equals(input);
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

}
