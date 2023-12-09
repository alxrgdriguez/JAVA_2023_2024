package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;


public class T1_Ejercicio10 {

    public static void main(String[] args) {


       /*Ejercicio 10
        Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
        PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se
        puede calcular?*/

        //Declaramos las variables

        double num1, raiz, cubica;

        //Pediremos el numero al usuario

        Scanner sc = new Scanner(System.in);
        System.out.println("Te pediré un nuemro y te diré su raiz cruadrada y cúbica:");
        System.out.println("");

        System.out.println("Introduce el numero: ");
        num1 = sc.nextDouble();

        //Calculamos la raiz cuadradrada y cúbica del numero

        raiz = Math.sqrt(num1);
        cubica = Math.cbrt(num1);

        //Imprimimos por pantalla el resultado

        System.out.println("La raiz cuadrada de " + num1 + " es " + raiz);
        System.out.println("La raiz cubica de " + num1 + " es " + cubica);










        sc.close();



    }
    
}
