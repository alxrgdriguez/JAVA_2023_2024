package EJERCICIOS_BUCLES_TEMA2;
import java.util.Scanner;
public class Ejercicio_10 {
 
    public static void main(String[] args) {
        
        /*10. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        número de líneas, que se pida por teclado.
        *
        **
        ***
        **** */

        char simbolo = '*';
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero de lineas: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= i; j++){

                System.out.print(simbolo);
            }

            
            System.out.println();
        }

        sc.close();
    }

}
