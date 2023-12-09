package Tema0Prog.T0_Ejercicios;

public class T0_Ejercicio7 {

    // 7. ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione.

    class Suma {
        public static void main(String [] args)
        {

        //HAY DOS ERRORES EN ESTE EJERCICIO

        int n1=50,n2=30; //El primero esta al final de la línea, el error está en la ',' se tiene que terminar siempre con ';' 
        double suma=0;  //Aquí debería ser int suma=0; por eso no se puede calcular abajo
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
        }
        }

    
}
