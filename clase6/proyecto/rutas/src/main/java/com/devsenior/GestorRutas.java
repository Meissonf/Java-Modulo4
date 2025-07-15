package com.devsenior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorRutas {
   
    private List<RutaTuristica> rutas;
    private Map<String, List<RutaTuristica>> rutasPorRegion;


    public GestorRutas(){
        rutas = new ArrayList<>();
        rutasPorRegion = new HashMap<>();
    }

    public void agregarRuta(RutaTuristica ruta){
        rutas.add(ruta);
        
        //Registrar en el mapa por región
        String region = ruta.getRegion().toLowerCase();
        rutasPorRegion.putIfAbsent(region, new ArrayList<>());
        rutasPorRegion.get(region).add(ruta);
    }


    public List<RutaTuristica> buscarPorRegion(String region){
        return rutasPorRegion.get(region);
    }
    
    public List<RutaTuristica> recomendarRutas(Usuario usuario){
        List<RutaTuristica> recomendadas = new ArrayList<>();

        for(RutaTuristica ruta: rutas){
            for(String etiqueta : ruta.getEtiquetas()){
                if(usuario.tieneInteres(etiqueta)){
                    recomendadas.add(ruta);
                    break;
                }
            }
        }

        return recomendadas;
    }

    public void mostrarTodasLasRutas() {
        if (rutas.isEmpty()) {
            System.out.println("No hay rutas registradas.");
        } else {
            for (RutaTuristica ruta : rutas) {
                System.out.println(ruta);
                System.out.println("----------------------------------------");
            }
        }
    }

}
