package EjerciciosRepaso_UT2;

import java.util.Scanner;

/**
 * Ejercicio1
 * Realiza un programa que vaya pidiendo números enteros mientras no introduzcas el -1. Como resultado
   debe devolver la cantidad de números introducidos y la suma de esos números.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        int suma = 0;


        while (numero != -1) {

            try {
                System.out.println("Introduce un numero, si escribes -1 terminará el programa: ");
                numero = Integer.parseInt(sc.nextLine());

                if (numero != -1){

                    //Sumar los numeros excepto el -1
                    suma += numero;
                    contador++;
                }

                
            } catch (Exception e) {
                
                System.out.println(e.getMessage());
                System.out.println("Debes introducir un numero");
            }
            
            
        }
        
        System.out.println("Has introducido " + contador + " numeros");
        System.out.println("La suma de los numeros es " + suma);

        sc.close();
    }
}