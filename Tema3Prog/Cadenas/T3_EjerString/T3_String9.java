package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Scanner;

public class T3_String9 {

    public static void main(String[] args) {
        

        /**
         * Ejercicio 9. Crear una cadena de texto formada por tres cadenas “una”, “dos” y “tres” usando StringBuilder
         */

        StringBuilder sb1 = new StringBuilder("uno");
        StringBuilder sb2= new StringBuilder("dos");
        StringBuilder sb3 = new StringBuilder("tres");

        StringBuilder sbfinal = new StringBuilder();
        sbfinal.append(sb1);
        sbfinal.append(sb2);
        sbfinal.append(sb3);

        System.out.println(sbfinal);

       
    }
    
}
