package Practica_2TR_Ejercicios.Practicar_Ahorcado;

import java.util.Scanner;

public class TestAhorcado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ahorcado juego = new Ahorcado();
        int opcion = 0;

        //Mostramos cuantas palabras tiene nuestro ahorcado
        System.out.println("----- LETRAS QUE TIENE LA PALABRA -----");
        System.out.println("La palabra elegida tiene " + juego.getPalabraAdivinar().length() + "letras");



    }
}
