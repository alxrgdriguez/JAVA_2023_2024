package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio8;

public class Consumo {

    //Properties
    private double kms;
    private double litros;
    private double vmed;
    private double pgas;

    //Constructor
    public Consumo(double kms, double litros, double vmed, double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    //Getters and Setters

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVmed() {
        return vmed;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPgas() {
        return pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    //Métodos

    /**
     * Método para saber el tiempo empleado en realizar el viaje
     */
    public double getTiempo() {

        return kms / vmed;
    }

    /**
     * Método para obtener el consumo medio del vehículo (en litros cada 100 kilómetros)
     */
    public double consumoMedio() {

        return (litros / kms) * 100;
    }

    /**
     * Método para obtener el consumo medio del vehículo (en euros cada 100 kilómetros)
     */
    public double consumoEuros() {
        return (litros / kms) * pgas * 100;
    }

}
