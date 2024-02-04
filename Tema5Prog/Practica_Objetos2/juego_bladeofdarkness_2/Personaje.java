package Tema5Prog.Practica_Objetos2.juego_bladeofdarkness_2;

abstract class Personaje {

    //Propiedades
    protected String nombre;
    protected int nivel;
    protected double salud;

    //Constructor

    public Personaje(String nombre, double salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = 1;
    }

    public Personaje(String nombre, int nivel, double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public boolean reducirVida(int puntosD){

        boolean estaMuerto = false;
        double vidaTotal = this.salud - puntosD;

        if (vidaTotal <= 0){

            this.salud = 0.0;
            estaMuerto = true;
            System.out.println(this.getNombre() + " ha muerto!!!");

        }else {

            this.salud = vidaTotal;
        }

        return estaMuerto;
    }

    /**
     * Método para subir el nivel
     */
    public void subirNivel() {
        // Incrementamos el nivel en 1
        this.nivel++;

        // Calculamos la nueva salud elevando al nivel
        double nuevaSalud = 2.5 * Math.pow(this.nivel, 2);

        // Actualizamos la salud
        this.salud += nuevaSalud;

        // Comprueba si el nivel es máximo a 10
        if (this.nivel > 10) {
            this.nivel = 10;
        }
    }
    public abstract void golpear(Personaje personaje);


}
