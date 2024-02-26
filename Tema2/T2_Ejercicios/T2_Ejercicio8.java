package EJERCICIOS_BUCLES_TEMA2;
import java.util.Scanner;
public class Ejercicio_8 {

    public static void main(String[] args) {
        
        /*8. Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado */

        int numero = 0;
        int multiplicar=1;

        Scanner sc = new Scanner(System.in);

        while (numero < 1 || numero > 10 ){

            System.out.println("Introduce un numero y te dire la tabla de multiplicar: ");
            numero = sc.nextInt();

        }
        

        for(int i = 1; i <= 10; i++){

            multiplicar = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicar);
        }

        sc.close();
    }
    
}
