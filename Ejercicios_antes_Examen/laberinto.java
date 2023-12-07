package Ejercicios_antes_Examen;


public class laberinto {

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(char[][] matriz) {
        for(char i=0; i<matriz.length; i++) {
            
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

    // Inicializar el laberinto
    public static void inicializarLaberinto(char[][] laberinto) {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                // Rellenar con "."
                laberinto[i][j] = '.';

                // Rellenar los bordes
                if (i == 0 || i == laberinto.length - 1) {
                    laberinto[i][j] = '-';
                }

                if (j == 0 || j == laberinto[i].length - 1) {
                    laberinto[i][j] = '|';
                }
            }
        }
    }

    public static void generarBomba(char[][] laberinto) {
        int fila, columna;
        do {
            fila = numaleatorio(1, 18);
            columna = numaleatorio(1, 18);
        } while (laberinto[fila][columna] == '#' || laberinto[fila][columna] == '@');

        laberinto[fila][columna] = 'B'; // Marcar la bomba
    }

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    //Generar salida de manera aleatoria

    public static void generarsalida(char[][] laberinto){

        for (int i = 0; i < laberinto.length; i++) {

            for (int j = 0; j < laberinto[i].length; j++) {

                int salidaBorde = numaleatorio(0, 3); // 0: superior, 1: derecho, 2: inferior, 3: izquierdo

        switch (salidaBorde) {
            case 0:
                laberinto[0][numaleatorio(1, 18)] = '#'; // Salida en borde superior
                break;
            case 1:
                laberinto[numaleatorio(1, 18)][19] = '#'; // Salida en borde derecho
                break;
            case 2:
                laberinto[19][numaleatorio(1, 18)] = '#'; // Salida en borde inferior
                break;
            case 3:
                laberinto[numaleatorio(1, 18)][0] = '#'; // Salida en borde izquierdo
                break;
                }
            }
                
        }
            
    }

    
    public static void main(String[] args) {
        
        /**
         * LABERINTO. En este ejercicio vamos a implementar un juego de un laberinto.
        Para ello nos crearemos una matriz de 20 x 20 caracteres.
        La matriz será un eje de coordenadas donde la esquina superior izquierda será el inicio del
        laberinto y deberás llegar a la salida. Las casillas válidas irán de (0,0) a (19,19).
        Antes de jugar debes hacer lo siguiente:
        - Deberás rellenar la matriz inicialmente con el carácter “.”.
        - Los bordes superior e inferior los vas a rellenar con el carácter “-“.
        - Los bordes derecho e izquierdo los vas a rellenar con el carácter “|”.
        - Generar la salida del laberinto aleatoriamente. La salida debe estar en un borde y no
        debe coincidir con el inicio (0,0). Debes generar aleatoriamente esa casilla y marcarla
        con el carácter “#”.
        - Genera una bomba, será una casilla aleatoria del tablero interior, no de los bordes. Ahí
        habrá una bomba oculta, solo se sabrá por sus coordenadas, si pasas por esa
        coordenada sin saberlo explotará y perderás.

        Jugar:
        - El jugador aparece pintado con una “@” en la casilla (0,0).
        - Implementa una función pintar que pinte el tablero tras cada movimiento.
        - Te aparecerá un menú con cuatro opciones: 1 (derecha), 2 (izquierda), 3 (abajo), 4
        (derecha).
        - Deberás mover la “@” una posición según la tecla pulsada.
        - Si te sales de la matriz moviéndote habrás perdido el juego y este finalizará. Esto es lo
        más complicado del juego, pues dependiendo de dónde te encuentres un movimiento
        concreto podrá hacerte salir del tablero y debes comprobar todas las opciones
        posibles. Truco: si usas control de excepciones (IndexOutOfBoundException) no
        tendrías que comprobar con un if, sino que si sale esa excepción es que he intentado
        salir del tablero y el juego termina.
        - Si consigues llegar al carácter marcado con “#” habrás ganado. Muestra un mensaje
        indicándolo y también indica el número de pasos que has dado desde el inicio hasta
        encontrar la salida.
         */

        char [][] laberinto = new char[20][20];

        // Inicializar el laberinto
        inicializarLaberinto(laberinto);

         //Pintar Laverinto

        pintarMatriz(laberinto);

        // Generar salida y bomba
        generarsalida(laberinto);
         //Pintar Laverinto

        pintarMatriz(laberinto);
        generarBomba(laberinto);

       
            
        
        
    }


}
    

