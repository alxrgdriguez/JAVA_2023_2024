package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;

public class T1_Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 2. Calcular el perímetro y área de un rectángulo dada su base y su altura.

        double area, perimetro, base, altura;

        System.out.println();
        System.out.println("Calculamos el área y perímetro de un rectangulo");
        System.out.println("");

        System.out.println("Introduce la base del rectángulo: ");
        base = sc.nextDouble();

        System.out.println("Introduce la altura del rectángulo: ");
        altura = sc.nextDouble();

        //DEFINIMOS EL ÁREA QUE ES ÁREA = BASE * ALTURA

        area = (base * altura);

        //DEFINIMOS EL PERÍMETRO QUE ES 2 * BASE + ALTURA

        perimetro = 2 * (base + altura);

        System.out.println("El área del rectángulo con los datos establecidos es: " + area);
        System.out.println("El perímetro del rectángulo con los datos establecidos es: " + perimetro);

        sc.close();

    }
}
