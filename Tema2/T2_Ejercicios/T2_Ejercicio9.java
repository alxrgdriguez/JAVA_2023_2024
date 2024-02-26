package EJERCICIOS_BUCLES_TEMA2;
import java.util.Scanner;
public class Ejercicio_9 {
    
    public static void main(String[] args) {
        
        /*9. Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
        forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10. */

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int contador = 0;

        System.out.print("Introduce un numero y te diré la cantidad de digitos que tiene: ");
        numero = sc.nextInt();
        int numeroOriginal = numero;

        while (numero > 0) {
          numero = (numero / 10);
          contador++;
     
          
        }

        System.out.println("El numero " + numeroOriginal + " tiene " + contador + " digitos");


        sc.close();
      }

    

}
