package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio6;

import java.util.Objects;

public class Contacto {

    //Propiedades
    protected String nombre;

    protected String telefono;


    //Constructor
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false; //Cuando haya herencia quitamos || getClass() != o.getClass() que esta en esta línea
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    //Métodos

    public String pintar() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Telefono: ").append(telefono).append("\n");
        return sb.toString();
    }
}
