package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio4;

public class Finanzas {

    //Propiedades
    private double dola_euro;

    //Constructor

    public Finanzas() {
        dola_euro = 1.36;
    }

    public Finanzas(double dola_euro) {

        this.dola_euro = dola_euro;
    }

    //Métodos

    public double dolaresToEuros(double dolares){

        return this.dola_euro * dolares;

    }

    public double eurosToDolares(double euros){

        return this.dola_euro / euros;
    }

    //Getters and Setters

    public double getDola_euro() {
        return dola_euro;
    }

    public void setDola_euro(double dola_euro) {
        this.dola_euro = dola_euro;
    }
}
