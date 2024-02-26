package ejemplos;
import java.util.Scanner;

public class CosteAlumnos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num_Alumnos, Coste_Total;

        System.out.println("Ingrese el numero de alumnos: ");
        num_Alumnos = sc.nextInt();

        //Comprobar cada caso

        if (num_Alumnos >= 50){

            Coste_Total = (num_Alumnos * 65);

        }else if (num_Alumnos >=50 && num_Alumnos <=99){

            Coste_Total = (num_Alumnos * 70);
        }
        




    }
    



    
}
