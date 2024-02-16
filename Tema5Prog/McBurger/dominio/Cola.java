package Tema5Prog.McBurger.dominio;

public class Cola extends Bebida{

    public Cola() {
        super("Cola", tipoIngredientes.bebida);

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cola................. ");
        sb.append(obtenerPrecio()).append("€");
        return sb.toString();
    }

    /**
     * Obtener precio de Bebida Cola
     * @return Devuelve el precio de Cola
     */
    @Override
    public double obtenerPrecio() {
        double precioCola = 0;

        precioCola = super.obtenerPrecio();
        return precioCola;
    }


    public void meterEnNevera() {
        this.refrigerada = true;
    }

    public void sacarDeNevera() {
        this.refrigerada = false;

    }
}
