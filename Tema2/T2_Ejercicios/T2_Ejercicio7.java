package EJERCICIOS_BUCLES_TEMA2;
import java.util.Scanner;
public class Ejercicio_7 {

    public static void main(String[] args) {
        
        /*7. Función que calcule el factorial de un número entero positivo pasado como parámetro. */

        int numFactorial = 1;
        int total = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce un numero y te diré el factorial: ");
        numFactorial = sc.nextInt();

        for (int i = 1; i <= numFactorial; i++){
            
            total  = total * i;

        }

        System.out.println("\nEl factorial del numero " + numFactorial + " es " + total);

        sc.close();
    }
        
}
