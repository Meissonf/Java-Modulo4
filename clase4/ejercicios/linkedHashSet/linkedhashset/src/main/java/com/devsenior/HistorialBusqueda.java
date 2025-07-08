package com.devsenior;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HistorialBusqueda {
    private LinkedHashSet<String> historial = new LinkedHashSet<>();

    public void agregarBusqueda(String termino){
        if(historial.add(termino)){
            System.out.println("Busqueda agregada al historial");
        }else{
            System.out.println("Este término ya fue buscado antes");
        }
    }

    public void mostrarHistorial(){
        if(historial.isEmpty()){
            System.out.println("El historial esta vacío");
        }else{
            System.out.println("Historial de busquedas: ");
            for(String termino: historial){
                System.out.println("- " + termino);
            }
        }
    }

    public void limpiarHistorial(){
        historial.clear();
        System.out.println("Historial limpiado");
    }


}
