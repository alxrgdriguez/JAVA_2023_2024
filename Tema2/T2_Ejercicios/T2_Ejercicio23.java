import java.util.Scanner;

class Ejercicio_23 {

    public static void main(String[] args) {
        // Declaramos las variables para almacenar la fecha introducida
        int dia, mes, anio;

        // Pedimos al usuario que introduzca la fecha
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día: ");
        dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        anio = sc.nextInt();

        // Calculamos la fecha del día siguiente
        int diaSiguiente = dia + 1;

        // Si el día del mes es 31 y el mes es diciembre, el día siguiente es 1 de enero
        if (diaSiguiente == 31 && mes == 12) {
            diaSiguiente = 1;
            mes = 1;
            anio++;
        }

        // Imprimimos la fecha del día siguiente
        System.out.println("La fecha del día siguiente es: " + (diaSiguiente - 1) + "/" + mes + "/" + anio);

        sc.close();
    }
}
