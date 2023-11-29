package Tema3Prog.Cadenas.T3_EjerString;

public class T3_String8 {


    public static void main(String[] args) {
        
        /**
         * Ejercicio 8. Divide la cadena “http//www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias”.
         */

         String cadena = "http://www.iesjaroso.es/noticias";
         String[] partes = cadena.split("/");
         
         System.out.print("\n" + partes[0]); // "http"
         System.out.print(" " + partes[2]); // "www.iesjaroso.es"
         System.out.print(" " + partes[3] + "\n");  // "noticias"
    

      
    }

}
