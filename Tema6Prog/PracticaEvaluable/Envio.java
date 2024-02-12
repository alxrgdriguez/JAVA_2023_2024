package Tema6Prog.PracticaEvaluable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
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

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Envio{");
        sb.append("transportables=").append(transportables);
        sb.append(", fechaSalida='").append(fechaSalida).append('\'');
        sb.append(", fechaLlegada='").append(fechaLlegada).append('\'');
        sb.append(", esInternacional=").append(esInternacional);
        sb.append(", lt1=").append(lt1);
        sb.append('}');
        return sb.toString();
    }


    //Metodos

    /**
     * Método para agregar un transportable a la lista de transportables
     */

    public void agregarTransportable(Transportable item) {

        //Agregamos el transportable a la lista de transportables
        this.transportables.add(item);
        System.out.println("El transportable se agregó correctamente");
    }

    /**
     * Método para calcular el coste total del envio
     */

    /*public double calcularCostoTotalEnvio() {


    }*/

    /**
     * Metodo para listar Producutos
     */

    public void listarProductos() {

        for (int i = 0; i < this.transportables.size(); i++) {
            System.out.println(this.transportables.get(i).toString());
        }
    }

    /**
     * Metodo para ver los dias transcurridos desde la fecha de salida a la de llegada
     */

    public void diasTranscurridos() {

        LocalDate fechaSalida = LocalDate.parse(this.fechaSalida);
        LocalDate fechaLlegada = LocalDate.parse(this.fechaLlegada);
        Period periodo = Period.between(fechaSalida, fechaLlegada);
        System.out.println(periodo.getDays());

    }



}
