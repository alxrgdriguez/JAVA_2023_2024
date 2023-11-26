package EJERCICIOS_CONDICIONES_BUCLES_TEMA2;


public class Ejercicio_13 {

    public static void main(String[] args) {

        /*13. Programa que muestre por pantalla los números del 1 al 100 sin mostrar los que sean múltiplos de 5 */

        for (int i = 1; i <= 100; i++){

            if (i %5 != 0){

                System.out.println(i);
            }
        }


    }
    
}
