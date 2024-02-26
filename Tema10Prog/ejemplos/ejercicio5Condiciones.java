package ejemplos;
import java.util.Scanner;

public class ejercicio5Condiciones {

    public static void main(String[] args) {
        
        //Declaramos las variables

        int edad;

        //Llamamos por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();

        //Comprobamos las edades

        if (edad >= 1 && edad <= 5 ){

            System.out.println("Niño");

        }else if (edad >= 6 && edad <=12){

            System.out.println("Chaval");

        }else if (edad >= 13 && edad <= 18){

            System.out.println("Adolescente");

        }else if (edad >= 19 && edad <= 25){

            System.out.println("LoMejor");

        }else if (edad >= 26 && edad <= 45){

            System.out.println("Hombre");

        }else if (edad >= 46 && edad <= 65){

            System.out.println("Carroza");

        }else if (edad > 65){

            System.out.println("Viejo");

        }
        



    }
    
}
