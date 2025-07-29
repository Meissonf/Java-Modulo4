package com.devsenior;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class EcoQuestService {
    
    private Map<String, Voluntario> voluntarios;
    private Map<String, Mision> misiones;
    private Set<String> puntosEco;
    private Set<String> misionesCompletadas;

    public EcoQuestService() {
        this.voluntarios = new HashMap<>();
        this.misiones = new HashMap<>();
        this.puntosEco = new HashSet<>();
        this.misionesCompletadas = new HashSet<>();
    }

    public void registrarVoluntario(Scanner Scanner) {
        System.out.println("ID:");
        String id = Scanner.nextLine();
        if(voluntarios.containsKey(id)) {
            System.out.println("El ID ya está registrado.");
            return;
        }
        System.out.println("Nombre:");
        String nombre = Scanner.nextLine();
        
        System.out.println("Habilidades (separadas por comas):");
        List<String> habilidades = Arrays.stream(Scanner.nextLine().split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        Voluntario voluntario = new Voluntario(id, nombre, habilidades);
        voluntarios.put(id, voluntario);

    }

    public void registrarMision(Mision mision) {
       
    }

    public void registrarPuntoEco(String puntoEco) {
        
    }

    public void completarMision(Scanner Scanner){

    }
    
    

}
