package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio8;

public class TestConsumo {

    public static void main(String[] args) {

        Consumo consumo = new Consumo(340, 100, 80, 1.43);

        System.out.println("\n---- VALORES PRINCIPALES ----");
        System.out.println("Tiempo del viaje: " + consumo.getTiempo() + " horas");
        System.out.println("Consumo medio: " + consumo.consumoMedio() + " litros/100km");
        System.out.println("Consumo en euros: " + consumo.consumoEuros() + " euros/100km");

        // Modifico los valores con los SET
        consumo.setKms(500);
        consumo.setVmed(60);

        // Muestro resultados después de la modificación
        System.out.println("\n---- VALORES MODIFICADOS ----");
        System.out.println("Tiempo del viaje: " + consumo.getTiempo() + " horas");
        System.out.println("Consumo medio: " + consumo.consumoMedio() + " litros/100km");
        System.out.println("Consumo en euros: " + consumo.consumoEuros() + " euros/100km");
    }
}
