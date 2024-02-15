package Tema5Prog.McBurger.dominio;

public class Patata extends Comida{

    public Patata() {
        super("Patata", tipoIngredientes.comida);

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
