package Tema5Prog.McBurger.dominio;

public class Cola extends Bebida{

    public Cola() {
        super("Cola", tipoIngredientes.bebida);

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cola.................");
        sb.append(obtenerPrecio());
        return sb.toString();
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
