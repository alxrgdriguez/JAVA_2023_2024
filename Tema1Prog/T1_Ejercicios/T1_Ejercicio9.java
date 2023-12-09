package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;

public class T1_Ejercicio9{

public static void main(String[] args) {
    
        /*Ejercicio 9
        Pide al usuario dos pares de números (x1,y2) y (x2,y2), que representen dos puntos en el
        plano. Calcula y muestra la distancia entre ellos*/

        // Inicio de programa y declaracion de varibles

        double x1, x2, y1, y2, distancia;

        //Pedimos los catetos por teclado

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el cateto 'x1': ");
        x1 = sc.nextDouble();
        System.out.println("Introduce el cateto 'x2': ");
        x2 = sc.nextDouble();
        System.out.println("Introduce el cateto 'y1': ");
        y1 = sc.nextDouble();
        System.out.println("Introduce el cateto 'y2': ");
        y2 = sc.nextDouble();

        // Realizamos Cálculos 

        distancia = Math.sqrt (Math.pow ((x2-x1),2) + Math.pow ((y2-y1),2));

        // Mostramos en pantalla
        System.out.println("La distancia entre ambos puntos es " + distancia);

        sc.close();

    }
    



}