package Tema5Prog.ejemploArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Tienda {

    private String nombre;
    private ArrayList<Producto> productos;

    //Constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tienda{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tienda tienda = (Tienda) o;
        return Objects.equals(nombre, tienda.nombre);
    }

    //addProducto. Añadir un producto a la tienda
    public void addProducto(Producto producto){

        this.productos.add(producto);

    }

    //removeProducto
    public void removeProducto(Producto producto){

        this.productos.remove(producto);

    }

}
