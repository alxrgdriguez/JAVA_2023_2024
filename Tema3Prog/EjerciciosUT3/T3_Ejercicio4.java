package Tema3Prog.EjerciciosUT3;

import java.util.Scanner;

public class T3_Ejercicio4 {

    public static void main(String[] args) {
        
        /**
     * Ejercicio 4.
     *Programa en Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una
      altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe
      ser entero positivo
     */

    Scanner sc = new Scanner(System.in);

    //Declaramos la variable entera para el número personas
    int N = -1;
    
    do {

        try {
               
            System.out.print("Introduce el número de personas: ");
            N = Integer.parseInt(sc.nextLine());

             // Validar que N sea un entero positivo
             if (N <= 0) {
                System.out.println("Ingrese un número entero positivo para N.");
            }

            } catch (Exception e) {
            
                System.out.println(e.getMessage());
                System.out.println("Error al introducir el NUMERO de personas, prueba de nuevo");
            }
        
     } while (N <= 0);

    // Declaramos un array para almacenar las alturas
    double[] alturas = new double[N];

    // Solicitar las alturas de cada persona
    for (int i = 0; i < N; i++) {
        System.out.print("Ingrese la altura de la persona " + (i + 1) + " (en cm): ");
        alturas[i] = Double.parseDouble(sc.nextLine());
    }

    // Calcular la suma de las alturas
    double sumaAlturas = 0;
    double alturaMedia = 0;

    for(int i = 0; i < alturas.length; i++){

        sumaAlturas +=alturas[i];

    }

    //Calculamos la media de las alturas

    alturaMedia = sumaAlturas / alturas.length; //Tambien se podría hacer: alturaMedia = sumaAlturas / N;

    //Calcular cuántas personas tienen una
    //altura superior a la media y cuántas tienen una altura inferior a la media

    int contadorSuperior = 0;
    int contadorInferior = 0;


    for (int i = 0; i < alturas.length; i++) {

        if(alturas[i] > alturaMedia){

            contadorSuperior++;

        }else if (alturas[i] < alturaMedia){

            contadorInferior++;
        }
        
    }

    //Mostramos los resultados
    System.out.println("\nResultados:");
    System.out.println("La altura media es de: " + alturaMedia);
    System.out.println("Hay "+ contadorSuperior + " personas con una altura superior a la media");
    System.out.println("Hay " + contadorInferior + " personas con una altura inferior a la media");

    sc.close();

    }
    
}
