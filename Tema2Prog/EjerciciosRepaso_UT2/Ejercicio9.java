package EjerciciosRepaso_UT2;

public class Ejercicio9 {

    /**
     * Ejercicio 9
     * 9. Realiza un programa que pinte los 50 primeros términos de esta serie: (5n + 2) / n
     */

    public static void main(String[] args) {

        double guardarTerminos = 0;

        for (int i = 1; i <= 50; i++){

            guardarTerminos = ((5*i + 2.0) / i);

            System.out.println(guardarTerminos + " ");

        }
        
    }
    
}
