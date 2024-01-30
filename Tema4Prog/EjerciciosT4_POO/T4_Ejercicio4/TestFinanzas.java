package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio4;

public class TestFinanzas {

    public static void main(String[] args) {

        Finanzas fn1 = new Finanzas();

        System.out.println("\n----- CONVERSIONES -----");

        //Euros a Dolares
        System.out.println("Euros a Dolares --> " + fn1.eurosToDolares(22.5));

        //Dolares a Euros
        System.out.println("Dolares a Euros --> " + fn1.dolaresToEuros(43.2));

    }
}
