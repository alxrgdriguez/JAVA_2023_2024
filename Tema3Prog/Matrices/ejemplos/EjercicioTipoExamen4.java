package Tema3Prog.Matrices.ejemplos;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioTipoExamen4 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static int sumarFila(int[][] matriz, int fila){

        int resultado = 0;

        for(int j = 0; j < matriz[fila].length; j++){

            resultado += matriz[fila][j];
        }

        return resultado;

    }


    public static int sumarColumna(int[][] matriz, int columna){

        int resultado = 0;

        for(int i = 0; i < matriz[0].length; i++){

            resultado += matriz[i][columna];
        }

        return resultado;

    }

    public static int sumarDiagonalP(int[][] matriz){

        int resultado = 0;

        for(int i = 0; i < matriz.length; i++){
            resultado += matriz[i][i];

        }

        return resultado;

    }

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int[][] matriz) {
        for(int i=0; i<matriz.length; i++) {
            
            for(int j=0; j<matriz[0].length; j++) {
                if(matriz[i][j] <= 9){
                    System.out.print("0" + matriz[i][j] + " ");
                }else{
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static double mediaArray(int[][] matriz){

        double media = 0;
        int contador = 0;

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++){

                media += matriz[i][j];
                contador++;

            }
        }

        media /= contador;

        return media;


    }

    public static void main(String[] args) {
        
        /**
         * 4. Crear una matriz de 5x5 elementos int aleatorios entre 1 y 20
        Opciones de menú:
            - 1. Suma una fila que se pedirá al usuario
            - 2. Suma una columna que se pedirá al usuario
            - 3. Suma la diagonal principal
            - 4. Devuelve la media de todos los valores de la matriz
            - 5. Salir
         */

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int[][] numeros = new int[5][5];

        for(int i = 0; i < numeros.length; i++){

            for(int j = 0; j < numeros[0].length;j++){

                numeros[i][j] = numaleatorio(1, 20);
            }

        }
        
        pintarMatriz(numeros);

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Suma una fila que se pedirá al usuario");
            System.out.println("2. Suma una columna que se pedirá al usuario");
            System.out.println("3. Suma la diagonal principal");
            System.out.println("4. Devuelve la media de todos los valores de la matriz");
            System.out.println("5. Salir");

            try {
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                
                System.out.println(e.getMessage());
                System.out.print("Debes introducir un numero");
            } 

            switch (opcion) {
                case 0:
                    System.out.println("La opción no puede ser 0");
                    break;

                case 1:
                    int fila = numeros.length-1;
                    int opcion2 = -1;
                    do {
                        try {

                            System.out.print("Introduce un numero de fila a sumar entre (0-" + fila + "): ");
                            opcion2 = Integer.parseInt(sc.nextLine());

                        } catch (Exception e) {

                            System.out.println(e.getMessage());
                            System.out.println("Debes introducir un numero de fila");

                        }
                    } while (opcion2 < 0 || opcion2 > fila);
                  
                    System.out.println(sumarFila(numeros, opcion2));

                    break;

                case 2:
                    int columna = numeros.length-1;
                    int opcion3 = -1;

                    System.out.print("Introduce un numero de columna a sumar entre (0-" + columna + "): ");
                    opcion3 = Integer.parseInt(sc.nextLine());

                    System.out.println(sumarColumna(numeros, opcion3));;

                    break;

                case 3:
                   
                    System.out.println(sumarDiagonalP(numeros));
                    break;

                case 4:
                    
                    System.out.println(mediaArray(numeros));
                    break;

                case 5:
                    System.out.println("Adios");
                    break;
            
                default:

                    System.out.println("Opción no valida");
                    break;
            }
            

        } while (opcion !=5);
            
    }


}
    

