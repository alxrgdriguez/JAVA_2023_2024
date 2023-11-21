package bucles;
import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        
        //2. Pide una base y un exponente y muestra la potencia, sin usar match.pow

        Scanner sc = new Scanner(System.in);

        double base, exponente, EsPotencia = 1;
      

        System.out.println("Introduce la base");
        base = sc.nextDouble();

        System.out.println("Introduce el exponente de la potencia: ");
        exponente = sc.nextDouble();

        
        for (int i = 0; i < exponente; i++ ){

            EsPotencia = EsPotencia * base;
        }

        System.out.println(EsPotencia);






    }
    
}
