package Monopoly_scrum;

public class CasillaCarta extends CasillaEspecial {

    private String accion;

    //Constructor de CasillaCarta --> Padre CasillaEspecial

    public CasillaCarta(String nombre, int numero, int cantidad, String accion) {
        super(nombre, numero, cantidad);
        this.accion = accion;
    }

    //Getters y Setters de CasillaCarta

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
}
