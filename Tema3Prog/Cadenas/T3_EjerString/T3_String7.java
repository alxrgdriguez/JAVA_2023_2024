package Tema3Prog.Cadenas.T3_EjerString;

public class T3_String7 {


    public static void main(String[] args) {
        

        /**
         * Ejercicio 7. Cuenta las vocales del texto “Me gusta programar en Java los sábados por la mañana”
         */

        String cadena = "Me gusta programar en Java los sábados por la mañana";
        int contVocales = 0;

        for (int i = 0; i < cadena.length(); i++){

            //Extraemos el carácter que se encuentra en la posición específica dentro de la cadena.
            char caracter = cadena.charAt(i);
            System.out.println(caracter);

            if (caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E' ||
                caracter == 'i' || caracter == 'I' || caracter == 'o' || caracter == 'O' ||
                caracter == 'u' || caracter == 'U' || caracter == 'á' || caracter == 'é' ||
                caracter == 'í' || caracter == 'ó' || caracter == 'ú' || caracter == 'Á' ||
                caracter == 'É' || caracter == 'Í' || caracter == 'Ó' || caracter == 'Ú') {

                contVocales++;
            }

        }
        System.out.println("En la frase " + cadena + " hay\n" + contVocales + " vocale/s");

    }
    
}
