package Tema6Prog.PracticaEvaluable;

public class ProductoFragil extends Producto{

    //Propiedades

    public enum NivelProducto {fragil, muyfragil}

    public NivelProducto nivelFragil;

    //Constructor


    public ProductoFragil(String nombre, double precio, NivelProducto nivelFragil) {
        super(nombre, precio);
        this.nivelFragil = nivelFragil;
    }

    //Getters and Setters

    public NivelProducto getNivelFragil() {
        return nivelFragil;
    }

    public void setNivelFragil(NivelProducto nivelFragil) {
        this.nivelFragil = nivelFragil;
    }


    //Metodos

    @Override
    public double calcularCosteEnvio(boolean esInternacional) {

        if (this.nivelFragil == NivelProducto.fragil) {
            return super.calcularCosteEnvio(esInternacional) + 20;
        }

        if (this.nivelFragil == NivelProducto.muyfragil) {
            return super.calcularCosteEnvio(esInternacional) + 50;
        }

        return calcularCosteEnvio(true);

    }
}
