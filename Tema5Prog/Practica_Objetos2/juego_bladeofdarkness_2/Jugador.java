package Tema5Prog.Practica_Objetos2.juego_bladeofdarkness_2;

public class Jugador extends Personaje {

    //Propiedades


    public enum Clase {MAGO, BRUJO, BARBARO, CABALLERO}

    private int experiencia;
    private Arma armaDerecha;
    private Arma armaIzquierda;

    //Constructor

    public Jugador(String nombre, int nivel, double salud, String nombre1) {
        super(nombre, nivel, salud);
    }




   public Jugador(String nombre) {
        super(nombre,200.0);
        this.experiencia = 0;
        this.armaDerecha = null;
        this.armaIzquierda = null;

   }

    //Getters and Setters
        public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
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



    public void golpear (Personaje personaje){
        if (this.getArmaDerecha() != null){
            personaje.reducirVida(this.getArmaDerecha().getPuntosD());
            if (! this.getArmaDerecha().isDosManos()){
                if (this.getArmaIzquierda() != null){

                    personaje.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
        //Comprobar si has matado al monstruo

        if (personaje.getSalud() <= 0){
            System.out.println("Has matado a " + personaje.getNombre());
            this.experiencia += personaje.getNivel() * 10;

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
