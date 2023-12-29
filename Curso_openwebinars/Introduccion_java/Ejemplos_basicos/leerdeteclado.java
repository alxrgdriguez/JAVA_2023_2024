package Curso_openwebinars.Introduccion_java.Ejemplos_basicos;

import java.util.Locale;
import java.util.Scanner;

public class leerdeteclado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base = 0;
        double altura = 0;

        System.out.println("Introduce la base: ");
        base = Double.parseDouble(sc.nextLine());

        System.out.println("Introduce la altura: ");
        altura = Double.parseDouble(sc.nextLine());

        System.out.println("El area del rectangulo es " + (base * altura));

        sc.close();


    }
    
}
