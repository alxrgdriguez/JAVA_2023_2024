package Examen1ErTrimestre;

public class Ejercicio3 {

    public static String convertirAMorse(String palabra) {
    
            String espaniol[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q","r", "s", "t", "u", "v", "w", "x", "y", "z" };
    
            String codigomorse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", 
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",};
    
            //Buscar palabra en español
            int posicion = -1;
            for(int i=0; i < espaniol.length; i++) {
                if (espaniol[i] == palabra) {
                    posicion = i;
                    break;
                }
            }
    
            if (posicion == -1) {
                return "No encontrada";
            } else {
                return codigomorse[posicion];
            }
        }

    public static void main(String[] args) {
        
        /**
         *Ejercicio 3. Vamos a implementar funciones para usar Morse. En primer lugar, te pongo la
          equivalencia de las letras a caracteres Morse.

         Tienes que implementar una función convertirAMorse que reciba como
         parámetro una cadena de texto en español y devolver un String con la
         misma cadena, pero traducida a Morse. Los espacios entre palabras ponlos
         con el carácter “#”. Cada letra Morse la separaremos por un espacio.
         Pruébala.
         
         Ej: “hola mundo”  “…. --- .-.. .-#-- ..- -. -.. ---“

        Ahora vas a realizar una función que haga lo contrario convertirDeMorse
        que reciba una cadena con un texto en Morse, las palabras separadas por el
        carácter “#” y debes pintar el texto original en español. Además, para leer
        bien cada letra Morse, irá separada por un espacio.
        Recuerda que puedes usar indexOf pasándole un segundo parámetro que te
        diga a partir de donde buscar. Intenta hacer el ejercicio al principio solo con
        una palabra, y cuando lo tengas prueba a hacerlo con más de una palabra.
         */

        System.out.println(convertirAMorse("w"));
         
    
        }
    }
    
    

