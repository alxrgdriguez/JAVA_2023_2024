package bucles;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        /*Ejercicio 3
        Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
        contrario, el programa termina cuando se introduce un espacio.*/

        String letra = ".";
        Scanner sc = new Scanner(System.in);


        while ( !letra .equals(" ")) {
       
        System.out.println("Introduce una letra y te diré si es Vocal o no: ");
        letra = sc.nextLine(); 

        if (letra .equals("a") || letra.equals("e") || letra .equals("i") || letra.equals("o") || letra.equals("u")){

            System.out.println("La letra es una Vocal");

        }else {

            System.out.println("No es una vocal");

        }
        
        System.out.println("Introduce una letra y te diré si es Vocal o no: ");
        letra = sc.nextLine(); 

        }
        
        
    }
    
}
