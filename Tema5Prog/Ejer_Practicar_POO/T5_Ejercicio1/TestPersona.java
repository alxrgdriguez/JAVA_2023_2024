package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio1;

import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {

        // Llamamos al Scanner
        Scanner sc = new Scanner(System.in);

        // Creamos instancia de Persona utilizando el constructor de Persona
        Persona persona1 = new Persona("Alejandro", 20, Persona.Sexo.M, "23811954Y", 60, 165);

        // Pedimos los datos del usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        persona1.setNombre(nombre);

        System.out.println("Ingrese su edad: ");
        try {
            int edad = Integer.parseInt(sc.nextLine());
            persona1.setEdad(edad);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido para la edad.");
            System.exit(0);
        }

        System.out.println("Ingrese su sexo (H/M/O): ");
        try {
            Persona.Sexo sexo = Persona.Sexo.valueOf(sc.nextLine().toUpperCase());
            persona1.setSexo(sexo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Ingrese un valor válido para el sexo (H/M/O).");
            System.exit(0);
        }

        System.out.println("Ingrese su DNI: ");
        String dni = sc.nextLine();
        persona1.setDni(dni);

        // Comprobamos si el DNI es correcto
        if (!persona1.comprobarDNI()) {
            System.out.println("DNI incorrecto");
            System.exit(0);
        }

        System.out.println("Ingrese su peso: ");
        try {
            double peso = Double.parseDouble(sc.nextLine());
            persona1.setPeso(peso);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido para el peso.");
            System.exit(0);
        }

        System.out.println("Ingrese su altura: ");
        try {
            double altura = Double.parseDouble(sc.nextLine());
            persona1.setAltura(altura);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido para la altura.");
            System.exit(0);
        }

        // Comprobamos si la persona es mayor de edad
        if (persona1.esMayorEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
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

        // Crear un nuevo objeto Persona cambiando todos los datos, excepto el DNI
        Persona persona2 = new Persona("Julio", 22, Persona.Sexo.M, "23811954Y", 60, 165);

        // Comprobar el método equals
        if (persona1.equals(persona2)) {
            System.out.println("\nLos objetos tienen el mismo DNI");
        } else {
            System.out.println("\nLos objetos tienen diferentes DNIs ");
        }

    }

}