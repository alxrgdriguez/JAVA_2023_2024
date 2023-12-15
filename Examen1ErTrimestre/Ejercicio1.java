package Examen1ErTrimestre;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumarDiagonalP(int[][] matriz){

        int resultado = 0;

        for(int i = 0; i < matriz.length; i++){
            resultado += matriz[i][i];

        }

        return resultado;

    }


    public static int sumarDiagonalI(int[][] matriz){

        int resultado = 0;
       
        



        return resultado;

    }

    public static int sumarColumna(int[][] matriz, int columna){

        int resultado = 0;

        for(int i = 0; i < matriz[0].length; i++){

            resultado += matriz[i][columna];
        }

        return resultado;

    }

    public static int maximoMatriz(int matriz[][]){

        int maximo = Integer.MIN_VALUE;

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[0].length; j++){

                //Decimos cual es el maximo

                if(matriz[i][j] > maximo){

                    maximo = matriz[i][j];
                }
            }
        }

        return maximo;

    }


   
    public static void transpuesta (int[][] matriz) {
    
    int[][] temp = new int[matriz[0].length][matriz.length];


    for (int i = 0; i < matriz[0].length; i++) {
        
      for (int j = 0; j < matriz.length; j++) {
        
        temp[i][j] = matriz[j][i];

      }

    }

    System.out.println("--- TRANSPUESTA ---");
    pintarMatriz(matriz);

  }


    public static void intercambiaFilas (int[][] matriz, int num1, int num2) {
    
        //Nos creamos unas variable temporal para guardar el valor de la posicion [0] y que después no se nos pierda
        int[] temp = new int[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {

            temp[i] = matriz[num1][i];
            matriz[num1][i] = matriz[num2][i];
            matriz[num2][i] = temp[i];
        }

        System.out.println(" -- INTERCAMBIO DE FILAS ---");
        pintarMatriz(matriz);

  }

  
    public static void ordenarfilas (int[][] matriz) {

     
        
        System.out.println("Matriz despues de ordenar filas:");
        pintarMatriz(matriz);

  }




    public static void main(String[] args) {
        
        /**
         * Ejercicio 1. Nos piden crear una matriz 20×20 de números enteros que inicialmente
            rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:

            1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
            primera por los valores de la segunda.
            2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
            3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas
            4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
            5. Pinta la matriz traspuesta
            6. Muestra la matriz con las filas ordenadas de mayor a menor
            7. Salir
         */

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[20][20];
        int opcion = 0;

        //Rellenamos el tablero
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = generarNumero(1, 100);
            }
        }

        //Pintamos la matriz generada con numeros aleatorios
        System.out.println("---- MATRIZ ----");
        pintarMatriz(matriz);
        


        do {
        System.out.println("\n---- MENU ----");
        System.out.println("1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la" + 
        "primera por los valores de la segunda");
        System.out.println("2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)");
        System.out.println("3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas");
        System.out.println("4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz");
        System.out.println("5. Pinta la matriz traspuesta");
        System.out.println("6. Muestra la matriz con las filas ordenadas de mayor a menor");
        System.out.println("7. Salir");
        System.out.print("Introduce una opcion: ");

        try {

            opcion = Integer.parseInt(sc.nextLine());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("La opcion debe ser un numero valido");
        }

        switch (opcion) {
            case 1:
                int num1 = 0;
                int num2 = 0;


                do {

                    System.out.println("Introduce el primer numero de fila que desees (0 - 19): ");

                    try {
                        num1 = Integer.parseInt(sc.nextLine());
                }   catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                } while (num1 < 0 || num1 > 100);
                

                do {

                    System.out.println("Introduce el segundo numero de fila que desees (0 - 19): ");

                    try {
                        num2 = Integer.parseInt(sc.nextLine());
                }   catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                } while (num2 < 0 || num2 > 100);

                intercambiaFilas(matriz, num1, num2);

                break;

            case 2:
                int columna = 0;
                System.out.print("Introduce la posicion de la colunmna: ");

                if (columna < 0 && columna > 100) {
                    
                    System.out.println("Fuera de rango");
                }

            
                try {

                    columna = Integer.parseInt(sc.nextLine());
                    
                } catch (Exception e) {
                    System.out.println("Debes introducir una columna VALIDA");
                }

                //LLamamos a la función para sumar la columna
                System.out.println("La suma de la " + columna + " es: ");
                System.out.println(sumarColumna(matriz, columna));
            
                break;

            case 3:

                //Llamamos a la funcion de sumar diagonal principal para mostrar la suma
                System.out.println("La suma de la diagonal principal es: ");
                System.out.println(sumarDiagonalP(matriz));

                //Llamamos a la funcion de sumar diagonal inversa para mostrar la suma
                System.out.println("\nLa suma de la diagonal inversa es: ");
                System.out.println(sumarDiagonalI(matriz));
                break;

            case 4:
            
                System.out.println("El numero maximo de la matriz es: " + maximoMatriz(matriz));
                break;

            case 5:

                transpuesta(matriz);
            
                break;

            case 6:

               for (int i = 0; i < matriz.length; i++) {
                    Arrays.sort(matriz[i]);


               }

               System.out.println("MATRIZ ORDENADA");
               pintarMatriz(matriz);
            
                break;

            case 7:

                System.out.println("Adios");
            
                break;
        
            default:

                System.out.println("Opcion no valida");
                break;
        }
            
        } while (opcion != 7);
    



    }
    
}
