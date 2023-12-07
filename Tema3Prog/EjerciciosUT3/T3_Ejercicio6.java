package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;

public class T3_Ejercicio6 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        
    /*Ejercicio 6. Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
    segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.*/

    //El array se mostrará asi: [el primero, el último, el segundo, el penúltimo, el tercero etc]

        int[] numeros = new int[10];
        //Hacer una copia del array


        for(int i = 0; i < numeros.length; i++){

            numeros[i] = numaleatorio(1, 10);

        }

        for (int i = 0; i < numeros.length -1; i++){

            System.out.println(Arrays.toString(numeros));
            


        }




    }
    
}
