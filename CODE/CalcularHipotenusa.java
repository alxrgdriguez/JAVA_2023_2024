import java.util.Scanner;

public class CalcularHipotenusa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Definimos los catetos y la hipotenusa
        double cateto1, cateto2;
        double hipotenusa;

        System.out.println("Introduce el valor del cateto1: "); 
        cateto1 = sc.nextDouble();

        System.out.println("Introduce el valor del cateto2: "); 
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("El resultado de la hipotenusa es: " + hipotenusa);

    }
   
     

}
