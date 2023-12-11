package Ejercicios_antes_Examen;

public class CifradoRielCesar {
    
    public static void main(String[] args) {
        

        String cadena = "Hola mundos";

        StringBuffer c1=new StringBuffer(), c2=new StringBuffer();

        //CIFRAR
        for(int i=0; i<cadena.length(); i++) {
            if (i % 2 == 0)
                c1.append(cadena.charAt(i));
            else
                c2.append(cadena.charAt(i));
        }

        String resultado = c1.toString() + c2.toString();
        System.out.println(resultado);

        //DESCIFRAR
        StringBuffer sbOriginal = new StringBuffer();
        for(int i=0; i < c1.length(); i++) {
            if (i<c1.length())
                sbOriginal.append(c1.charAt(i));
            if (i<c2.length())
                sbOriginal.append(c2.charAt(i));
        }

        System.out.println(sbOriginal.toString());
    }
}