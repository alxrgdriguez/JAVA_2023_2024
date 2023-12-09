package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;

public class T1_Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /* Ejercicio 6 Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
        Por ejemplo: 1000 minutos son 16 horas y 40 minutos.*/

        int numeroMinutos;

        System.out.println("Introduce los minutos y te dire la hora");
        numeroMinutos = sc.nextInt();

        int calculoHoras = (numeroMinutos / 60);
        int calculoMinutos = (numeroMinutos % 60);
        
        
        System.out.println(numeroMinutos + " minutos" + " son " + calculoHoras + " horas y " + calculoMinutos + " minutos");

        sc.close();

    }
    
}
