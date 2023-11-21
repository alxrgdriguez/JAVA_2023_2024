package bucles;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        
        /*Ejercicio 2
        Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
        introducir). El programa debe informar de cuantos números introducidos son mayores que
        0, menores que 0 e iguales a 0. */


        int cantidadNumeros;
        int num;
        int cantidadMayor0 = 0;
        int cantidadMenor0 = 0;
        int cantidad0 = 0;

        Scanner sc = new Scanner(System.in);

        //Pedir cuantos numeros vas a introducir
        System.out.println("Introduce la cantidad de numeros que quieras introducir: ");
        cantidadNumeros = sc.nextInt();

        //Pedir por teclado en un bucle todos esos numeros

        for (int i = 0; i<cantidadNumeros ; i++){

            System.out.println("Escribe un numero: ");
            num  = sc.nextInt();

            if (num> 0){

                cantidadMayor0++;

            }else if (num < 0){

                cantidadMenor0++;

            }else if (num == 0){

                cantidad0++;
            }

           
        }

         //Pintar resultado

         System.out.println("Numeros mayores que cero " + cantidadMayor0);
         System.out.println("Numeros menores que cero " + cantidadMenor0);
         System.out.println("Numeros igual que cero " + cantidad0);


    }
    
}
