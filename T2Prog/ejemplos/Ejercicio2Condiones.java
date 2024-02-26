package ejemplos;
import java.util.Scanner;

public class Ejercicio2Condiones {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Declaramos la variable entera
        int numero;

        //Pedimos el numero para que el usuario lo muestre por pantalla
        System.out.println("Introduce un numero entero y te diré si es par o impar: ");
        numero = sc.nextInt();

        if ( numero %2 == 0){

            System.out.println("El numero " + numero + " es par");

        }else {

            System.out.println("El numero " + numero + " es impar");
        }


        


    }
}
