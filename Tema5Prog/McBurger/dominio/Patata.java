package Tema5Prog.McBurger.dominio;

public class Patata extends Comida{

    public Patata(String nombre, tipoIngredientes tipoIngrediente) {
        super(nombre, tipoIngrediente);
        this.nombre = nombre;
        this.tipoIngrediente = tipoIngrediente;
    }


    @Override
    public double obtenerPrecio() {
        return 0;
    }

    public void freir() {
    }

    public void asar() {
    }

    public void cocer() {
    }
}
