package EjerciciosRepaso_UT2;

import java.util.Scanner;

public class Ejercicio11 {

    /**
     * Ejercicio 11
     * Realiza un programa que pida por teclado un número que será la base. Luego debe pedir otro número
        que indique hasta qué exponente lo quieres elevar y muestra todas esas potencias. Ej. Introduces el 3 y
        el 7, y debe mostrar 3^1, 3^2, 3^3, 3^4, 3^5, 3^6, 3^7.
        .
     */

    public static void main(String[] args) {
        
        //Creamos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos la base
        System.out.println("Introduce la base: ");
        int base = sc.nextInt();

        // Pedimos el exponente
        System.out.println("Introduce el exponente: ");
        int exponente = sc.nextInt();

        // Imprimimos las potencias
        for (int i = 1; i <= exponente; i++) {
            System.out.println(base + "^" + i + " = " + (int)Math.pow(base, i));
        }
    }
}
    
