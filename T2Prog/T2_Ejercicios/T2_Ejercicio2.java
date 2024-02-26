package EJERCICIOS_CONDICIONES_TEMA2;
import java.util.Scanner;
public class Ejercicio_2{

    public static void main(String[] args) {

        /*2. Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7. */

        //Declaramos la variable numero entero
        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero y te dire si es múltiplo de (2, 3, 5 o 7): ");
        numero = sc.nextInt();

       if (numero %2 == 0){

            System.out.println("El numero " + numero + " es múltiplo de 2");

        }
        
        if (numero %3 == 0){
            
            System.out.println("El numero " + numero + " es múltiplo de 3");


        }

        if (numero %5 == 0){
            
            System.out.println("El numero " + numero + " es múltiplo de 5");


        }

        if (numero %7 == 0){
            
            System.out.println("El numero " + numero + " es múltiplo de 7");


        }

       sc.close();

        
    }


}