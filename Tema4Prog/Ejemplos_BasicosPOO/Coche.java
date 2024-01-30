package Tema4Prog.Ejemplos_BasicosPOO;

public class Coche {

    //PROPERTIES
    public String marca;
    public String color;
    public String modelo;

    //CONSTRUCTOR


    public Coche(String marca, String color, String modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    //METHODS
    public String pintar() {
        StringBuffer sb = new StringBuffer();
        sb.append(marca);
        sb.append(" - ");
        sb.append(modelo);
        sb.append(" - ");
        sb.append(color);

        return sb.toString();
    }

}