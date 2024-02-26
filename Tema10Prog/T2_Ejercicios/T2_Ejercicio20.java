import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {

        /* Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar
        la media de los N números introducidos, el mayor y el menor. */

        Scanner sc = new Scanner(System.in);

        int N = 1;
        int numero = 0;
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        
        // Pedir al usuario que ingrese la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        N = sc.nextInt();


        // Verificar que N sea positivo
        while (N <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
            System.out.print("Introduce un número entero positivo N: ");
            N = sc.nextInt();
        }

        for (int i = 1; i <= N; i++){

            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();

            //Hacer la suma de los numeros 
            suma += numero;

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

         }

        // Calcular la media
        double media = (double) suma / N;

        // Mostrar los resultados
        System.out.println("Media: " + media);
        System.out.println("Mayor: " + maximo);
        System.out.println("Menor: " + minimo);

       sc.close();
    }
}


    

    

