package Tema3Prog.Cadenas.ejemplos;

public class EjemploString {
    
    public static void main(String[] args) {
        
        //String texto = new String("Hola caracola");
        Integer num = 10;

        String nombre = "Javi";
        String vacio = ""; //Cadena vacía

        System.out.println("Hola " + nombre.charAt(2));

        for(int i=0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }


        String texto = "En un lugar de la Mancha de cuyo ...";
        if (texto.startsWith("En")) {
            System.out.println("Empieza con 'En'");
        }
        if (texto.endsWith("...")) {
            System.out.println("Acaba con ...");
        }

        String str="El primer programa programa";
        int pos=str.indexOf("pro");  // 10​
        System.out.println(pos);
        System.out.println( str.indexOf("pro", pos+1)); //A partir de donde buscar

        System.out.println( texto.concat(str) );
        System.out.println( texto + str );

        System.out.println( str.substring(3, 9)); //Inicio y fin

        System.out.println( str.substring(0, str.indexOf("pro")));

        int number = 33;
        System.out.println(33);
        String numero = String.valueOf(33);
        System.out.println(1 + numero);

        System.out.println("-" + "  espacios  ff ".trim() + "-");

        " esto ".trim();

        String jj = new String(" esto ");
        jj.trim();

        String contador = "22";
        int ncontador = Integer.parseInt(contador);
        ncontador++;
        System.out.println(ncontador);

        double ncontador2 = Integer.valueOf(contador).doubleValue();
        ncontador2++;
        System.out.println(ncontador2);


    }
}