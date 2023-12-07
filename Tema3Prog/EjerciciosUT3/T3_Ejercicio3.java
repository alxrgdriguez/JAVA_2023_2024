package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;
import java.util.Scanner;

public class T3_Ejercicio3 {

    public static int numaleatorio(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        
        /**
         * Ejercicio 3
         * Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300
           y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar
           que se introduce un numero correcto), estos deben guardarse en un nuevo array. Por ejemplo, en un array de 10
           posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc. Cuando llene el segundo
           array finalizamos
         */


        Scanner sc = new Scanner(System.in);

        int tamanio = 0;
        int digito = -1;
        int contador = 0;

        do{

            try {
                System.out.println("Introduce el tamaño del array");
                tamanio = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                
                System.out.println(e.getMessage());
                System.out.println("Debe ser un numero");
            }

        }while(tamanio <= 0);

        //Nos creamos un array con el tamaño introducido por el usuario
         int[] numeros = new int[tamanio];
         

         System.out.println("El tamaño del array es de " + numeros.length);

         //Rellenamos el array con valores aleatorios
         for(int i = 0; i < numeros.length; i++){

            numeros[i] = numaleatorio(1, 300);

         }

         System.out.println(Arrays.toString(numeros));

        do{
            try {
                System.out.println("Introduce un digito");
                digito = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Debes introducir un digito");
            }
         
        }while(digito < 0 || digito > 9);//El digito tiene que estar entre 0 y 9

        //Creamos un array secundario con el mismo tamaño que el primero para guardar los numeros cuyo final sea igual que el digito pasado por el usuario
        int[] numerosBuscados = new int[tamanio];

        //Recorremos el array principal con los numeros para buscar los que terminan por el digito
        for(int i = 0; i < numeros.length; i++){
            //Convertimos a cadena el numero a la posicion i del array y lo guardamos en una variable (PORQUE NO SE PUEDE COMPARAR TROZOS DE NUMEROS CON ENTEROS)
            String valorNumero = String.valueOf(numeros[i]);
            String digitoACadena = String.valueOf(digito);
            //Comprobamos si el numero acaba con el digito pasado por parametro con el metodo endsWith
            if(valorNumero.endsWith(digitoACadena)){
                //Guardamos el numero que coincide con el digito en el array secundario
                numerosBuscados[contador] = numeros[i];
                contador++;
            }
        }
        System.out.println();
        //Recorremos el array secundario HASTA el contador para no mostrar los huecos vacios
        for(int i = 0; i < contador;i++){
            System.out.print(numerosBuscados[i] + " ");
        }        

        sc.close();

    }

    
}
