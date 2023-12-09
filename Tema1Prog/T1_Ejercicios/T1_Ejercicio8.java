package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;


public class T1_Ejercicio8 {
    public static void main(String[] args) {
        

        /*Ejercicio 8 Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su
        diferencia, de modo que el resultado sea siempre positivo) */


        // Inicio de programa y declaracion de varibles

        int num1, num2, distancia;

        //Pedimos los numeros por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        

        //Realizamos los calculos

        distancia = (num1 - num2);
        
        //Mostraremos por pantalla el resulado de la distancia

        System.out.println("La distancia entre ambos numeros es de: " + distancia);


        sc.close();

        }

        

    }

