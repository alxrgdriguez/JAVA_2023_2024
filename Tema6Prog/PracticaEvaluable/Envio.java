package Tema6Prog.PracticaEvaluable;
import java.time.LocalTime;
import java.util.ArrayList;
public class Envio {

    //Propiedades

    private ArrayList<Transportable> transportables;

    private String fechaSalida;

    private  String fechaLlegada;

    private  boolean esInternacional;

    LocalTime lt1 = LocalTime.now();

    //Constructor

    public Envio() {

        // La fecha de salida es la fecha actual
        this.fechaSalida = LocalTime.now().toString();
        //La fecha de llegada es null
        this.fechaLlegada = null;
    }

    //Getters and Setters


    public ArrayList<Transportable> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<Transportable> transportables) {
        this.transportables = transportables;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public boolean isEsInternacional() {
        return esInternacional;
    }

    public void setEsInternacional(boolean esInternacional) {
        this.esInternacional = esInternacional;
    }

    //Metodos


}
