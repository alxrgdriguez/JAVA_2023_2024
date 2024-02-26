package bucles;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        
        /*Ejercicio 1
        Crea una aplicación que permita adivinar un número. La aplicación genera un número
        aleatorio del 1 al 100. A continuación, va pidiendo números y va respondiendo si el número
        a adivinar es mayor o menor que el introducido, además de los intentos que te quedan
        (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
        (además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te
        muestra el número que había generado. */

        Scanner sc = new Scanner(System.in);

        //Adivinar un numero que genera el ordenador

        //Generar el numero
        int numero;
        numero = (int) (Math.random() * 100) - 1;



    }
    
}
