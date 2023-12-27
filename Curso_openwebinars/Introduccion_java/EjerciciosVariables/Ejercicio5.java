package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        /**
         * Escribir un programa que, dada una cantidad de euros, 
         * nos indique cuál es su valor en dólares americanos. Además de la variable para la
         * cantidad de euros, se debe declarar otra para el cambio (el valor de un dólar en euros) 
         * y para el resultado final. Muestra el resultado por consola.
         */

        //Ejercicio hecho por nosotros
        
        //Cantidad de euros
        double euro = 100;
        double dolar_en_euros = 0.91;

        //Conversion de euro a dolares
        double dolares = euro / dolar_en_euros;

        System.out.println("Los euros: " + euro);
        System.out.println("La conversion de dolar a euro es: " + dolares + "\n");

        //Ejercicio del curso
        double euros = 100.0; // Cantidad de euros a convertir
        double valorDolarEnEuros = 0.85; // Valor de 1 dólar en euros
        double dolar = euros / valorDolarEnEuros; // Conversión a dólares

        // Mostramos el resultado por consola
        System.out.println(euros + " euros son " + dolar + " dólares");



        





    }
    
}
