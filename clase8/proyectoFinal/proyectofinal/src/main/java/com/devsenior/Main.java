package com.devsenior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EcoQuestService ecoQuestService = new EcoQuestService();
        Scanner scanner = new Scanner(System.in);

        // Registrar voluntario
        ecoQuestService.registrarVoluntario(scanner);

     
    }
}