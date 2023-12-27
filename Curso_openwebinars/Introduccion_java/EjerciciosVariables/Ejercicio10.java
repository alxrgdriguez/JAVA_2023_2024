package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        /**
         * Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, como por 
         * ejemplo, una sonda espacial, que se mueve a velocidad constante. Podemos suponer que el objeto ha recorrido un 
         * espacio inicial de 150.000 km y se mueve a una velocidad 17 km por segundo.
         */

        Scanner sc = new Scanner(System.in);
        int tiempoSegundos = 0;

        // Pedir al usuario que ingrese el tiempo en segundos
        System.out.print("Ingresa el tiempo en segundos: ");
        tiempoSegundos = Integer.parseInt(sc.nextLine());

        // Velocidad constante en Km/s
        double velocidad = 17.0;

        // Espacio inicial en Km
        double espacioInicial = 150000.0;

        // Calcular el espacio recorrido usando la fórmula: espacio = espacio inicial + (velocidad * tiempo)
        double espacioRecorrido = espacioInicial + (velocidad * tiempoSegundos);

        // Mostrar el resultado
        System.out.println("El espacio recorrido en " + tiempoSegundos + " segundos es: " + espacioRecorrido + " km");

        // Cerrar el scanner
        sc.close();
    }
    
}
