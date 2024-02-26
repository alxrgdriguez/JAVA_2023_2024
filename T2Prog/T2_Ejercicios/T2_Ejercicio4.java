package EJERCICIOS_CONDICIONES_TEMA2;

import java.util.Scanner;

public class Ejercicio_4 {


    public static void billetera(int cant){

        int b200, b100, b50, b20, b10, b5, sobra, resto;
        
        b200 = cant / 200;
        resto = cant % 200;
        b100 = resto / 100;
        resto = resto % 100;
        b50 =  resto / 50;
        resto = resto % 50;
        b20 = resto / 20;
        resto = resto % 20;
        b10 = resto / 10;
        resto = resto % 10;
        b5 = resto / 5;
        sobra = resto % 5;
        
        System.out.println("Billetes de 200 " + b200);
        System.out.println("Billetes de 100 " + b100);
        System.out.println("Billetes de 50 " + b50);
        System.out.println("Billetes de 20 " + b20);
        System.out.println("Billetes de 10 " + b10);
        System.out.println("Billetes de 5 " + b5);

        System.out.println("Sobra " + sobra);
    }

    
    public static void main(String[] args) {

        /*4. Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
        número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
        362 euros = 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
        que ir sacando la división entera, y el resto se lleva al siguiente billete. */

        int cantidad=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nDime una cantidad: ");
        cantidad = sc.nextInt();

        //Llamar a la función
       billetera(cantidad);


        sc.close();

        
    }
    
    
}
