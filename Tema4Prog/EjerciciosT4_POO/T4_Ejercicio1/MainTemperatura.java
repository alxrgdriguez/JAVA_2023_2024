package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio1;

public class MainTemperatura {

    public static void main(String[] args) {

        System.out.println("Celsius a Farenheit: " + new Temperatura().celsiusToFarenheit(Math.round(10.2)));
        System.out.println("Farenheit a Celsius: " + new Temperatura().farenheitToCelsius(Math.round(40.3)));

    }
}
