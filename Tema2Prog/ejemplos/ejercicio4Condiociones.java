package ejemplos;
import java.util.Scanner;

import java.util.Scanner;

public class ejercicio4Condiociones {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Declaramos la variable entera
        int numero;

        //Pedimos el numero para que el usuario lo muestre por pantalla
        System.out.println("Introduce un numero entero: ");
        numero = sc.nextInt();

        if ( numero %2 == 0 && numero %10 == 0){

            System.out.println("El numero " + numero + " es par y multiplo de 10");

        }else if (numero % 2 == 0  && numero %10 != 0){

            System.out.println("El numero " + numero + " es par " + "pero no es multiplo de 10");

        }else if (numero %2 != 0){

            System.out.println("El numero es impar y no es multiplo de 10");

        }



        


    }
}


