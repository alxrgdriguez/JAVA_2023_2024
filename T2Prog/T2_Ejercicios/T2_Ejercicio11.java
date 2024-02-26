package EJERCICIOS_BUCLES_TEMA2;

public class Ejercicio_11 {

    public static void main(String[] args) {
        

        /*11. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        número de líneas, que se pida por teclado.
        
            ESTRUCTURAS BÁSICAS DE CONTROL_697cb358\bin' 'EJERCICIOS_BUCLES_TEMA2.Ejercicio11' 
                    *
                   **
                  ***
                 ****
                *****
            */

        int n = 5;

        for(int i = 1; i <= n; i++) {
            //System.out.print("imprimir " + (n-i-1) + " espacios | ");

            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }

            for(int k=1; k <= i; k++) {
                System.out.print("*");
            }

        System.out.println();
        }


    }
}

