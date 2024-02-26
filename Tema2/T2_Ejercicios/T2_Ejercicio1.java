package EJERCICIOS_CONDICIONES_TEMA2;

import java.util.Scanner;

public class Ejercicio_1 {


    public static int mayor(int a, int b, int c){

        if (a > b && a > c){

            return a;

        }else if (b > a && b > c) {

            return b;

        }else if (c > a && c > b){

            return c;

        }else{

            return a;
        }

    }

    public static void main(String[] args) {
        
        /*1. Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
        los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
        public int mayor (int a, int b, int c) { … }
         */

        int numero1, numero2, nuemro3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 numeros y te dire cual es mayor\n");

        System.out.print("Introduce el primer numero: ");
        numero1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        numero2 = sc.nextInt();

        System.out.print("Introduce el tercer numero: ");
        nuemro3 = sc.nextInt();

        System.out.print("El numero mayor es " + mayor(numero1, numero2, nuemro3));

        sc.close();

    }
    
}
