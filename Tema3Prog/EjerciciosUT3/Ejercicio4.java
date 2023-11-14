package Tema3Prog.EjerciciosUT3;

import java.util.Scanner;

public class Ejercicio4 {

    /**
     * Ejercicio 4.
     *Programa en Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una
      altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe
      ser entero positivo
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1;

        do {
            // Solicitar el número de personas (N)
            System.out.print("Ingrese el número de personas (N): ");
            n = scanner.nextInt();

            // Validar que N sea un entero positivo
            if (n <= 0) {
                System.out.println("Ingrese un número entero positivo para N.");
            }

        } while (n <= 0);

        // Declarar un array para almacenar las alturas
        double[] alturas = new double[n];

        // Solicitar las alturas de cada persona
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + " (en cm): ");
            alturas[i] = scanner.nextDouble();
        }

        // Calcular la altura media
        double sumaAlturas = 0;
        
        double alturaMedia = sumaAlturas / n;

        // Contar personas con altura superior e inferior a la media
        int personasSuperiorMedia = 0;
        int personasInferiorMedia = 0;

        for (int i = 0; i < alturas.length; i++) {

            double altura = alturas[i]; 

            if (altura > alturaMedia) {
                personasSuperiorMedia++;
            } else if (altura < alturaMedia) {
                personasInferiorMedia++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Altura media: " + alturaMedia + " cm");
        System.out.println("Las personas con altura superior a la media son: " + personasSuperiorMedia);
        System.out.println("Las personas con altura inferior a la media sonnnnnn: " + personasInferiorMedia);

        // Cerrar el scanner
        scanner.close();
    }
}

