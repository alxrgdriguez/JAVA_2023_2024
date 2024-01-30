package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio5;

public class Satelite {

    // --- Propiedades ---
    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    // --- Constructores ---
    Satelite (double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }
    Satelite () {
        meridiano=paralelo=distancia_tierra=0;
    }

    //Getters AND Setters


    public double getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public double getParalelo() {
        return paralelo;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public double getDistancia_tierra() {
        return distancia_tierra;
    }

    public void setDistancia_tierra(double distancia_tierra) {
        this.distancia_tierra = distancia_tierra;
    }


    // --- Métodos ---
    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }
    public void printPosicion() {
        System.out.print("El satélite se encuentra en ");
        System.out.print("el paralelo "+paralelo+" meridiano "+meridiano);
        System.out.print(" a una distancia de la Tierra de"+distancia_tierra+" kms.");
    }

    public void variaAltura(double desplazamiento){

        distancia_tierra += desplazamiento;
    }

    public boolean enOrbita(){
        if (distancia_tierra < 0){
            return false;
        }else{
            return true;
        }
    }

    public void variablePosicion(double variap, double variam){

        meridiano += variam;
        paralelo += variap;

    }

}
