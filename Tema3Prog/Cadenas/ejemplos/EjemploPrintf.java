package Tema3Prog.Cadenas.ejemplos;

public class EjemploPrintf {
    
    public static void main(String[] args) {
        
        int edad = 33;
        String nombre = "Pepe";
        double salario = 1950.0;

        int edad2 = 35;
        String nombre2 = "Angela";
        double salario2 = 2250.0;

        System.out.printf("Edad: %d - Nombre: %-10s - Salario: %6.2f", edad, nombre, salario);
        System.out.println();
        System.out.printf("Edad: %d - Nombre: %-10s - Salario: %6.2f", edad2, nombre2, salario2);
    }
}