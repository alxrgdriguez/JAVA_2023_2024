package Tema4Prog.Practica_Objetos1.juego_bladeofdarkness;

public class Jugador {

    //Propiedades

    private String nombre;

    public enum Clase {MAGO, BRUJO, BARBARO, CABALLERO}

    private int nivel;
    private int experiencia;
    private double salud ;
    private Arma armaDerecha;
    private Arma armaIzquierda;

    //Constructor

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.experiencia = 0;
        this.salud = 200;
        this.armaDerecha = null;
        this.armaIzquierda = null;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }


    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }


    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();

    }

    //Metodos

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

    /**
     * Método para equipar un arma, ya sea en la mano derecha o en la mano izquierda
     */
    public boolean equipar(Arma arma) {

        boolean estaEquipada = false;

        //Primer caso -->
        //1. Comprobar si el arma está libre a dos manos
        //2. Solo se puede poner si están libres las dos manos
        //3. Si estan libres las dos se pondrá la misma arma
        // Importante: Se empieza equipar por la derecha

        if (arma.isDosManos() == true){

            if (this.armaDerecha == null && this.armaIzquierda == null){

                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                estaEquipada = true;
            }
        }else {

            //Segundo caso -->
            //1.Si el arma derecha está libre
            //2.Si el arma izquierda está libre
            //3.Si están ocupados los dos

            if (this.armaDerecha == null){

                this.armaDerecha = arma;
                estaEquipada = true;

            } else if (this.armaIzquierda == null) {

                this.armaIzquierda = arma;
                estaEquipada = true;

            }
        }
        if (estaEquipada == false){
            System.out.println("No se puede equipar el arma");

        }
        return estaEquipada;

    }

    public void tomarPocion(int puntosS){

        double vidaTotal = this.salud + puntosS;

        if (vidaTotal > 10000){

            this.salud = 10000;

        }else {

            this.salud = vidaTotal;
        }

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

    public void golpear(Monstruo monstruo){

        if (this.getArmaDerecha() != null){
            monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            if (! this.getArmaDerecha().isDosManos()){
                if (this.getArmaIzquierda() != null){

                    monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }



        //Comprobar si has matado al monstruo

        if (monstruo.getSalud() <= 0){
            System.out.println("Has matado a " + monstruo.getNombre());
            this.experiencia += monstruo.getNivel() * 10;

            //Comprobar que no se pasa el experiencia maxima

            if (this.experiencia > 1000){

                this.experiencia = 1000;

            }

            //Calculamos el nivel *NOTA*: Para saber como hemos sacado el nivel actual dividimos la experiencia actual entre 100

            int calculoNivel = this.experiencia / 100;

            for(int i = 0; i< calculoNivel; i++){
                subirNivel();
                System.out.println("Has subido de un nivel");
            }

        }
    }




}
