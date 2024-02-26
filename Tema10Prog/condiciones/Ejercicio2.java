import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        /*Ejercicio 2
        Escribe un programa que lea un número e indique si es par o impar*/

        Scanner sc = new Scanner(System.in);

        //Declaramos las variables

        int num1;

        //Pedimos al usuario el numero y le diremos si es par o impar

        System.out.println("Introduzca un numero y diré si es par o impar");
        System.out.println("");

        System.out.println("Ingrese el numero: ");
        num1 = sc.nextInt();

        if (num1 %2 == 0){

            System.out.println("El numero es par");

        }else {

            System.out.println("El numero es impar");
        }

        sc.close();
    }
    
}
