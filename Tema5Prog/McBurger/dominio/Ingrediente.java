package Tema5Prog.McBurger.dominio;

public abstract class Ingrediente {

    //Propiedades

    protected String nombre;

    public enum tipoIngredientes {comida, bebida}

    protected tipoIngredientes tipoIngrediente;

    //Constructor

    public Ingrediente(String nombre, tipoIngredientes tipoIngrediente) {
        this.nombre = nombre;
        this.tipoIngrediente = tipoIngrediente;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipoIngredientes getTipoIngrediente() {
        return tipoIngrediente;
    }

    public void setTipoIngrediente(tipoIngredientes tipoIngrediente) {
        this.tipoIngrediente = tipoIngrediente;
    }

    //Métodos abstractos
    public abstract double obtenerPrecio();


}
