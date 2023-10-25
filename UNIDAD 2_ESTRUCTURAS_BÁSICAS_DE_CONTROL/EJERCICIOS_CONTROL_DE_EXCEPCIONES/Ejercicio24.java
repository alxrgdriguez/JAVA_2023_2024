import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        // Pedimos al usuario que piense un número entre el 1 y el 100.
        Scanner sc = new Scanner(System.in);
        System.out.println("Piensa un número entre el 1 y el 100: ");
        int numeroPensado = sc.nextInt();

        // Realizamos la búsqueda binaria.
        int intentos = busquedaBinaria(numeroPensado);

        // Imprimimos el número de intentos necesarios.
        System.out.println("¡Encontrado! El número que has pensado es " + numeroPensado + ". Se han realizado "
                + intentos + " intentos.");
    }

    // Busca un número pensado por el usuario utilizando el algoritmo de búsqueda
    // binaria.

    public static int busquedaBinaria(int numeroPensado) {
        // El rango de números a buscar.
        int min = 1;
        int max = 100;
        int intentos = 0;

        // Mientras el rango no esté vacío, continuamos buscando.
        while (min <= max) {
            // El número medio del rango.
            int medio = (min + max) / 2;

            // Preguntamos al usuario si el número que ha pensado es menor, igual o mayor al
            // número medio.
            if (numeroPensado == medio) {
                return intentos;
            } else if (numeroPensado < medio) {
                max = medio - 1;
            } else {
                min = medio + 1;
            }

            intentos++;
        }

        // Si el rango está vacío, significa que no se ha encontrado el número.
        return intentos;
    }
}
