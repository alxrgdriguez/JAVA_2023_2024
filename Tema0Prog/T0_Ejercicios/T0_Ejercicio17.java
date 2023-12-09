package Tema0Prog.T0_Ejercicios;

import java.util.Random;

public class T0_Ejercicio17 {

    public static void main(String[] args) {
        
        /*17. Escriba expresiones que almacenen en variables lo siguiente:
        a. Crear un número entero positivo aleatorio entre 1 y 49.
        b. Generar un número aleatorio positivo par.
        c. Generar un número real aleatorio entre 1 y 10.
        d. Crear un número entero negativo entre -50 y -150.
        e. Crear un número entero entre -100 y 100.
        f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        g. Crea un generador aleatorio de uno de los meses del año*/

        //Formula para un numero aleatorio entre 2 numeros:ç
        /*Random rdm = new Random();
        int number = rdm.nextInt(max - min) + min;*/

        Random rdm = new Random();

        //a.
        int num1;

        num1 = rdm.nextInt(49) + 1; 
        System.out.println(num1);

        //b.

        int num2;

        num2 = (rdm.nextInt(100)+1)*2;//Numero positivo aleatorio entre 0-200 par
        System.out.println(num2);

        //c.

        double num3;

        num3 = rdm.nextDouble(10) + 1;
        System.out.println(num3);

        //d.

        int num4;

        num4 = rdm.nextInt(-50 - -150) + -150;
        System.out.println(num4);

        //e.

        int num5;

        num5 = rdm.nextInt(100 - -100) + -100;
        System.out.println(num5);

        
        //f.
        //Lista de los numeros
        int[] lista = {5, 7, 33, 125, 77};
        int num6;
        num6 = rdm.nextInt(lista.length);//si vale 5 (la longitud del array), rango de 0-4
        System.out.println(lista[num6]);

        //g.

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int num7;
        num7 = rdm.nextInt(meses.length);
        System.out.println(meses[num7]);



    }
    
}
