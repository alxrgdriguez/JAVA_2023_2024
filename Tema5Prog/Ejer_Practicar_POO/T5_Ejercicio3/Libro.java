package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio3;

import java.util.Objects;

public class Libro {

    //Propiedades
    private int ISBN;
    private String titulo;
    private String autor;
    private String num_paginas;
    private double precio_compra;
    private double precio_venta;
    private boolean vendido;

    //Constructor
    public Libro(int ISBN, String titulo, String autor, String num_paginas, boolean vendido) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
        this.precio_compra = 0;
        this.precio_venta = 0;
        this.vendido = vendido;
    }

    //Getters y Setters

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(String num_paginas) {
        this.num_paginas = num_paginas;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("ISBN=").append(ISBN);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", num_paginas='").append(num_paginas).append('\'');
        sb.append(", precio_compra=").append(precio_compra);
        sb.append(", precio_venta=").append(precio_venta);
        sb.append(", vendido=").append(vendido);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return ISBN == libro.ISBN && Double.compare(precio_compra, libro.precio_compra) == 0 && Double.compare(precio_venta, libro.precio_venta) == 0 && vendido == libro.vendido && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(num_paginas, libro.num_paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, titulo, autor, num_paginas, precio_compra, precio_venta, vendido);
    }
}
