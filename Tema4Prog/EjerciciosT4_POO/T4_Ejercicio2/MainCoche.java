package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio2;

public class MainCoche {

    public static void main(String[] args) {

        Coche co1 = new Coche();

        System.out.println(co1.getVelocidad());

        co1.acelera(100);

        System.out.println("El coche acelera a " + co1.getVelocidad() + " KM/H");

        co1.frenar(20);

        System.out.println("El coche ha frenado y ha pasado de 100 a " + co1.getVelocidad()+ " KM/H");

    }
}
