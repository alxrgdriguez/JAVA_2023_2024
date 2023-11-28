package Correccion_PruebaEvaluable;

public class vocales {


    public static String cambiarVocales(String cadena, String vocal){

        StringBuffer sb = new StringBuffer(cadena.length());

        for(int i = 0; i < cadena.length(); i++){

            char caracter = cadena.charAt(i);
            
            
            }

            return sb.toString();
        }

    

    public static void main(String[] args) {
        
        String cadena = "La programacion esta mas complicada de lo que pensamos";

        String resultado = cambiarVocales(cadena, "a");

        System.out.println(resultado);



    }   

}

