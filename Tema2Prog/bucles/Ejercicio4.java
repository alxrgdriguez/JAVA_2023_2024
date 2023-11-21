package bucles;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        
        /*Ejercicio 4
        Escribir un programa que imprima todos los números pares entre dos números que se le
        pidan al usuario. */

        Scanner sc = new Scanner(System.in);

        //Declaramos todas la variables que utilizaremos en nuestro programa

        int num1, num2, maximo, minimo;

        // Pedir los numeros al usuario
        System.out.println("");
        System.out.println("El programa imprimirá todos los números pares entre dos números indicados.");
        System.out.println("");
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();


        //Indicamos cual es el valor maximo y minimo
        if (num1 > num2){

            maximo = num1;
            minimo = num2;

        }else {

            maximo = num2;
            minimo = num1;

        }

        // Bucle for para hacer cálculos y mostrar en pantalla
        for (int i = minimo ; i < maximo +1; i++){
            if (i%2==0){
            System.out.println(i); 

            }

        }


    }
    
}
