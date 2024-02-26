package EJERCICIOS_BUCLES_TEMA2;
import java.util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
        
        /*5. Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10. */

        int num1 = 0;

        Scanner sc = new Scanner(System.in);

        while (num1 < 1 || num1 > 10){

            System.out.print("\nIntroduce un numero: ");
            num1 = sc.nextInt();

        }

        System.out.println("\nAdios");

        sc.close();

    }
    
}
