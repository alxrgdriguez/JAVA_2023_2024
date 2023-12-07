package RepasoArrays;

import java.util.Arrays;

public class ejemplo3 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }
    public static void main(String[] args) {
        
        //Crea un Array de [10] generado por numero aleatorio y que cambie la primera posicion con la ultima

        int[] numero = new int[10];
        int temporal = 0;

        //Hacemos un for para recorrer nuestro Array y rellenarlo de numeros
        for (int i = 0; i < numero.length; i++) {
            
            numero[i] = numaleatorio(1, 10);
        }

        //Mostramos el Array
        System.out.println(" ---- Nuetro Array ----");
        System.out.println(Arrays.toString(numero));


        //Cambiar el valor de la primera posicion con la ultima
        temporal = numero[0];
        numero[0] = numero[numero.length-1];
        numero[numero.length-1] = temporal;

        System.out.println();
        System.out.println("Array cambiado");
        System.out.println(Arrays.toString(numero));








    }
    
}
