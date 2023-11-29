package PracticaClaseT3_Evaluable;
import java.util.Arrays;
import java.util.Scanner;

public class PracticaArrays {

public static int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static double[] estadisticas(int n) {
        int dado=0;
        double resultado[] = new double[6];

        //Lanzar el dado n veces
        for(int i=0; i<n; i++) {
            dado = generarNumero(1, 6);

            //Contar las veces que sale cada número
            resultado[dado-1]++;
        }

        for(int i=0; i<6; i++) {
            resultado[i] = resultado[i] / n * 100;
        }

        return resultado;
    }


    public static void main(String[] args) {
        int tirada1,tirada2;
        int contador=0;
        int acumulador=0;

        //Repetir esto hasta que los dos sean seis
        do {
            tirada1 = generarNumero(1, 6);
            tirada2 = generarNumero(1, 6);

            contador++;
            acumulador += tirada1 + tirada2;

            System.out.println(tirada1 + " - " + tirada2);
        } while (tirada1 != 6 || tirada2 != 6);

        System.out.println("Se han realizado " + contador + " tiradas");
        System.out.println("El total de la suma es: " + acumulador);

        double esta[] = estadisticas(10);

        System.out.println(Arrays.toString(esta));

    }
}