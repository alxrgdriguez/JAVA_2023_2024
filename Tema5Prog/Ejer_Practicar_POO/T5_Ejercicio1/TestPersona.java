package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio1;

import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {

        // Llamamos al Scanner
        Scanner sc = new Scanner(System.in);

        // Creamos instancia de Persona utilizando el constructor de Persona
        Persona persona1 = new Persona();

        System.out.println("Introduce su nombre: ");
        persona1.setNombre(sc.nextLine());

        System.out.println("Introduce su edad: ");
        persona1.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Introduce su sexo M/H/0: ");
        persona1.setSexo(Persona.Sexo.valueOf(sc.nextLine()));

        System.out.println("Introduce su DNI: ");
        String dni = sc.nextLine();
        System.out.println(dni.length());
        if (persona1.comprobarDNI(dni)) {
            persona1.setDni(dni);
            System.out.println("Su DNI es correcto.");
        } else {
            System.out.println("Su DNI es incorrecto.");
           System.exit(1);

        }

        System.out.println("Introduce su peso: ");
        persona1.setPeso(Double.parseDouble(sc.nextLine()));

        System.out.println("Introduce su altura: ");
        persona1.setAltura(Integer.parseInt(sc.nextLine()));

        //Mostrar la información del objeto
        System.out.println(persona1.toString());

        //Indicamos si la persona es mayor de edad

        if (persona1.esMayorEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }

        // Indicamos su peso
        int resultadoIMC = persona1.calcularIMC();

        if (resultadoIMC == 1) {
            System.out.println("La persona está en su peso ideal.");
        } else if (resultadoIMC == 0) {
            System.out.println("La persona está por debajo de su peso ideal.");
        } else {
            System.out.println("La persona tiene sobrepeso.");
        }

        //Creamos un nuevo objeto
        Persona persona2 = new Persona(persona1);

        //Comprobar si las personas1 y personas2 son iguales

        if (persona1.equals(persona2)) {
            System.out.println("Las personas son iguales.");
        } else {
            System.out.println("Las personas no son iguales.");
        }


    }

}