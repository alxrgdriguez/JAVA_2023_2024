package Tema3Prog.RepasoArrays_Casa;

public class repaso_casa_1 {


    public static void main(String[] args) {
    /**
 *  Ejercicio 1:
    Crear un array de números enteros y mostrar en la consola la suma de todos los elementos
    */
    
    // Primero nos creamos nuestro array de números enteros, yo lo crearé de una longitud de 8
    int[] numeros = new int[8];

    // Creamos la variable suma para guardar la suma
    int suma = 0;

    // Inicializamos el array con algunos valores 
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = i + 1; 

        System.out.println(numeros[i]);
    }
    }
    


}
