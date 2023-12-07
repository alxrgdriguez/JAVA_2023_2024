package Tema1Prog.ejemplos_T1;
import java.util.Scanner; //Importar la clase para poder usarla

public class EjemploScanner {

    public static void main(String[] args) {

        int edad;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        //Leer entero por teclado
        edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad);

    }
    
}
