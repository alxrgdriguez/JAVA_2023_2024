package ejemplos;
import java.net.Socket;
import java.util.Scanner;


public class EjercicioSwitch {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    //Declaramos variables

    int numero;

    //Pedimos al usuario que nos escriba el numero

    System.out.println("Introduce un numero de ente (1-5): ");
    numero = sc.nextInt();

    if (numero == 1){

        System.out.println("Iniciado");

    }else if (numero == 2){

        System.out.println("Amateur");

    }else if (numero == 3){

        System.out.println("Profesional");

    }else if (numero == 4){

        System.out.println("Experto");

    }else if (numero == 5){

        System.out.println("Nivel Dios");


    }else {

        System.out.println("Valor incorrecto (IF)");

    }

    switch (numero) {

        case 1:

            System.out.println("Iniciado");

        break;
        
        case 2:

            System.out.println("Amateur");

        break;

        case 3:

            System.out.println("Profesional");

        break;

        case 4:

            System.out.println("Experto");

        break;

        case 5:

            System.out.println("Nivel Dios");

        break;

        default:

            System.out.println("");
            System.out.println("Valor Incorrecto (Switch)");

        }

    }
   
}
