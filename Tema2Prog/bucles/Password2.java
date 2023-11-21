package bucles;
import java.util.Scanner;

public class Password2 {

    public static void main(String[] args) {
        
    //Pide una contraseña por teclado mientras su longitud sea menor que 10
    //Pintar contraseña

    String contrasenia = "";

    Scanner sc = new Scanner(System.in);

    while (contrasenia.length() <= 10 ){

        System.out.println("");
        System.out.println("Introduce una contraseña con más de 10 caráteres:  ");
        contrasenia = sc.nextLine();

        if (contrasenia.length() > 10){

            System.out.println("");
            System.out.println("Su contraseña se ha establecido correcta");

        }else {

            System.out.println("");
            System.out.println("Error al introducir la contraseña");
        }
    }




    }
    
}
