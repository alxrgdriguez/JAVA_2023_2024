package ejemplos;
import java.util.Scanner;

public class AnioVisiesto {


    public static void main(String[] args) {

        //Declarar variables

        int anio;

        //Pedir año por pantalla

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce un año y te diré si es bisiesto o no: ");
        anio = sc.nextInt();

        //Ver si es bisiesto o no

        if (anio % 4 == 0 &&  (anio % 100 != 0 || anio % 400 == 0) ){

            System.out.println("El año " + anio +  " es bisiesto");

        }else{

            System.out.println("El año " + anio + " no es bisiesto");
        }
    
        
    }
    
}
