package Tema0Prog.T0_Ejercicios;

import java.util.Random;

public class T0_Ejercicio14 {

    public static void main(String[] args) {
        
        //14. Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado. 

        Random alea = new Random();
        int numero = alea.nextInt(6) + 1; //1-6 (si no se pone +1, es de 0-5)
        System.out.println("El numero de tu dado es: " + numero);

        //Otra manera de hacerlo
        /*int numeroAleatorio = (int)(Math.random()*6+1);
        System.out.println("El número aleatorio entre 1 y 6 es: " + numeroAleatorio);*/

    }
    
}
