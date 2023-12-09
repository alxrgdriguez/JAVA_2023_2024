package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;

public class T1_Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        /* Ejercicio 5 Calcular la media de tres números pedidos por teclado.*/

        double num1, num2, num3;

        System.out.println("Vamos a calcular la media de 3 numeros");
        System.out.println("");

        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextDouble();

        System.out.println("Introduce el tercer numero: ");
        num3 = sc.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de tus notas es: " + media);

        sc.close();

    }

    
}
