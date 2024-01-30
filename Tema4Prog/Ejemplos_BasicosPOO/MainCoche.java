package Tema4Prog.Ejemplos_BasicosPOO;

public class MainCoche {

    public static void main(String[] args) {

        Coche co1 = new Coche("Audi","Azul","Q3");

        System.out.println(co1.pintar());

        co1.marca = "Ford";
        co1.color = "Gris";
        co1.modelo = "Focus";

        System.out.println(co1.pintar());

    }



}
