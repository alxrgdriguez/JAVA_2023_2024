package bucles;
import java.util.Scanner;

public class tabla {

    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero (entre el 1 - 10) y te diré la tabla de multiplicar: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){

            int multiplicar = (numero * i);
            System.out.println(numero + " x " + i + " = " + multiplicar);

        }









        sc.close();
         



    }
    
}
