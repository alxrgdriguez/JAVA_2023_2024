package Tema4Prog.Practica_Objetos1.juego_bladeofdarkness;

public class Monstruo {

    //Propiedades
    private String nombre;
    public enum ClaseM {GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA}
    private ClaseM clasem;
    private int nivel;
    private double salud;
    private int puntosD;

    //Constructor


    public Monstruo(String nombre, ClaseM clasem, int puntosD) {
        this.nombre = nombre;
        this.clasem = clasem;
        this.puntosD = puntosD;
        this.nivel = 1;
        this.salud = 100.0;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClaseM getClasem() {
        return clasem;
    }

    public void setClasem(ClaseM clasem) {
        this.clasem = clasem;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clasem=").append(clasem);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    //Métodos

    /**
     * Método para subir el nivel
     */
    public void subirNivel(){

        // Incrementamos el nivel en 1
        this.nivel++;

        // Calculamos la nueva salud elevando al nivel
        double nuevaSalud = 2.5 * Math.pow(this.nivel, 2);

        // Actualizamos la salud
        this.salud = nuevaSalud;

        // Comprueba si el nivel es máximo a 10
        if (this.nivel > 10) {
            this.nivel = 10;
        }
    }

    public boolean reducirVida(int puntosD){

        boolean estaMuerto = false;
        double vidaTotal = this.salud - puntosD;

        if (vidaTotal <= 0){

            this.salud = 0.0;
            estaMuerto = true;

        }else {

            this.salud = vidaTotal;
        }

        return estaMuerto;

    }

    public void golpear(Jugador jugador){

        jugador.reducirVida(this.puntosD);

    }

}
