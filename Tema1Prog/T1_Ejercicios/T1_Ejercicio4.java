package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;

public class T1_Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /*Ejercicio 4
        Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
        Recordar que la fórmula para la conversión es:
        C = (F-32)*5/9 */

        double gradosFa, Celsius;

        System.out.println("Escriba los grados Fahrenheit y los pasaré a Celsius: ");
        gradosFa = sc.nextDouble();

        Celsius = (gradosFa - 32) * 5 / 9;

        System.out.println("El resultado a Celsius es: " + Celsius);

        sc.close();

    }
    
}
