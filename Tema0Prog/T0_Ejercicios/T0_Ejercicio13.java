package Tema0Prog.T0_Ejercicios;

public class T0_Ejercicio13 {

    public static void main(String[] args) {
        

        /*13. Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y
        queremos conocer este tiempo, pero expresado en horas, minutos y segundos.*/

        int t = 5552;
        int total = t;
        int horas, minutos, segundos;

        horas = t / 3600;
        t = t % 3600;
        minutos = t / 60;
        segundos = t % 60;

        System.out.println(total + " segundos son: " + "Horas: " + horas + " - Minutos: " + minutos + " - Segundos: " + segundos);




    }
    
}
