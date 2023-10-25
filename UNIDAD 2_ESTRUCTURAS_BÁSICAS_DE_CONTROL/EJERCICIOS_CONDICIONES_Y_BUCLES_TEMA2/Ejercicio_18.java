import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {
        
        /*18. Diseña un método que indique si un número entero pasado como parámetro es o no un número primo
        (devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número,
        únicamente. */

        Scanner sc = new Scanner(System.in);

        boolean esPrimo = true;
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++){

            if (numero %i == 0 ){

                esPrimo = false;
                break;
            }

        }

        System.out.println(esPrimo);

        sc.close();
    }
    
}
