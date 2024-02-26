package PracticaClase_UT2;

import java.util.Scanner;

public class Ejercicio1 {

    public static int contarDigitos(int num1) {

        int numero = 0;
        int contador = 0;

        int numeroOriginal = numero;

        while (numero > 0) {
            numero = (numero / 10);
            contador++;

        }

        System.out.println("El numero " + numeroOriginal + " tiene " + contador + " digitos");

        return numero;
    }

    public static boolean esPrimo(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int opcion3(int opcion3) {

        return 0;

    }

    public static int salir(int opcion4) {

        System.out.println("Adios, vuelva pronto");
        return 0;

    }

    public static void main(String[] args) {

        /*
         * OPCIÓN 1
         * Menú
         * Realiza un programa que pida un número por teclado. Luego muestra un menú con
         * las
         * siguientes opciones:
         * 
         * 1. Muestra la suma de cada uno de sus dígitos
         * 2. Que diga si es primo o no
         * 3. La longitud de una circunferencia cuyo radio fuera ese número
         * 4. Salir
         * Para cada una de las opciones deberás llamar a una función que calcule lo que
         * se pide y
         * devuelva el resultado.
         */

        Scanner sc = new Scanner(System.in);

        int opcion = 1;
        int resultado = 0;

        try {
            while (opcion != 4) {

                System.out.println("");
                System.out.println("------ MENU -----");
                System.out.println("1. Muestra la suma de cada uno de sus dígitos");
                System.out.println("2. Que diga si es primo o no");
                System.out.println("3. La longitud de una circunferencia cuyo radio fuera ese número");
                System.out.println("4. Salir");

                System.out.print("Introduce la opcion que desees: ");
                opcion = Integer.parseInt(sc.nextLine());


                switch (opcion) {
                    case 1:

                

                    case 2:

                        int numero = 0;
                        boolean esPrimo;

                        System.out.print("Introduce un numero y te diré si es primo: ");
                        numero = sc.nextInt();

                        esPrimo = esPrimo(numero);

                        if (esPrimo == true) {

                            System.out.println("Numero es primo");

                        } else {

                            System.out.println("No es primo");
                        }

                        break;

                    case 3:

                        break;

                    default:

                        salir(opcion);
                        break;
                }

            }

        } catch (Exception e) {

            e.getMessage();
            System.out.println("Error debes introducir un numero entero entre (1 - 4)");

        }

    }

}
