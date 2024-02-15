package Tema5Prog.McBurger.dominio;

public class Agua extends Bebida{

    public Agua() {
        super("Agua", tipoIngredientes.bebida);
    }

    @Override
    public double obtenerPrecio() {
        return 0;
    }

    public void meterEnNevera() {
    }

    public void sacarDeNevera() {
    }
}
