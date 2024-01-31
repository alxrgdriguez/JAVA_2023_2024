package Tema5Prog.Ejer_Practicar_POO;
import java.util.Objects;
public class Producto {

    //Propiedades
    protected long id;
    protected String nombre;
    protected String descripcion;
    protected double precioUnitario;
    protected int unidadesDisponibles;
    protected int stockMaximo;
    protected double descuento;

    //Constructor

    public Producto(long id, String nombre, String descripcion, double precioUnitario,
                    int unidadesDisponibles, int stockMaximo, double descuento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidadesDisponibles = unidadesDisponibles;
        this.stockMaximo = stockMaximo;
        this.descuento = descuento;
    }

    //Getters y Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precioUnitario=").append(precioUnitario);
        sb.append(", unidadesDisponibles=").append(unidadesDisponibles);
        sb.append(", stockMaximo=").append(stockMaximo);
        sb.append(", descuento=").append(descuento);
        sb.append('}');
        return sb.toString();
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id;
    }

    //hashCode

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Metodos

    /**
     * Método para vender una cantidad de producto, siempre que haya suficientes unidades disponibles
     * @param cantidad
     * @return true, si se puede vender. false, si no se puede vender
     */
    public boolean vender(int cantidad) {
        if (cantidad <= 0)
            return false;

        if ( cantidad > unidadesDisponibles )
            return false;

        this.unidadesDisponibles -= cantidad;
        return true;
    }

    /**
     * Método para incrementar el número de unidades disponibles hasta el máximo del stock
     * @return La diferencia entre el stock máximo y las unidades disponibles.
     */
    public int reponer() {
        int diferencia = this.stockMaximo - this.unidadesDisponibles;
        this.unidadesDisponibles = this.stockMaximo;

        return diferencia;
    }

}
