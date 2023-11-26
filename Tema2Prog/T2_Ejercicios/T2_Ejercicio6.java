package EJERCICIOS_BUCLES_TEMA2;
import java.util.Scanner;
public class Ejercicio_6 {

    public static void main(String[] args) {
        
        /*6. Programa que sume los 100 primeros números enteros impares */

        int calculoImpares = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 200; i++){

            if (i %2 != 0){

                calculoImpares = calculoImpares + i;

            }

        }
    
        System.out.println(calculoImpares);

        sc.close();
    }
    
}
