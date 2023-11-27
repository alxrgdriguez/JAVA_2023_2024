package PracticaClaseT3_Evaluable;

import java.util.Scanner;

public class PracticaArrays {


    /**
     * Funcion para devolver un numero aleatorio con valores enteros
     * @param min
     * @param max
     * @return
     */
    public static int numaleatorio(int min, int max) {
    
    
        return (int) (Math.random() * (max - min + 1) + min);
    
    }

    /**
     * Funcion para devolver un numero aleatorio con valores decimales
     * @param min
     * @param max
     * @return
     */
    public static double aleatorioDouble(double min, double max){

        return (double) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Funcion para retonar el porcentaje de apariciones de cada numero
     * @param n
     * @return
     */
    public static double[] estadisticas (int n){

        double[] dado = new double[6];

        for (int i = 0; i < dado.length; i++) {

            dado[i] = aleatorioDouble(1.0, 6.0);
            
            System.out.println(dado);
        }


        return dado;

    }

    public static void main(String[] args) {
        
        /**
         * EJERCICIO ARRAYS
            Dados

            Escriba un programa que genere la tirada de 2 dados (de 6 lados) y genere tiradas
            aleatorias y vaya sumando sus resultados hasta que ambos saquen un 6. Se deben
            mostrar todas las tiradas, el número de tiradas realizadas y la suma de ambos dados
            hasta que sacaron ambos un 6. Escribe después una función llamada double[]
            estadisticas(int n) que lance un dado aleatoriamente un número n de veces recibido
            como parámetro y debes retornar el porcentaje de apariciones de cada número del
            dado en las n tiradas (double[]). Pruébalo con n = 100 y n = 1000.
         */

        //Declaramos nuestro Scanner
        Scanner sc = new Scanner(System.in);

        int tiradas = 5;
        int sumarDados = 0;
        int contador = 0;
        int dado1 = 0;
        int dado2 = 0;
        

        //Pedimos al usuario que nos introduzca el numero de tiradas
        System.out.println("Introduce el numero de tiradas que deseas jugar: ");
        tiradas = Integer.parseInt(sc.nextLine());

        //Hacemos un bucle for para generar las tiradas pedidas por el usuario
        for (int i = 0; i < tiradas; i++){

            //Mostramos las tiradas en orden
            System.out.println("--------");
            System.out.println("Tirada " + i );
            System.out.println("--------");
            System.out.println();

            //Rellenamos nuestros dados de 6 caras
            dado1 = numaleatorio(1, 6);
            System.out.println("Dado 1: " + dado1);
            dado2 = numaleatorio(1, 6);
            System.out.println("Dado 2: " + dado2 + "\n");

            //Condición para decir que si es distinto de 6, que sume los numeros y los guarde en la variable contador
            //Luego si son iguales que salte. Finaliza con la suma total, quitando cuando son iguales a 6
            if(dado1 != 6 || dado2 != 6){

                sumarDados = (dado1 + dado2);
                contador ++;
   
                System.out.println("La suma es: " + sumarDados + "\n");

            }else if (dado1 == 6 || dado2 == 6){
                break;
            } 

            contador = contador + sumarDados;
        }

        
        System.out.println("La suma total es de: " + (contador -2));
      

        }
        

     
}
    
    


