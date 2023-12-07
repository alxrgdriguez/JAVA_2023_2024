package Ejercicios_antes_Examen;

public class laberinto {

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

         


    }
    
}
