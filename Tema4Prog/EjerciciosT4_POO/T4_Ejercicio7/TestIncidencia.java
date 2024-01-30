package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio7;

public class TestIncidencia {

    public static void main(String[] args) {

        System.out.println();
        Incidencia incidencia1 = new Incidencia (1, "Abierta", "Fallo en la iluminación", "Cambiar bombilla pasillo A");
        Incidencia incidencia2 = new Incidencia (2, "En proceso", "Cuenta de Steam", "Restablecer password");

        System.out.println(incidencia1.toString());
        System.out.println("Incidencias pendientes codigo 1: "  + Incidencia.getPendientes());

        System.out.println(incidencia2.toString());
        System.out.println("Incidencias pendientes codigo 2: " + Incidencia.getPendientes());

        incidencia2.resuelve();
        System.out.println(incidencia2.toString());
        System.out.println("Incidencias resueltas: " + Incidencia.getPendientes());


    }
}
