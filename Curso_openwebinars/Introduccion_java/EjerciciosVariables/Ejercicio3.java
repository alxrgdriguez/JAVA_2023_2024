package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        /**
         * Escribir un programa que calcule el área y el perímetro de un 
         * rectángulo y la muestre por consola. La `altura` y la `anchura` 
         * del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
         */


        Scanner sc = new Scanner(System.in);

        double B = 0 ;
        double A = 0 ;
        double perimetro ;
        double area ;

          try {
            System.out.println("Introduce la altura del rectángulo: ");
            A = Double.parseDouble(sc.nextLine());

            System.out.println("Introduce la base del rectángulo: ");
            B = Double.parseDouble(sc.nextLine());

            perimetro = (2*A + 2*B);
            System.out.println("El perimetro es: " + perimetro + " cm");

            area = B * A;
            System.out.println("La base del rectángulo es: " + area + " cm" );

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error al introducir la base y la altura");
        }

        
        sc.close();
    }
    
}
