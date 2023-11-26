import java.util.Scanner;

class ejemplo1{

    public static double suma(double numero1, double numero2, double numero3){

       double sumar = numero1 + numero2 + numero3;
       return sumar;


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /*Crea una funcion llamada suma, que reciba tres numeros double, y devulva la suma de los tres numeros  */

        double numero1 = 30, numero2 = 20, numero3 = 40;
        System.out.println(suma(numero1,numero2,numero3));

        sc.close();

    }


}