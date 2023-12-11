package Ejercicios_antes_Examen;

public class Damas {
    
    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(String matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int moverPieza(int i, int j, char direccion, String tablero[][]) {

        //Comprobar que i y j están en el tablero
        if (! ( (i >= 0 && i <= 7) && (j >=0 && j <= 7))) {
            System.out.println("Pieza errónea");
            return -1;
        } 

        //Comprobar que en esa posición hay una pieza
        if ( tablero[i][j] == "-") {
            System.out.println("Ahí no hay ninguna pieza");
            return -1;
        }

        if (tablero[i][j].equals("B")) {
            //Mover a la derecha blancas
            //Restar 1 a i, sumar 1 a j
            //i >= 0, j <= 7, tablero[i][j] = "-"
            if ( i-1 >= 0 && i-1 <= 7 && j+1 >=0 && j+1 <= 7 && tablero[i-1][j+1] == "-" && direccion == 'd') {
                tablero[i][j] = "-";
                tablero[i-1][j+1] = "B";
                return 0;
            }

            //Mover a la izquierda blancas
            //Restar 1 a i, restar 1 a j
            //i >= 0, j <= 7, tablero[i][j] = "-"           
            if ( i-1 >= 0 && i-1 <= 7 && j-1 >= 0 && j-1 <= 7 && tablero[i-1][j-1] == "-" && direccion == 'i') {
                tablero[i][j] = "-";
                tablero[i-1][j-1] = "B";
                return 0;
            }

            return -1;

        } else if (tablero[i][j].equals("N")) {
            //Mover a la derecha negras
            //Sumar 1 a i, sumar 1 a j
            //i >= 0 y i <= 7, j>=0 y j <= 7, tablero[i][j] = "-"
            if ( i+1 >= 0 && i+1 <= 7 && j+1 >= 0 && j+1 <= 7 && tablero[i+1][j+1] == "-" && direccion == 'd') {
                tablero[i][j] = "-";
                tablero[i+1][j+1] = "B";
                return 0;
            }

            //Mover a la izquierda negras
            //Sumar 1 a i, restar 1 a j
            //i >= 0, j <= 7, tablero[i][j] = "-"
            if ( i+1 >= 0 && i+1 <=7 && j-1 >= 0 && j-1 <= 7 && tablero[i+1][j-1] == "-" && direccion == 'i') {
                tablero[i][j] = "-";
                tablero[i+1][j-1] = "B";
                return 0;
            }            

            return -1;
        }

        return 0;
    }

    public static void main(String[] args) {
        
        String tablero[][] = new String[8][8];

        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {

                //Pintar blancas
                if ((i == 5 || i == 7) && (j % 2 == 0)) {
                    tablero[i][j] = "B";
                } else if (i == 6 && (j % 2 != 0)) {
                    tablero[i][j] = "B";
                } else if ((i == 0 || i == 2) && (j % 2 != 0)) {
                    tablero[i][j] = "N";
                } else if (i == 1 && (j % 2 == 0)) {
                    tablero[i][j] = "N";
                } else {

                    //Pintar huecos
                    tablero[i][j] = "-";
                }
            }
        }

        //Pintar tablero
        pintarMatriz(tablero);

        System.out.println(moverPieza(5, 2, 'd', tablero));

        pintarMatriz(tablero);


    }
}