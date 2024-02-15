package Tema5Prog.McBurger.dominio;

public abstract class Comida extends Ingrediente {

    //Propiedades

    protected boolean Cocinado;

    //Constructor

    public Comida(String nombre, tipoIngredientes tipoIngrediente) {
        super(nombre, tipoIngrediente);
        this.Cocinado = false;
    }


}
