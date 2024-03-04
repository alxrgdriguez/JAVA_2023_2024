package Tema5Prog.McBurger.dominio;

public abstract class Bebida extends Ingrediente {

    //Propiedades
    protected boolean refrigerada;

    //Constructor

    public Bebida(){
        this.refrigerada = false;
    }

    @Override
    public double obtenerPrecio() {
        if (this.refrigerada){
            return 1.5;
        }else {
            return 1;
        }
    }

    public void meterEnNevera(){
        this.refrigerada = true;
    }

    public void sacarDeNevera(){
        this.refrigerada = false;

    }
}
