package Tema3Prog.Arrays.EjerciciosArrays;
import java.util.Scanner;

public class EjercicioEjemploArray {

    public static void main(String[] args) {
        
        /*En una empresa hay 10 trabajadores pide por teclado el salario
         * de cada uno y guardalos en un array, muestra todos los salrios
         * y dime el salario medio de tus trabajadores
         */

        Scanner sc = new Scanner(System.in);

         int salarios[] = new int [10];
         int acumulador = 0;

        try {

            for(int i = 0; i< salarios.length; i++){

                System.out.println("Introduce el salario del trabajador: ");
                salarios[i] = Integer.parseInt(sc.nextLine());

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Debes introducir un salario");
        }
         

        for (int i = 0; i < salarios.length; i++){

            acumulador += salarios[i];
            //Mostrar la suma de los salarios
            System.out.println("El trabajador " + (i+1) + " tiene un salario de " + salarios[i] + "€");
            System.out.println();

        }

        //Media de los salarios
        System.out.println("La media es de " + acumulador / salarios.length + "€");

        sc.close();
    }
    
}
