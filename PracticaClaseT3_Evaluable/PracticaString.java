package PracticaClaseT3_Evaluable;

import java.util.Scanner;

public class PracticaString {

    public static String cambiarVocales(String cadena, String vocal) {
        //Creamos StringBuffer del tamaño de la cadena donde guardaremos la cadena con las vocales sustituidas
        StringBuffer sb = new StringBuffer(cadena.length());

        for(int i=0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);

            //Si el caracter actual es una vocal, lo tengo que sustituir, sino no
            if (caracterActual == 'a' || caracterActual == 'e' || caracterActual == 'i' || caracterActual == 'o' || caracterActual == 'u' ) {
                //Sustituir
                sb.append(vocal);
            } else if (caracterActual == 'A' || caracterActual == 'E' || caracterActual == 'I' || caracterActual == 'O' || caracterActual == 'U' ) {
                sb.append(vocal.toUpperCase());
            } else if (caracterActual == 'á' || caracterActual == 'é' || caracterActual == 'í' || caracterActual == 'ó' || caracterActual == 'ú' ) {
                switch (vocal) {
                    case "a":
                        sb.append("á");
                        break;
                    case "e":
                        sb.append("é");
                        break;
                    case "i":
                        sb.append("í");
                        break;
                    case "o":
                        sb.append("ó");
                        break;
                    case "u":
                        sb.append("ú");
                        break;
                    default:
                        break;
                }
            } else {
                //Añadimos el caracter tal cual
                sb.append(caracterActual);
            }
            
        }

        return sb.toString();
    }

    public static void main(String[] args) {
    
        String cadena = "La programación Está más complicada de lo que pensaba";

        String resultado = cambiarVocales(cadena, "i");

        System.out.println(resultado);
        
    }
}