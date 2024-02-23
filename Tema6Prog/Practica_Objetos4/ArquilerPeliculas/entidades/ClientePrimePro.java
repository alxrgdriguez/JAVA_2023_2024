package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

public class ClientePrimePro extends Cliente {

    //Propiedades

    private double precio;

    //Constructor

    public ClientePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email);
        this.precio = 5;
    }

    // ****** METODOS ******

    @Override
    public boolean esPro() {
        if (this.precio == 5){
            return true;
        }

        else
            return false;
    }

    @Override
    public double getPrecioMensual() {
        return 5;
    }
}
