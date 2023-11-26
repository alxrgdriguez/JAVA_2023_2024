package EJERCICIOS_CONDICIONES_BUCLES_TEMA2;

import java.util.Scanner;

public class Ejercicio_19 {

    public static boolean esPrimo(int num){

        for(int i = 2; i < num; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
        /*19. Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla todos los
        números primos menores que él. Utiliza la función del ejercicio anterior. Ejemplo:
        Dime un número: 15
        Los primos menores de 15 son: 1,2,3,5,7,11,13*/

        int numero; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número: ");
        numero = sc.nextInt();

        String listaNumeros = "";

        for(int i = 1; i <=numero; i++){

            if (esPrimo(i) == true){

                listaNumeros = listaNumeros + i + " ";

            }
        }


        System.out.println("Los primos menores de " + numero + " son " + listaNumeros);


        sc.close();
    }
    
}
