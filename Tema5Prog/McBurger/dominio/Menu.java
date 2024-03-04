package Tema5Prog.McBurger.dominio;

import java.util.ArrayList;

public class Menu {

    //Propiedades

    public static int numeroMenus = 0;
    private int numeroIngredientes;
    private ArrayList<Ingrediente> listaIngredientes;

    //Constructor
    public Menu(){
        numeroMenus++;
        this.numeroIngredientes = 0;
        this.listaIngredientes = new ArrayList<>();
    }

    //Metodos
    public void imprimirMenu() {
        for (int i= 0; i < this.listaIngredientes.size(); i++) {
            System.out.println(this.listaIngredientes.get(i));

        }

    }

    public void addComida(Ingrediente ingrediente){
        this.listaIngredientes.add(ingrediente);
        this.numeroIngredientes++;

    }

    public void addBebida(Ingrediente ingrediente){
        this.listaIngredientes.add(ingrediente);
        this.numeroIngredientes++;

    }

    public int getNumeroIngredientes (){
        return this.numeroIngredientes;
    }

    public double obtenerPrecioMenu(){

        double precioTotal = 0;

        for (int i = 0; i < this.listaIngredientes.size(); i++){

            precioTotal += this.listaIngredientes.get(i).obtenerPrecio();
        }

        return precioTotal;
    }



}
