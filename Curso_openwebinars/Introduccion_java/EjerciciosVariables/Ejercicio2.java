package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        /**
         * Realiza un programa en Java que calcule la nota media de un alumno en la asignatura de Programación. 
         * La nota media se calcula como el promedio de las 3 notas trimestrales. Muestra la nota promedio redondeada 
         * y además, muestra un mensaje 
         * que indique si el alumno está APROBADO (nota final >= 5) o suspenso (nota final < 5).
         */

        Scanner sc = new Scanner(System.in);

        double nota1Tri = 0;
        double nota2Tri = 0;
        double nota3Tri = 0;

        System.out.print("Introduce la nota del primer trimestre: ");
        nota1Tri = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce la nota del segundo trimestre: ");
        nota2Tri = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce la nota del tercer trimestre: ");
        nota3Tri = Double.parseDouble(sc.nextLine());

        double nota = (nota1Tri + nota2Tri + nota3Tri) / 3;

        System.out.println(nota);
        System.out.println("La nota final es: " + Math.round(nota)); //Math.round redondea el numero al más cercano

        String esAprobado = (nota >= 5) ? "APROBADO" : "SUSPENSO";
        System.out.println(esAprobado);

        sc.close();

    }
    
}
