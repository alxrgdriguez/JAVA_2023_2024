package Juegos_clase;

import java.util.Scanner;

public class EjericioCalificacion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double CaliParcial1EV, CaliParcial2EV, CaliParcial3EV, CaliExFinal, CaliTrabajoFinal, notafinal;

        System.out.println("Introduce la nota del Parcial de la primera evaluación: ");
        CaliParcial1EV = sc.nextDouble();

        System.out.println("Introduce la nota del Parcial de la segunda evaluación: ");
        CaliParcial2EV = sc.nextDouble();

        System.out.println("Introduce la nota del Parcial de la tercera evaluación");
        CaliParcial3EV = sc.nextDouble();

        System.out.println("Ahora la calificación del examen final: ");
        CaliExFinal = sc.nextDouble();

        System.out.println("Y por último la del trabajo final");
        CaliTrabajoFinal = sc.nextDouble();

        notafinal = ((CaliParcial1EV + CaliParcial2EV + CaliParcial3EV) / 3 * 0.55) + (CaliExFinal * 0.30) + (CaliTrabajoFinal * 0.15);

        System.out.println("Tu nota final es: " + notafinal);



    }
    
}
