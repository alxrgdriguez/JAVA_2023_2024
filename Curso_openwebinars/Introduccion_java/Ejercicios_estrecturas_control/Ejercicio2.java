package Curso_openwebinars.Introduccion_java.Ejercicios_estrecturas_control;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        /**
         * Realiza un programa en Java que, dado un día de la semana como un número entero, nos indique el día como texto. 
         * Haz dos versiones, una usando switch como expresión y otra como sentencia.
         */
        
        Scanner sc = new Scanner(System.in);
        int diaSemana = 0;
       
        System.out.print("Introduce el dia de la semana y te diré si es (Lunes, Martes, Miercoles, Jueves...): ");
        diaSemana = Integer.parseInt(sc.nextLine());

        
        switch (diaSemana) {
            case 1:
                
                System.out.println("Lunes");
                break;

             case 2:
                System.out.println("Martes");
                break;

             case 3:
                System.out.println("Miercoles");
                break;

             case 4:
                System.out.println("Jueves");
                break;

             case 5:
                System.out.println("Viernes");
                break;

             case 6:
                System.out.println("Sábado");   
                break;

             case 7:
                System.out.println("Domingo");   
                break;
        
            default:
                System.out.println("Error al introducir el día");
                break;
        }

        sc.close();
    }
    
}
