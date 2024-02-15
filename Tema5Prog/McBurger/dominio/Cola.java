package Tema5Prog.McBurger.dominio;

public class Cola extends Bebida{

    public Cola() {
        super("Cola", tipoIngredientes.bebida);

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
