package com.devsenior;

public class Main {
    public static void main(String[] args) {
        ejercicio2();
    }

    public static void ejercicio1(){
        
        double nota1 = 4.0;
        double nota2 = 3.8;
        double nota3 = 4.7;
        double nota4 = 4.9;
        double nota5 = 3.0;

        //sacar promedio, hacer otras operaciones

        //arreglo
        double[] notas =  {4.0, 3.8, 4.7, 4.9, 3.0}; //declaración explícita del arreglo
        
        double suma = 0;
        for(int i = 0; i < notas.length; i++){
            suma += notas[i];
        }

        double promedio = suma / notas.length;
        System.out.println("El promedio d enotas es: " + promedio);
    }

    public static void ejercicio2(){
          
         

          double[][] calificaciones = {
            {4.0, 3.8, 4.7, 4.9, 3.0}, //dia 1
            {4.5, 3.7, 3.7, 2.9, 3.8}, //dia 2
            {4.8, 2.8, 1.7, 2.9, 3.8}, //dia 3
            {4.2, 4.8, 4.1, 4.0, 3.7} //dia 4
          }; //zona norte 

           double[][] calificaciones2 = {
            {4.0, 3.8, 4.7, 4.9, 3.0}, //dia 1
            {4.5, 3.7, 3.7, 2.9, 3.8}, //dia 2
            {4.8, 2.8, 1.7, 2.9, 3.8}, //dia 3
            {4.2, 4.8, 4.1, 4.0, 3.7} //dia 4
          }; //zona sur


          for(int i = 0; i < calificaciones.length; i++){ // reccorrido en filas
              for(int j = 0; j < calificaciones[0].length; j++){
                System.out.print(calificaciones[i][j] + "  ");
              }  
              System.out.println();
          }
    }
}