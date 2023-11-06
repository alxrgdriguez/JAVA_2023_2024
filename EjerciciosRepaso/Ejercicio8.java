package EjerciciosRepaso;

public class Ejercicio8 {

    /**
     * Ejercicio8
     * Realiza un programa que pinte los 20 primeros términos de esta serie: 1, -2, 3, -4, 5, -6, …
     */
    public static void main(String[] args) {

            int terminos = 0;

            // Imprime los primeros 20 términos de la serie
            for (int i = 1; i <= 20; i++) {
            // Calcula el término actual de la serie
           
            if (i % 2 == 0) {
                terminos = -i;
            } else {
                terminos = i;
            }

            // Imprime el término
            System.out.print(terminos + " ");
            }
    }
}
        
   
    
