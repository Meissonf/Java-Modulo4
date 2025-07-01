package com.devsenior;

public class Asiento {
   
    private EstadoAsiento estado;

    public Asiento(){
        this.estado = EstadoAsiento.LIBRE;
    }

    public EstadoAsiento getEstado(){
        return this.estado;
    }

    public void setEstado(EstadoAsiento estado){
        this.estado = estado;
    }   

    public boolean estaLibre(){
        return estado == EstadoAsiento.LIBRE;
    }

}
