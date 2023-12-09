package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;

public class T1_Ejercicio7 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Ejercicio 7 Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
        cuánto deberá pagar finalmente por su compra. */

        double totalcompra, dineroPagar;

        System.out.println("Introduzca el precio total de la compra y te descontaremos el 15% ");
        dineroPagar = sc.nextDouble();

        totalcompra = (dineroPagar - 0.15);

        System.out.println("Tu precio total es de " + dineroPagar + " euros" + " y si aplicamos el 15% se nos queda en " + totalcompra + " euros");
        System.out.println("");
        System.out.println("Gracias por su compra :D");
        
        sc.close();

    }
}
