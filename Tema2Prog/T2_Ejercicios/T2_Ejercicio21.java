import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
     
        /*21. Pedir un número entre 1 y 999 y mostrarlo con las cifras al revés.  */

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int numeroAlReves = 0;
        int digito = 0;


        // Pedir un número entre 1 y 999
        System.out.print("Introduce un número entre 1 y 999: ");
        numero = sc.nextInt();


        //Hacer un bucle para indicar que el numero este en ese rango

        while (numero < 1 || numero > 999){

            System.out.println("Por favor, introduce un número entre 1 y 999.");
            System.out.print("Introduce un número entre 1 y 999: ");
            numero = sc.nextInt();
        }

        //Convetir el numero al revés
        while (numero > 0) {
            digito = numero % 10;
            numeroAlReves = numeroAlReves * 10 + digito;
            numero /= 10;
        }

        System.out.println("El número al revés es: " + numeroAlReves);

        // Cerrar el scanner
        sc.close();

             /*Otra manera de hacerlo
         int numero = 98765;
        int numeroInvertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;

            numeroInvertido = numeroInvertido * 10 + digito;

            numero /= 10;
        }
        
        System.out.println("Número invertido: " + numeroInvertido);
    }
}
         */


    }
    
}
