package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio2;

public class Coche {

    //Propiedades
    private int velocidad;

    //Constructor
    Coche () { velocidad = 0;}

    //Metodos

    //Velocidad actual
    public int getVelocidad() {
        return velocidad;
    }

    //Acelerar
    public void acelera(int mas){

        this.velocidad += mas;
    }

    //Frenar
    public void frenar(int menos){

        this.velocidad -=menos;
    }
}
