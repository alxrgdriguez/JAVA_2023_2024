package Monopoly_scrum;

import java.util.Objects;

public abstract class CasillaEspecial extends Casilla {

    //Propiedades de CasillaEspecial

    protected int cantidad;

    //Constructor de CasillaEspecial

    public CasillaEspecial(String nombre, int numero, int cantidad) {
        super(nombre, numero);
        this.cantidad = cantidad;
    }

    //Getters y Setters de CasillaEspecial

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //toString de CasillaEspecial


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CasillaEspecial{");
        sb.append("cantidad=").append(cantidad);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

    //equals de CasillaEspecial

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CasillaEspecial that = (CasillaEspecial) o;
        return cantidad == that.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantidad);
    }
}
