package Ejercicios_antes_Examen;
import java.util.Arrays;
import java.util.Scanner;

/**
 * EjercicioCubitusHumerus1
 */
public class EjercicioCubitusHumerus1 {

    public static int numaleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int calcularPuntuacion(int... dados) {
        // Ordenar los dados
        Arrays.sort(dados);

        // Calcular la puntuación sin contar el mínimo y máximo
        int puntuacion = 0;
        for (int i = 1; i < 4; i++) {
            puntuacion += dados[i];
        }

        return puntuacion;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numTurnos = 0;
        int tiradaJ1_1 = 0, tiradaJ1_2 = 0, tiradaJ1_3 = 0, tiradaJ1_4 = 0, tiradaJ1_5 = 0;
        int tiradaJ2_1 = 0, tiradaJ2_2 = 0, tiradaJ2_3 = 0, tiradaJ2_4 = 0, tiradaJ2_5 = 0;

        System.out.println("Introduce el numero de turnos que deseas jugar: ");
        numTurnos = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numTurnos; i++) {

            System.out.println("\n--------");
            System.out.println("Turno " + i);
            System.out.println("--------");
            System.out.println();

            // Tiradas del jugador 1 Cubitus

            tiradaJ1_1 = numaleatorio(1, 6);
            tiradaJ1_2 = numaleatorio(1, 6);
            tiradaJ1_3 = numaleatorio(1, 6);
            tiradaJ1_4 = numaleatorio(1, 6);
            tiradaJ1_5 = numaleatorio(1, 6);
            System.out.println("Tiradas Cubitus " + " | " + tiradaJ1_1 + " | " + tiradaJ1_2 + " | " + tiradaJ1_3 + " | "
            + tiradaJ1_4 + " | " + tiradaJ1_5 + " |");

            // Tiradas del jugador 2 Humerus

            tiradaJ2_1 = numaleatorio(1, 6);
            tiradaJ2_2 = numaleatorio(1, 6);
            tiradaJ2_3 = numaleatorio(1, 6);
            tiradaJ2_4 = numaleatorio(1, 6);
            tiradaJ2_5 = numaleatorio(1, 6);
            System.out.println("Tiradas Humerus " + " | " + tiradaJ2_1 + " | " + tiradaJ2_2 + " | " + tiradaJ2_3 + " | "
            + tiradaJ2_4 + " | " + tiradaJ2_5 + " |");

            // Calcular la puntuación y determinar al ganador
            int puntuacionJ1 = calcularPuntuacion(tiradaJ1_1, tiradaJ1_2, tiradaJ1_3, tiradaJ1_4, tiradaJ1_5);
            int puntuacionJ2 = calcularPuntuacion(tiradaJ2_1, tiradaJ2_2, tiradaJ2_3, tiradaJ2_4, tiradaJ2_5);

            System.out.println("Puntuación Cubitus: " + puntuacionJ1);
            System.out.println("Puntuación Humerus: " + puntuacionJ2);

            if (puntuacionJ1 > puntuacionJ2) {
                System.out.println("¡Cubitus gana el turno!");
            } else if (puntuacionJ1 < puntuacionJ2) {
                System.out.println("¡Humerus gana el turno!");
            } else {
                System.out.println("¡Empate!");
            }
        }

        sc.close();
    }

}
