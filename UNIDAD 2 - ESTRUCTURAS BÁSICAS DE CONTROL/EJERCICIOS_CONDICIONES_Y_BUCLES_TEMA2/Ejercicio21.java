import java.util.Scanner;
public class Ejercicio21 {

    public static void main(String[] args) {
        
        /*21. Pedir un número entre 1 y 999 y mostrarlo con las cifras al revés.  */

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int decenas, centenas, unidades;
        int numeroReves;

        System.out.println("Introduce un numero y te diré cuales son sus (decenas, centenas y unides)");
        numero = sc.nextInt();

        centenas = (numero / 100);
        decenas = (numero / 10 % 10);
        unidades = (numero % 10);

        System.out.println("Centenas " + centenas);
        System.out.println("Decenas " + decenas);
        System.out.println("Unidades " + unidades);

        numeroReves = (100 * unidades) + (10 * decenas) + centenas;

        System.out.println("El número del revés es " + numeroReves);


        sc.close();
    }
    
}
