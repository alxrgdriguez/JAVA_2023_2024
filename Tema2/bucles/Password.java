package bucles;
import java.util.Scanner;

public class Password {

    //Pide una contraseña por teclado mientras su longitud sea menor que 10
    //Pintar contraseña

    public static void main(String[] args) {
        
        String Password = "";

        Scanner sc = new Scanner(System.in);
        
        

        while (Password.length() <= 10){

            System.out.println("Introduzca su contraseña con más de 10 caráteres: ");
            Password = sc.nextLine();

            if (Password.length() > 10){

                System.out.println("");
                System.out.println("Tu password es correcto");
            
        
            }

                
            
        }

        
        sc.close();


    }
    
}
