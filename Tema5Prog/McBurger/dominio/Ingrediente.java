package Tema5Prog.McBurger.dominio;

public abstract class Ingrediente {

    //Propiedades

    protected String nombre;

    protected String tipoIngrediente;

    //Getters y Setters

    public String getNombre(){
        return this.nombre;
    }

    public String getTipoIngrediente(){
        return this.tipoIngrediente;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public void setTipoIngrediente(String tipoIngrediente){

        this.tipoIngrediente = tipoIngrediente;
    }



    //Metodos

    public abstract double obtenerPrecio();

    //Despues seguir con los metodos

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(this.nombre).append('\t').append('\t').append('\t').append(this.obtenerPrecio()).append('€');
        return sb.toString();
    }
}
