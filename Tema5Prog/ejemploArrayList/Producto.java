package Tema5Prog.ejemploArrayList;

import java.util.Objects;

public class Producto {

    private String nombre;
    private double precio;

    //Constructor parametrizado
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Constructor Copia
    public Producto(Producto p) {

        this.nombre = p.getNombre();
        this.precio = p.getPrecio();
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre);
    }



}
