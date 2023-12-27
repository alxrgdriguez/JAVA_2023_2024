package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        /**
         * Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, como por 
         * ejemplo, una sonda espacial, que se mueve a velocidad constante. Podemos suponer que el objeto ha recorrido un 
         * espacio inicial de 150.000 km y se mueve a una velocidad 17 km por segundo.
         */

         // Datos del problema
        double espacioInicialKm = 150000.0; // Espacio inicial en kilómetros
        double velocidadKmps = 17.0; // Velocidad en kilómetros por segundo
        double tiempoSegundos = 0.0; // Tiempo en segundos (inicialmente 0)

        // Calcular el espacio recorrido utilizando la fórmula: espacio = velocidad * tiempo
        double espacioRecorridoKm = velocidadKmps * tiempoSegundos;

        // Imprimir el espacio recorrido inicial
        System.out.println("Espacio recorrido inicial: " + espacioRecorridoKm + " km");


    }
    
}
