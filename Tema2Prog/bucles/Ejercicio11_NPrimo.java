package bucles;
import java.util.Scanner;

public class Ejercicio11_NPrimo {

    public static void main(String[] args) {
        

        /*Ejercicio 11
        Mostrar en pantalla los N primeros número primos. Se pide por teclado la cantidad de
        números primos que queremos mostrar. */

        int numeroPrimo = 0, totalNumerosPrimos, numeroInicial = 1, numDivide = 1, numDivisores = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números primos que desees mostrar: ");
        totalNumerosPrimos = sc.nextInt();

        while (numeroPrimo != totalNumerosPrimos){

            while (numDivide <= numeroInicial){

                if (numeroInicial % numDivide == 0){
                    System.out.println(numeroInicial + numDivisores);
                    numDivisores ++;
                }

                numDivide ++;
                
            } 

            if (numDivisores == 2 || numDivisores == 1){

                numeroPrimo++;
                System.out.println(numeroPrimo);
            }

            numeroInicial ++;
            numDivisores = 0;
            numDivide = 1;
        }



    }
    
}
