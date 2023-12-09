package Tema3Prog.Cadenas.ejemplos;

public class Comparacion {
    
    public static void main(String[] args) {
        
        String nombre = "Zavier";
        String nombre2 = "Savier";

        if (nombre == nombre2) {
            System.out.println("Son iguales");
        }

        System.out.println( nombre.compareTo(nombre2) );
    }
}