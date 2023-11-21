import java.util.Scanner;

public class Ejercicio_24 {

    public static int numaleatorio(int min, int max) throws Exception{

        if (min > max){

            throw new Exception("El valor minimo no puede ser mayor que el maximo");

        }

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        //Piensa un numero
        //El pc genera un numero aleatorio entre 1 y 100
        //Yo le digo si es mayor o menor que el que pensando
        //El PC genera  un numeroo aleatorio entre (1. generado) o (generado,100)
        //Repetir hasta acertar


        int numeroActual = 0;
        int opcion = 0;

        Scanner sc = new Scanner(System.in);

         System.out.println("Piensa un número entre el 1 y el 100: ");

        try {
           
            numeroActual = numaleatorio(1, 100);
            System.out.println("¿Es tu numero el " + numeroActual + " ?");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    

    }

}