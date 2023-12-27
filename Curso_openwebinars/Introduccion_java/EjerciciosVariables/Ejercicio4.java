package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        /**
         * Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. 
         * El `radio` del mismo lo puedes proporcionar 
         * como un valor inicial de la variable correspondiente.
         */

        double radio = 12.5;
        double perimetro;
        double area;

        //Calculamos perimetro

        perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro es: " + Math.round(perimetro));

        //Calculamos area
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es: " + Math.round(area));



    }
    
}
