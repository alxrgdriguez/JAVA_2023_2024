package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

public class ClientePrime extends Cliente {

    //Propiedades
    private static final double PRECIO = 3;

    //Constructor
    public ClientePrime(String dni, String nombre, String email) {
        super(dni, nombre, email);
        setPrecioMensual(PRECIO);
    }

    // ****** METODOS ******

    @Override
    public boolean esPro() {
       return false;
    }


    @Override
    public double getPrecioMensual() {
        return PRECIO;
    }
}
