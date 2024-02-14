package Tema5Prog.McBurger.dominio;

public abstract class Bebida extends Ingrediente {

    //Propiedades

    private boolean refrigerada;

    //Constructor

    public Bebida(String nombre, tipoIngredientes tipoIngrediente) {
        super(nombre, tipoIngrediente);
        this.refrigerada = false;
    }

}
