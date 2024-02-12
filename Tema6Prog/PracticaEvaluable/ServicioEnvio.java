package Tema6Prog.PracticaEvaluable;
import java.util.ArrayList;

public class ServicioEnvio {

    //Propiedades

    private ArrayList<Envio> envios;

    //Constructor

    public ServicioEnvio(ArrayList<Envio> envios) {
        this.envios = envios;
    }

    //Getters

    public ArrayList<Envio> getEnvios() {
        return envios;
    }

    //Metodos

    /**
     * Método para agregar un envio a la lista de envios
     */

    public void agregarEnvio(Envio envio) {

        //Agregamos el envio a la lista de envios
        this.envios.add(envio);
        System.out.println("El envio se agregó correctamente");
    }

    /**
     * Método para generar informe de envios
     */
}
