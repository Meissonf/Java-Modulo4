package com.devsenior;

public class Main {
    public static void main(String[] args) {
        int  contadorLibres  = 0;
        Asiento f2 = new Asiento();
        if(f2.estaLibre()){
            contadorLibres++;
        }
    }
}