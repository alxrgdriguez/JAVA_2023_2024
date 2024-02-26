package EjerciciosRepaso_UT2;

public class Ejercicio4 {

    /**
     * Ejercicio4
     * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for. Házlo
       también con un while
     */

    public static void main(String[] args) {
        
        System.out.println("Con Bucle For");
        for (int i = 320; i>=160; i= i-20){

            System.out.println(i);

        }

        System.out.println();

        System.out.println("Con Bucle While");
        int numeroGrande=320;
        int numeroPequenio= 160;
        int contador = 20;

        while (numeroGrande >= numeroPequenio) {

            System.out.println(numeroGrande);

            numeroGrande -= contador;    
        }

        
    }
    
}
