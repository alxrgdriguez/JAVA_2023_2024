package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;

public class T1_Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num1, num2;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextDouble();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        double suma = (num1 + num2);
        double resta = (num1 - num2);
        double multiplicacion = (num1 * num2);
        double division = (num1 / num2);

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("La divisón de " + num1 + " y " + num2 + " es: " + division);

        sc.close();

    }
    
}
