package ejemplos;
import java.util.Scanner;

public class PideDosNumeros {
    public static void main(String[] args) {

        //Declaramos las variables

        double num1, num2, division;

        //Pedimos los numeros por teclado

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: " );
        num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextDouble();

        if (num2 == 0){

            System.out.println("No se puede hacer la división");

        }else{

            division = (num1 / num2);
            System.out.println("La división de " + num1 + " y " + num2  + " es: " + division);
        }
        
    }
    
 

}
