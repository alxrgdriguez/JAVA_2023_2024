package Ejercicios_antes_Examen;

public class EjercicioBucles {

    public static void main(String[] args) {
        
        /**
         * Escribe un programa que utilizando bucles muestre la siguiente figura por
        pantalla
        
                *
               ***
              *****
             *******
              *****
               ***
                *
        */

        
        int n = 4;

        //Se repite tantas veces como tenemos de fila en nuestra variable n 
        for(int i = 0; i < n; i++) {
            //Se añaden los espacios en blanco antes de dibujar los simbolos
            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }

            //Dibujamos la primera mitad izquierda del triangulo
            for(int j=0; j < i+1; j++) {
                System.out.print("*");
            }

            //Dibujamos la segunda mitad derecha del triangulo
            for(int j=0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Desincrementamos 1 a la variable n para no tener que volver a repetir la linea grande
        n--;
         //Se repite tantas veces como tenemos de fila en nuestra variable n 
        for(int i = 0; i < n; i++) {
            //Se añaden los espacios en blanco antes de dibujar los simbolos (ojo con la condicion, porque los espacios no son iguales que arriba, porque la linea del medio (la grande) la dibuja el bucle de arriba)
            for(int j=i+1; j>=0; j--) {
                System.out.print(" ");
            }

            //Dibujamos la primera mitad izquierda del triangulo
            for(int j=n; j > i; j--) {
                System.out.print("*");
            }

            //Dibujamos la segunda mitad derecha del triangulo
            for(int j=n; j > i+1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
    
}
