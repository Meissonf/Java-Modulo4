package com.devsenior;

import java.util.HashSet;

public class TokenManager {
    //atributo
    private HashSet<String> tokensActivos = new HashSet<>(); //Colección

    public void registrarToken(String token){
        if(tokensActivos.add(token)){
            System.out.println("Token registrado exitosamente");
        }
        else{
            System.out.println("El token ya estaba registrado");
        }
    }

    public void verificarToken(String token){
         if(tokensActivos.contains(token)){
            System.out.println("El token válido (activo)");
         }
         else{
            System.out.println("Token inválido (No existe)");
         }
    }

    public void eliminarToken(String token){
        if(tokensActivos.remove(token)){
            System.out.println("El token se eliminó correctamente");
        }
        else{
            System.out.println("No se encoentro el token");
        }
    }

    public void mostrarTokens(){
        System.out.println("Tokens activos: " + tokensActivos);
    }

}
