import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        /*Ejercicio 3
        Crea un programa que pida al usuario dos números y muestre su división si el segundo no es
        cero, o un mensaje de aviso en caso contrario */

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Introduce el primer numero: ");
        numero1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        numero2 = sc.nextInt();

        // Comprobamos que el divisor no sea cero
        if (numero2 == 0) {
            // Mostramos un mensaje de aviso
            System.out.println("No se puede dividir por cero.");
        } else {
            // Calculamos la división
            int division = numero1 / numero2;

            // Mostramos el resultado
            System.out.println("La division de " + numero1 + " / " + numero2 + " = " + division);
        }
        
        sc.close();
    }
    
}