package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio7;

public class Incidencia {

    //Propiedades
    private int codigo;
    private String estado;
    private String problema;
    private String solucion;

    // Propiedad estática para contar incidencias pendientes
    private static int pendientes = 0;

    //Constructor
    public Incidencia(int codigo, String estado, String problema, String solucion) {
        this.codigo = codigo;
        this.estado = estado;
        this.problema = problema;
        this.solucion = solucion;

        //Incrementamos la Incidencias pendientes
        Incidencia.pendientes++;
    }

    //Métodos

    /**
     * Método estático que decrementa el contador de pendientes
     */
    public void resuelve(){

        if (Incidencia.pendientes > 0){

            Incidencia.pendientes--;

        }else {
            System.out.println("No hay incidencias pendientes");
        }
    }

    /**
     * Método estático que devuelve el número de incidencias pendientes de resolver
     */
    public static void setPendientes(int pendientes) {
        Incidencia.pendientes = pendientes;
    }


    //Getters and Setters

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProblema() {
        return this.problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return this.solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public static int getPendientes() {
        return pendientes;
    }


    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo=").append(codigo);
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }


}

