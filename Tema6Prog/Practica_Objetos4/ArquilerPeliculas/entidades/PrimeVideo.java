package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

import Tema6Prog.Practica_Objetos4.ArquilerPeliculas.servicios.Multimedia;

import java.util.ArrayList;

public class PrimeVideo {

    //Proiedades

    private ArrayList<Multimedia> catalogos;
    private ArrayList<Cliente> suscriptores;
    private double ganancias;

    //Constructor

    public PrimeVideo() {
        this.catalogos = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancias = 0;
    }

    //Getters

    public ArrayList<Multimedia> getCatalogos() {
        return catalogos;
    }

    public ArrayList<Cliente> getSuscriptores() { return suscriptores; }

    /**
     * Devuelve las ganancias. A las ganancias generadas cuando los clientes ven multimedia
     * hay que sumarle las ganancias de los todos los suscriptores que haya (multiplicado por 12 meses).
     * @return
     */
    public double getGanancias() {

        double totalganancias = this.ganancias;

        /*for (Cliente cliente : suscriptores) {
            totalganancias += cliente.getPrecioMensual() * 12;
        }*/

        for (int i = 0; i < suscriptores.size(); i++){
            totalganancias += suscriptores.get(i).getPrecioMensual() * 12;
        }

        return totalganancias;
    }

    //Metodos

    /**
     * Metodo para agregar un suscriptor a la lista de suscriptores si no estaba ya
     * @param cliente
     */
    public void addSuscriptores(Cliente cliente) {

        if (!this.suscriptores.contains(cliente)) {
            this.suscriptores.add(cliente);
        }
    }

    /**
     * Metodo para añadir multimedia a la lista de multimedia si no estaba ya
     */
    public void addMultimedia(Multimedia multimedia) {

        if (!this.catalogos.contains(multimedia)){
            this.catalogos.add(multimedia);

        }

    }

    /**
     * Si el cliente no es pro se añade a ganancias el precio del Multimedia
     * @param m
     * @param c
     */
    public void ver(Multimedia m, Cliente c){

        if (!c.esPro()){
            this.ganancias += m.getPrecio();
        }

    }

}
