package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;
import java.util.Scanner;

public class T3_Ejercicio7 {

    public static void main(String[] args) {
        
    /*Ejercicio 7.Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
    derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
    anterior, pero desplazando N posiciones (N es un número introducido por el usuario). */

    //Declaramos el Scanner
    Scanner sc = new Scanner(System.in);

    //Creamos un array con tamaño de 5 numeros enteros
    int[] numeros = new int[5];


    //Rellenamos el array pedido por teclado
    for(int i = 0; i < numeros.length; i++){

        System.out.println("Introduce el numero " + (i+1));
        numeros[i] = Integer.parseInt(sc.nextLine());
    }

    System.out.println(Arrays.toString(numeros));

    //Creamos una variable temporal para guardar el valor de la ultima posición
    int temp = numeros[numeros.length -1];

    for(int i = numeros.length -1; i >= 0; i--){


        //Si es cero meteremos el valor de la ultima posición con la variable temporal que hemos guardado
        if(i == 0){

            numeros[i] = temp;

        //Sino me irá sustituyendo los demás numeros en las anteriores posiciones
        }else{

            numeros[i] = numeros[i-1];
        }
        
    }

    //Mostramos los resultados el programa
    System.out.println("\nResultado:");
    System.out.println(Arrays.toString(numeros));

    //Desplazando N posiciones

    int[] n = new int[5];

    //Rellenamos el array pedido por teclado
    for(int i = 0; i < n.length; i++){

        System.out.println("Introduce un numero (N) " + (i+1));
        n[i] = Integer.parseInt(sc.nextLine());
    }

    System.out.println(Arrays.toString(n));

    int moverN = 0;
    System.out.println("Dime el numero de (N) las posiciones que deseas desplazar el array " );
    moverN = Integer.parseInt(sc.nextLine());

    //Creamos un array vacio para no perder los valores del array principal
    int[] copiaArray = new int[n.length];
    //Contamos las casillas que nos movemos (si el contador se pasa del tamaño del array, se sigue contando a partir de 0. Ejemplo: contador=1, 2,3,4,0,1...)
    int contador = 0;

    for(int i = n.length -1; i >= 0; i--){
       //Empezamos a contar segun la posicion del array
       contador=i;

       //Contamos las posiciones que se tiene que mover la casilla, segun la variable moverN
       for(int j= 0; j < moverN; j++){
        contador++;
        //Cuando llegua al final del array, se sigue contando a partir de 0.
        if(contador == n.length){
            contador=0;
        }
       }
       //Asignamos elemento actual a su nueva ubicacion en el array vacio.
       copiaArray[contador] = n[i];
    }

   System.out.println(Arrays.toString(copiaArray));

    sc.close();

    }
    
}
