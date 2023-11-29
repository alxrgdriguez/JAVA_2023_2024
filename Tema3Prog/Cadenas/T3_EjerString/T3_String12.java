package Tema3Prog.Cadenas.T3_EjerString;

public class T3_String12 {

    public static StringBuilder devolverMitad(String cadena){

        StringBuilder mitad = new StringBuilder(cadena.length());

        int mitadC = cadena.length() / 2;

        for (int i = 0; i < mitadC; i++) {

            mitad.append(cadena.charAt(i));
            
        }

        return mitad;
    }

    public static void main(String[] args) {
        

        /**
         * Ejercicio 12. Escribe un método que te devuelva la mitad de una cadena.
         */

        String cadena = "Hola como estass yo estoy bien";
        
        System.out.println(devolverMitad(cadena));

    }
    
}

