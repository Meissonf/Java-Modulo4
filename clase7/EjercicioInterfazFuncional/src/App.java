import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        MiClase obj1 = new MiClase();
        obj1.miMetodo("Esta es una implementación exitosa");


        List<String> nombres = Arrays.asList("Ana", "Pedro", "Juan");
        
        List<String> nombresConA = nombres.stream()
       .filter(nombre -> nombre.startsWith("A"))
       .collect(Collectors.toList());

        */

        Ejercicio3();
    }

    public static void Ejercicio1(){
        /*
         * Tienes una lista de números enteros. Filtra los números que son múltiplos de 3, 
         * ordénalos en orden descendente y multiplica cada número por 5. Finalmente, recoge 
         * los resultados en una lista y muéstralos por pantalla.
           var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
         */

          var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
          numbers.stream()
          .filter(n -> n % 3 == 0) //solo los multiplos de 3
          .sorted(Comparator.reverseOrder())
          .map(n -> n * 5)
         .forEach(n -> System.out.println(n));
    }

    public static void Ejercicio2(){
        /*
         * Tienes una lista de objetos Empleado, cada uno con los atributos nombre y salario. 
         * Filtra los empleados que tienen un salario mayor a 60,000 y cuenta cuántos empleados 
         * cumplen esta condición. Imprime el número de empleados que tienen un salario mayor a 60,000.

            var empleados = Arrays.asList(
                    new Empleado("Juan", 60000),
                    new Empleado("Ana", 50000),
                    new Empleado("Carlos", 70000),
                    new Empleado("Luis", 80000),
                    new Empleado("Maria", 40000));
         * 
         */

         var empleados = Arrays.asList(
            new Empleado("Juan", 60000),
            new Empleado("Luis", 40000),
            new Empleado("Pedro", 80000),
            new Empleado("Alfredo", 70000),
            new Empleado("Alejandra", 50000)
         );

         long total = empleados.stream()
         .filter(empleado -> empleado.getSalario() > 60000)
         .count();

        System.out.println("El número de empleados con salario mayor a 60000 es: " + total);
    }

    public static void Ejercicio3(){
        /*
         * Dada una lista de palabras, agrúpalas según la longitud de cada palabra. 
         * Imprime las palabras agrupadas por su longitud, mostrando la longitud y 
         * la lista de palabras que tienen esa longitud.

            var words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi");
         * 
         */
        var words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi");

        var agrupadas = words.stream()
              .collect(Collectors.groupingBy(word -> word.length()));

        for(var entry: agrupadas.entrySet()){
            System.out.println("Longitud: " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
