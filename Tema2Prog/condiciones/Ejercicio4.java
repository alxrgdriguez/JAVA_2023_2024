import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        
        /*Ejercicio 4
        Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el
        exponente. Pueden ocurrir tres cosas: */

        //El exponente sea positivo, sólo tienes que imprimir la potencia.
        //El exponente sea 0, el resultado es 1.
        //El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

        Scanner sc = new Scanner(System.in);

        int base, exponente;

        //Pedimos la base y el exponente al usuario

        System.out.println("\nEn el ejercicio de hoy calcularemos la potencia\n ");
        System.out.println("Introduce la base");
        base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        exponente = sc.nextInt();

        if (exponente > 0){

            System.out.println("La potencia es " + (int)Math.pow(base, exponente));

        }else if (exponente == 0){

            System.out.println("El resultado de la potencia es 1");

        }else {

            double resultadoPotencia = (int)1 / Math.pow(base, Math.abs(exponente));
            System.out.println("El resultado de la potencia es " + resultadoPotencia);

        }

        sc.close();
    }
    
        
}
