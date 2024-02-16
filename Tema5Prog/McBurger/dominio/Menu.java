package Tema5Prog.McBurger.dominio;

import Tema5Prog.McBurger.interfaces.Cocinable;

import java.util.ArrayList;

public class Menu{

    //Propiedades

    public static int numeroMenus;

    private int numeroIngredientes;

    private ArrayList<Ingrediente> listaIngredientes;

    //Constructor

    public Menu() {
        this.numeroIngredientes = 0;
        this.listaIngredientes = new ArrayList<>();
        numeroMenus++;
    }

    //Getters and Setters

    public static int getNumeroMenus() {
        return numeroMenus;
    }

    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }


    /**
     * Metodo para imprimrir el menu completo
     */
    public void imprimirMenu() {
        for (int i= 0; i < this.listaIngredientes.size(); i++) {
            System.out.println(this.listaIngredientes.get(i) );}
    }

    /**
     * Método para añadir bebida
     */

    public void addBebida(Bebida bebida) {
        this.listaIngredientes.add(bebida);
        this.numeroIngredientes++;
    }


    /**
     * Método para añadir comida
     */
    public void addComida(Comida comida) {
        this.listaIngredientes.add(comida);
        this.numeroIngredientes++;
    }

    /**
     * Metodo para obtener el precio total. Precio de Comida + precio de Bebida
     * @return Devuelve el precio total
     */

    public double obtenerPrecioMenu() {

        double precioComida = 0;
        double precioBebida= 0;

        //Sumar el precio de Comida + el precio de Bebida para obtener el precio del menu
        for (Ingrediente listaIngrediente : this.listaIngredientes) {

            if (listaIngrediente instanceof Bebida) {
                precioBebida += listaIngrediente.obtenerPrecio();
            } else if (listaIngrediente instanceof Comida) {
                precioComida += listaIngrediente.obtenerPrecio();
            }
        }

        return precioComida + precioBebida;
    }



}
