package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

import java.util.Objects;

public abstract class Cliente {

    //Propiedades
    protected String dni;

    protected String nombre;

    protected String email;

    protected double precioMensual;

    //Constructor

    /**
     *
     * Contructor parametrizado
     * @param dni
     * @param nombre
     * @param email
     */
    public Cliente(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    /**
     * Constructor por defecto
     */
    public Cliente() {
        this.dni ="23811761P";
        this.nombre = "Julian";
        this.email = "patata@gmail.com";
    }

    //Getters and Setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", precioMensual=").append(precioMensual);
        sb.append('}');
        return sb.toString();
    }

    //equals

    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);*/
        Cliente cliente = (Cliente) o;
        if(this.getDni() == cliente.getDni()) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }


    // ****** METODOS ******

    /**
     * Metodo para saber si un cliente es PRO o no es PRO
     * @return si es pro true sino false
     */
    public abstract boolean esPro();

    /**
     * Metodo para calcular el precioMensual
     * @return el precio dependiendo de si es un cliente PRO O NO LO ES
     */

    public abstract double getPrecioMensual();
}