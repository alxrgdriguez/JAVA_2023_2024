package Tema5Prog.McBurger.dominio;

public abstract class Bebida extends Ingrediente {

    //Propiedades

    protected boolean refrigerada;

    //Constructor

    public Bebida(String nombre, tipoIngredientes tipoIngrediente) {
        super(nombre, tipoIngrediente);
        this.refrigerada = false;
    }

    //Getters and Setters

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }


}
