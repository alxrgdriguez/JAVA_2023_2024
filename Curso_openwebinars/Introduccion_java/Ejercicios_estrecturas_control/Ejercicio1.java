package Curso_openwebinars.Introduccion_java.Ejercicios_estrecturas_control;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        

        /**
         * Implementa un programa en Java que dada una fecha, nos indique cuál 
         * s la estación del año (en el hemisferio que tú quieras, aunque la solución se dará del hemisferio norte). 
         * El día del mes, y el mes del año se deben introducir como números enteros a través del teclado
         */

        Scanner sc = new Scanner(System.in);

        int diaMes = 0;
        int mes = 0;
        String estacion_anio = "";

        System.out.print("Introduce el dia del mes (1-30): ");
        diaMes = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el mes del año (1-12): ");
        mes = Integer.parseInt(sc.nextLine());

        if (mes == 1 || mes == 2  || (mes == 3 && diaMes <= 20) || (mes == 12 && diaMes >= 21)) {

            estacion_anio = "Invierno";

        }else if (mes == 4 || mes == 5 || (mes == 3 && diaMes >= 20) || (mes == 6 && diaMes < 21)) {
            
            estacion_anio = "Primavera";

        } else if (mes == 7 || mes == 8 || (mes == 6 && diaMes >= 21) || (mes == 9 && diaMes < 21)) {

            estacion_anio = "Verano";

        } else if (mes == 10 || mes == 11 || (mes == 9 && diaMes >= 21) || (mes == 12 && diaMes < 21)) {

            estacion_anio = "Otoño";
        
        }

        System.out.println("La estación del año de la fecha " + diaMes + "/" + mes + " es: " + estacion_anio );

        sc.close();
    }
    
}
