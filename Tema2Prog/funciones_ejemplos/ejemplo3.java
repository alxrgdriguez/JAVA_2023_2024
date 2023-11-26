import java.util.Scanner;

public class ejemplo3 {

    //Funcion que diga que el segundo numero es multiplo del primer numero
    public static boolean calcularEsMultiplo(int n1, int n2){

        if (n1 % n2 == 0){

            return true;

        }else {

            return false;
        }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        boolean esMultiplo;

        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo: ");
        num2 = sc.nextInt();

        // Decir si num2 es multiplo de num1
        esMultiplo = calcularEsMultiplo(num1,num2);
        System.out.println("El numero " + num2 + " es multplo de " + num1 + " --> " + esMultiplo);

        // Decir si num1 es multiplo de num2
        esMultiplo = calcularEsMultiplo(num2,num1);
        System.out.println("El numero " + num1 + " es multplo de " + num2 + " --> " + esMultiplo);


        sc.close();

    }
    
}
