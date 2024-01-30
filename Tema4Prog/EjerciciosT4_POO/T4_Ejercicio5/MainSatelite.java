package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio5;

public class MainSatelite {

    public static void main(String[] args) {

        Satelite sat1 = new Satelite(12.4, 50.2, 100.0);

        sat1.variablePosicion(100.0, 34.7);

        sat1.variaAltura(25.5);

        System.out.println(sat1.enOrbita());




    }
}
