package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;
import java.util.Scanner;

public class T3_Ejercicio9 {

  public static double mediaCorredor(double[] tiempos){

    double media = 0.0;

    for(int i = 0; i < tiempos.length; i++){

      media += tiempos[i];

    }
    
    media /= tiempos.length;

    return media;
  }

    public static void main(String[] args) {
        
       /**
     * Ejercicio 9. Realizar un programa que lea los tiempos en los que de 10 corredores han acabado una carrera. El programa debe
       determinar qué corredores tienen el primer, segundo y último puesto, así como cuál es el tiempo medio en que
       se ha corrido la carrera. Pista: ordénalo antes
     */

      Scanner sc = new Scanner(System.in);

        // Declarar el array para almacenar los tiempos de los corredores
        double[] tiempos = new double[10];

        // Leer los tiempos de los corredores
        for (int i = 0; i < tiempos.length; i++) {
            System.out.print("Ingrese el tiempo del corredor " + (i + 1) + ": ");
            tiempos[i] = Double.parseDouble(sc.nextLine());
        }

        // Ordenar el array de tiempos en orden ascendente
        Arrays.sort(tiempos);
      
         // Mostrar el primer, segundo y último puesto
         System.out.println("\nResultados de la carrera:");
         System.out.println("Primer puesto: Corredor 1 - Tiempo: " + tiempos[0] + " segundos");
         System.out.println("Segundo puesto: Corredor 2 - Tiempo: " + tiempos[1] + " segundos");
         System.out.println("Último puesto: Corredor 10 - Tiempo: " + tiempos[9] + " segundos");

         // Calcular y mostrar el tiempo medio
        double tiempoMedio = mediaCorredor(tiempos);
        System.out.println("\n El tiempo medio de la carrera es de: " + tiempoMedio + " segundos");

        sc.close();
    }
    
}
