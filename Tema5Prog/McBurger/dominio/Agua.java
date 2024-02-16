package Tema5Prog.McBurger.dominio;

public class Agua extends Bebida{

    public Agua() {
        super("Agua", tipoIngredientes.bebida);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Agua.................");
        sb.append(obtenerPrecio()).append("€");
        return sb.toString();
    }

    /**
     * Obtener precio de Bebida agua
     * @return Devuelve el precio de el agua
     */
    @Override
    public double obtenerPrecio() {

    return 0;

    }

    public void meterEnNevera() {
    }

    public void sacarDeNevera() {
    }
}
