package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio3;

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
}
