package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio1;

import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {

        //LLamamos al Scanner
        Scanner sc = new Scanner(System.in);

        //Creamos la primera Persona
        Persona persona1 = new Persona();

        //Pedimos los datos del usuario
        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(sc.nextLine());

        System.out.println("Ingrese su edad: ");
        persona1.setEdad(Integer.parseInt(sc.nextLine()));

        /*System.out.println("Ingrese su sexo: ");
        persona1.setSexo(sc.nextLine()));*/

        System.out.println("Ingrese su DNI: ");
        persona1.setDni(sc.nextLine());

        System.out.println("Ingrese su peso: ");
        persona1.setPeso(Double.parseDouble(sc.nextLine()));

        System.out.println("Ingrese su altura: ");
        persona1.setAltura(Double.parseDouble(sc.nextLine()));



    }
}
