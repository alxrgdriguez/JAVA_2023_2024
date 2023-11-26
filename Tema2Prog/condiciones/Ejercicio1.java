import java.util.Scanner;

class Ejercicio1{

    public static void main(String[] args) {
        
        /*Ejercicio 1
        Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no. */

        Scanner sc = new Scanner(System.in);

        //Declaramos los dos numeros que le pediremos al usuario

        int num1,num2;

        //Pedimos al usuario que ingrese los numeros

        System.out.println("\nEn este ejercicio te pediré dos números te indicaré si el primero es mayor que el segundo o no");
        System.out.println("\nIntroduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("\nIntroduce el segundo numero: ");
        num2 = sc.nextInt();


        if (num1 > num2){

            System.out.println("El numero " + num1 + " es mayor que " + num2);

        }else if (num2 > num1){

            System.out.println("El numero " + num2 + " es mayor que " + num1);

        }else {

            System.out.println("Los numeros son iguales");
        }

        sc.close();

    }


}