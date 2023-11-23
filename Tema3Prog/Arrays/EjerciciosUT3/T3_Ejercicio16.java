public class T3_Ejercicio16 {

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

   

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        

        /**
         *Ejercicio 16. Crea una matriz de 3x6 números enteros aleatorios no repetidos
         */

        int[][] matriz = new int[3][6];

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++){

                matriz[i][j] = numaleatorio(10, 50);

            }
        }
    
          // Elimina los números repetidos
          for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                for (int k = 0; k < matriz[i].length; k++) {

                    if (i != k && matriz[i][j] == matriz[k][j]) {

                        matriz[i][j] = numaleatorio(1, 100);
                    }
                }
            }
        }
        

    //Pintamos la matriz rellenada con numeros aleatorios
    System.out.println("\n-- MATRIZ --");
    pintarMatriz(matriz);

    }
    
}
