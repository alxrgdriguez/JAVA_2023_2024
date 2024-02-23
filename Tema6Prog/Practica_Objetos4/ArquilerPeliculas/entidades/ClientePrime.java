package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

public class ClientePrime extends Cliente {

    //Propiedades
    private double precio;

    //Constructor
    public ClientePrime(String dni, String nombre, String email) {
        super(dni, nombre, email);
        this.precio = 3;
    }

    // ****** METODOS ******

    @Override
    public boolean esPro() {
        if (this.precio == 3) {
            return false;
        }
        else
            return true;
    }


    @Override
    public double getPrecioMensual() {
        return 3;
    }
}
