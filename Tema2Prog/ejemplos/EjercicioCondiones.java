package ejemplos;
import java.util.Scanner;

class EjercicioCondiciones{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        
        //Declaramos las variables de usuario y contraseña

        String user, contrasenia;

        //Pedir que ingrese el nombre de usuario
        System.out.println("Introduce el nombre de usuario: " );
        user = sc.nextLine();

        //Pedir que ingrese la contraseña
        System.out.println("Introduce la contraseña: ");
        contrasenia = sc.nextLine();

        if (user .equals("pepe") && contrasenia .equals("12345678")){

            System.out.println("Has entrado al sistema");

        } else  {

            System.out.println("Usuario y contraseña incorrecto");

        }

    

        }
        




    }








