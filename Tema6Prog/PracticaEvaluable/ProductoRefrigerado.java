package Tema6Prog.PracticaEvaluable;

public class ProductoRefrigerado extends Producto {

    //Propiedades

    public enum NivelRefigerado {isotermica, frigorifica}

    private NivelRefigerado nivelRefigecion;

    //Constructor

    public ProductoRefrigerado(String nombre, double precio, NivelRefigerado nivelRefigecion) {
        super(nombre, precio);
        this.nivelRefigecion = nivelRefigecion;

    }

    //Getters and Setters

    public NivelRefigerado getNivelRefigecion() {
        return nivelRefigecion;
    }

    public void setNivelRefigecion(NivelRefigerado nivelRefigecion) {
        this.nivelRefigecion = nivelRefigecion;
    }


    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoRefrigerado{");
        sb.append("nivelRefigecion=").append(nivelRefigecion);
        sb.append('}');
        return sb.toString();
    }

    //Metodos

    /*public double calcularCosteEnvio(boolean esInternacional) {

        if (this.nivelRefigecion == NivelRefigerado.isotermica) {

            return calcularCosteEnvio(true) + 30;

        }
        if (this.nivelRefigecion == NivelRefigerado.frigorifica) {
            return calcularCosteEnvio(true) + 10;
        }
    }*/
}
