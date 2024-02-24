package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

public class Episodio {

    //Propiedades
    private String titulo;
    private String duracion;
    private Temporada temporada;

    //Constructor

    /**
     * Constructor por defecto
     */

    public Episodio(){

        this.titulo = "La revelión";
        this.duracion = "45 minutos";
        this.temporada = new Temporada();
    }

    /**
     * Constructor parametrizado con título y duración
     */

    public Episodio(String titulo, String duracion){
        this.titulo = titulo;
        this.duracion = duracion;
        this.temporada = new Temporada();
    }

    //Getters and Setters

    public String getTitulo(){
        return this.titulo;
    }

    public String getDuracion(){
        return this.duracion;
    }

    public Temporada getTemporada(){

        return this.temporada;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracion(String duracion){
        this.duracion = duracion;
    }

    public void setTemporada(Temporada temporada){
        this.temporada = temporada;
    }

    //toString
    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer("Episodio{");
        sb.append("titulo=").append(titulo);
        sb.append(", duracion=").append(duracion);
        sb.append(", temporada=").append(this.temporada.getNumero());
        sb.append('}');
        return sb.toString();
    }

}
