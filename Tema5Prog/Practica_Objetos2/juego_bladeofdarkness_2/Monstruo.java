package Tema5Prog.Practica_Objetos2.juego_bladeofdarkness_2;

public class Monstruo extends Personaje{

    //Propiedades
    public enum ClaseM {GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA}
    private ClaseM clasem;
    private int puntosD;

    //Constructor


    public Monstruo(String nombre, ClaseM clasem, int puntosD) {
        super(nombre,100.0);
        this.clasem = clasem;
        this.puntosD = puntosD;
    }

    //Getters and Setters

    public ClaseM getClasem() {
        return clasem;
    }

    public void setClasem(ClaseM clasem) {
        this.clasem = clasem;
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
     * Método para subir el nivel (Se sobreescribe el mismo metodo que en el padre porque el multiplicador entre montruos y jugadores no son iguales)
     */
    @Override
    public void subirNivel(){

        // Incrementamos el nivel en 1
        this.nivel++;

        // Calculamos la nueva salud elevando al nivel
        double nuevaSalud = 2 * Math.pow(this.nivel, 2);

        // Actualizamos la salud
        this.salud += nuevaSalud;

        // Comprueba si el nivel es máximo a 10
        if (this.nivel > 10) {
            this.nivel = 10;
        }
    }

    public void golpear(Personaje personaje){

        personaje.reducirVida(this.puntosD);

    }

}
