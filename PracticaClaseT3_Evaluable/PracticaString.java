package PracticaClaseT3_Evaluable;

import java.util.Scanner;

public class PracticaString {

    public static String vocalsustituida(String  vocal, String cadena){

        StringBuffer sustituida = new StringBuffer();

        for (int i = 0; i < cadena.length(); i++) {

            //Extraemos el carácter que se encuentra en la posición específica dentro de la cadena.
            char caracter = cadena.charAt(i);

            if (caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E' ||
                caracter == 'i' || caracter == 'I' || caracter == 'o' || caracter == 'O' ||
                caracter == 'u' || caracter == 'U' || caracter == 'á' || caracter == 'é' ||
                caracter == 'í' || caracter == 'ó' || caracter == 'ú' || caracter == 'Á' ||
                caracter == 'É' || caracter == 'Í' || caracter == 'Ó' || caracter == 'Ú') {

                System.out.println(sustituida);
            }

            
        }

        return vocal;
    }


    public static void main(String[] args) {
        
        /**
         * Realiza una función que reciba como parámetro una cadena y una vocal (a,e,i,o,u) y devuelva
        como resultado la cadena inicial sustituyendo todas las vocales por la vocal introducida. Debe
        funcionar con mayúsculas y minúsculas, es decir, si la vocal a sustituir es la a, y encuentra una
        E, el resultado de la sustitución será una A.
        Ejemplo: “Mi amiga Ana es prima de Eva y de Irene”, le pasamos la ‘e’ y el resultado sería:
        “Me emege Ene es preme de Eve y de Erene”.
        No se pueden usar los métodos replace ni replaceAll de String ni StringBuffer.
        Para sacar más nota se recomienda usar una estructura mutable (StringBuffer o StringBuilder)
        para hacer la sustitución
         */

        //Declaramos el Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos nuestra variable cadena
        String cadena = "";
        String vocalIntroducida = "";

        //Pedimos por teclado la cadena al usuario
        System.out.println("Introduce una frase: ");
        cadena = sc.nextLine();

        //Pedimos la vocal que deseamos sustituir
        System.out.println("Ahora introduce la vocal por la que quieres cambiar las otras vocales: ");
        vocalIntroducida = sc.nextLine();

        

        System.out.println("Cadena original : " + cadena);
        System.out.println("Cadena sustituida por la vocal " + vocalIntroducida + " es " + vocalsustituida(vocalIntroducida, cadena));

        sc.close();
    }
    
}
