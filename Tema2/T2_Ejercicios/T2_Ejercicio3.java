package EJERCICIOS_CONDICIONES_TEMA2;
import java.util.Scanner;
public class Ejercicio_3 {

    public static void main(String[] args) {
        
        /*3. Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde
        (uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”; si se introduce
        el 11, se mostrará el mensaje “Error: no es un número de un dígito” */

        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un dígito: ");
        numero = sc.nextInt();

        switch (numero){

            case 0:

                System.out.println("CERO");
                break;

            case 1:

                    System.out.println("UNO");
                    break;
            
            case 2:

                    System.out.println("DOS");
                    break;
            
            case 3:

                System.out.println("TRES");
                break;

            case 4:

                System.out.println("CUATRO");
                break;

            case 5:

                System.out.println("CINCO");
                break;

            case 6:

                System.out.println("SEIS");
                break;

            case 7:

                System.out.println("SIETE");
                break;

            case 8:

                System.out.println("OCHO");
                break;

            case 9:

                System.out.println("NUEVE");
                break;

            default:

                System.out.println("Error: no es un número de un dígito");
                break;


        }
        sc.close();

    }
    
}
