package Tema3Prog.Cadenas.T3_EjerString;

public class T3_String11 {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 11. Elimina los espacios (intermedios también) de una cadena de texto.
         */

          
        String cadena = "       Hola mundo      ";
        String resultado = cadena.trim();
                
        System.out.println("**"+cadena+"**");
        System.out.println();
        System.out.println("**"+resultado+"**");
              
        // Elimina todos los espacios, pero no los tabuladores ni retornos
        System.out.println();
        System.out.println(resultado.replace(" ",""));
    }
    
}
