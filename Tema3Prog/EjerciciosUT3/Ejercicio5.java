import java.util.Arrays;

public class Ejercicio5 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }


    public static void main(String[] args) {
        
        /*Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
        menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
        Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array. */

        int[] numeros = new int[10];
        int mediaNumeros = 0;
        int sumaNumeros = 0;


        for (int i = 0; i < numeros.length; i++){

            numeros[i] = numaleatorio(1, 1);

            //Calculamos la suma 

            sumaNumeros += numeros[i];

            //Calcular la media

            mediaNumeros = sumaNumeros / numeros.length;

        }
           

        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de todas las posciones del array es de " + sumaNumeros);
        System.out.println("La media de la suma es de: " + mediaNumeros);


    }

}
 