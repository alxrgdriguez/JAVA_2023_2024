package EJERCICIOS_CONDICIONES_BUCLES_TEMA2;

import java.util.Scanner;

public class Ejercicio_18 {

    public static boolean esPrimo(int num){

        for(int i = 2; i < num; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
        /*18. Diseña un método que indique si un número entero pasado como parámetro es o no un número primo
        (devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número,
        únicamente. */

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        boolean esPrimo;

        System.out.print("Introduce un numero y te diré si es primo: ");
        numero = sc.nextInt();

        esPrimo = esPrimo(numero);

        if(esPrimo == true){

            System.out.println("Numero es primo");
            
        }else {

            System.out.println("No es primo");
        }

        sc.close();
    }
    
}
