package EjerciciosRepaso_UT2;

public class Ejercicio8 {

    /**
     * Ejercicio8
     * Realiza un programa que pinte los 20 primeros términos de esta serie: 1, -2, 3, -4, 5, -6, …
     */
    public static void main(String[] args) {

            //Declaramos la variable de valor entero
            int terminos = 0;

            // Imprime los primeros 20 términos de la serie
            for (int i = 1; i <= 20; i++) {
            // Calcula el término actual de la serie
           
            //En el ejercicio se puede ver que los numeros negativos son pares, así que hacemos la condción para todos esos numeros pares
            //así los muestre con un (-).
            if (i % 2 == 0) {
                terminos = -i;
            
            //Sino se muestran normales o (positivos)
            } else {
                terminos = i;
            }

            // Imprimimos los terminos se parados con un espacio
            System.out.print(terminos + " ");
            }
    }
}
        
   
    
