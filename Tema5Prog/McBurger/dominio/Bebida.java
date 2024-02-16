package Tema5Prog.McBurger.dominio;

public abstract class Bebida extends Ingrediente {

    //Propiedades

    protected boolean refrigerada;

    //Constructor

    public Bebida(String nombre, tipoIngredientes tipoIngrediente) {
        super(nombre, tipoIngrediente);
        this.refrigerada = false;
    }

    //Getters y Setters

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }

    /**
     * Método que asigna un precio a cada tipo de bebida.
     * Bebida NO refrigerada --> 1€
     * Bebida refrigerada --> 1.50€
     * @return Devolverá su respectivo precio en precio en cada caso
     */@Override
    public double obtenerPrecio() {

        if (this.refrigerada) {
            return 1.50;
        } else {
            return 1;
        }
    }
}
