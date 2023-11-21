package bucles;
import java.util.Scanner;
public class HastaSea0 {


    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        double suma = 0; 
        int contador = 0;
        int numero = 50;
        double media;
        

        while (numero != 0){

            System.out.println("Introduce un numero: ");
            numero = sc.nextInt();

            if (numero != 0){

                suma = suma + numero;
                contador++;

            }    
            
        }

        media = suma / contador;
        System.out.println("El total es " + suma + " y la media es " + media);

    }
}
