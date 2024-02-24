package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

public class ClientePrimePro extends Cliente {

    //Propiedades

    private static final double PRECIO = 5;

    //Constructor

    public ClientePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email);
        setPrecioMensual(PRECIO);
    }

    // ****** METODOS ******

    @Override
    public boolean esPro() {
       return true;
    }

    @Override
    public double getPrecioMensual() {
        return PRECIO;
    }
}
