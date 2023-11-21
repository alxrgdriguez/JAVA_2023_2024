package ejemplos;
import java.util.Scanner;

public class EstacionesAnio {

    public static void main(String[] args) {
        

        int mesAnio;


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre el (1-12) y te diré estación del año: ");
        mesAnio = sc.nextInt();


        switch (mesAnio) {
            case 12,1,2:
                
                System.out.println("La estación es Invierno");

                break;

            case 3,4,5:
                
                System.out.println("La estación es Pimavera");
        
                break;
            
            case 6,7,8:
                
                System.out.println("La estación es Verano");
        
                break;

            case 9,10,11:
                
                System.out.println("La estación es Otoño");
        
                break;

            default:

                System.out.println("Error");

                break;
        }



    }
    
}
