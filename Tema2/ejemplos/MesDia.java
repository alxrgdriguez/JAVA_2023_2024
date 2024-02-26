package ejemplos;
import java.util.Scanner;



public class MesDia {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int mes, diames;

    //Pedir datos al usuario

    System.out.println("Introduce el mes: ");
    mes = sc.nextInt();

    System.out.println("Introduce el dia del mes: ");
    diames = sc.nextInt();

    switch (mes) {
        case 1,3,5,7,8,10,12:

            if (diames >= 31 && diames <=31){

                System.out.println("Fecha Correcta");

            }else{

                System.out.println("Fecha incorrecta");
            }
            
            break;

        case 4,6,9,11:

            if (diames >= 1 && diames <= 30){

                System.out.println("Fecha correcta");

            }else{

                System.out.println("Fecha incorrecta");
            }     

            break;
    
        default:

            System.out.println("Error");            

            break;
    }
    
    
    
    
    sc.close();


    }
    
}
