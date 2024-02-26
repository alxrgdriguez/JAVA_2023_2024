import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        
        /*22. Pedir un número entre 1 y 9999 y decir si es capicúa. */

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int centenas, decenas, unidades;
        int numeroReves;

        System.out.println("Introduce el numero: ");
        numero = sc.nextInt();

         //Hacer un bucle para indicar que el numero este en ese rango

         while (numero < 1 || numero > 9999){

            System.out.println("Por favor, introduce un número entre 1 y 9999 ");
            System.out.print("Introduce un número entre 1 y 9999: ");
            numero = sc.nextInt();
        }

        centenas = numero / 100;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        System.out.println("Centenas " + centenas);
        System.out.println("Decenas " + decenas);
        System.out.println("Unidades " + unidades);

        numeroReves = (100 * unidades) + (10 * decenas) + centenas;

        System.out.println("El número al revés es " + numeroReves);

        sc.close();



    }
}

    
    

