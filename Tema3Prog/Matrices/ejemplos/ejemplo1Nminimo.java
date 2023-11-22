package Tema3Prog.Matrices.ejemplos;

public class ejemplo1Nminimo {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

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

    public static int minimoMatriz(int matriz[][]){

        int minimo = Integer.MAX_VALUE;

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[0].length; j++){

                //Decimos cual es el minimo

                if(matriz[i][j] < minimo){

                    minimo = matriz[i][j];

                }

            }

        }

        return minimo;
    }


    public static void main(String[] args) {
        
        int tabla[][] = new int[4][6];

        for(int i = 0; i < tabla.length; i++){ //FILAS

            for(int j = 0; j < tabla[0].length; j++){ //COLUMNAS

                tabla[i][j] = numaleatorio(20, 100);

            }

        }

         //Mostramos la tabla con la función
            pintarMatriz(tabla);
          
            //Indicamos cual es el minimo de la tabla generada
            System.out.println(minimoMatriz(tabla));


            


    }
    
}
