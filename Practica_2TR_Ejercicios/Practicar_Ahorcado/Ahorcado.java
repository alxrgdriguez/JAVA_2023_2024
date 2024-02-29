package Practica_2TR_Ejercicios.Practicar_Ahorcado;

import java.util.ArrayList;
import java.util.Arrays;

public class Ahorcado {

    //Propiedades
    public enum Palabras {conejo, ahorcado, pez, sol, gallina, patata}

    private static final ArrayList<Palabras> palabras = new ArrayList<>(Arrays.asList(Palabras.values()));

    private String palabraAdivinar;

    private StringBuilder palabraIntentada;

    private int numFallos;

    private String[] letras;


    //Constructor
    public Ahorcado(){

        // Seleccionamos una palabra aleatoria del enum
        this.palabraAdivinar = palabras.get(numaleatorio(0, palabras.size() - 1)).toString();

        //Inicializamos el contador de fallos a 0
        this.numFallos = 0;

        // Inicializamos la palabra intentada con guiones
        this.palabraIntentada = new StringBuilder();
        for (int i = 0; i < this.palabraAdivinar.length(); i++) {
            this.palabraIntentada.append("-");

        }

        //Inicializamos el array de letras a 7

        this.letras = new String[7];

    }

    //Getters and Setters

    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public StringBuilder getPalabraIntentada() {
        return palabraIntentada;
    }

    public void setPalabraIntentada(StringBuilder palabraIntentada) {
        this.palabraIntentada = palabraIntentada;
    }

    public int getNumFallos() {
        return numFallos;
    }

    public void setNumFallos(int numFallos) {
        this.numFallos = numFallos;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }


    //Metodos

    /**
     * Metodo para devolver un numero aleatorio entero
     * @param min pasado por parámetro el minimo del rango
     * @param max pasado por parámetro el máximo del rango
     * @return un numero aleatorio entre los dos rangos
     */
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    /**
     * Metodo para probar la letra, si aciertas se cambiara el guion por la palabra si no se suman los intentos porque habrá fallado la letra
     * @param letra
     * @return Si es letra correcta cambia el guion por una letra sino se le suma intentos
     */
    public boolean probarLetra(char letra){

        boolean letraCorrecta = false;

        //Recorremos nuestra cadena de palabraAdivinar

        for (int i = 0; i < this.palabraAdivinar.length(); i++) {
            if (this.palabraAdivinar.charAt(i) == letra){

                //Usamos el StringBuilder para cambiar lo guiones por el caracter

                StringBuilder st = new StringBuilder(this.palabraIntentada);
                //Modificamos nuestra cadena cambiando el guion por el caracter correspondiente si es correcto
                st.setCharAt(i, letra);
                this.palabraIntentada = new StringBuilder(st.toString());
                letraCorrecta = true;
            }

            if (!letraCorrecta)
                this.numFallos++;
        }
        return letraCorrecta;
    }

    /**
     * Metodo que devuelve si la palabra la hemos acertado o no
     * @param palabra
     * @return
     */
    public boolean probarPalabra(String palabra){

        boolean palabraAcertada = false;

        //Nos recorremos toda la palabraAdivinar

        for (int i = 0; i < this.palabraAdivinar.length(); i++) {

                if (this.palabraAdivinar.equals(palabra)){

                    palabraAcertada = true;
                }
        }
        return palabraAcertada;

    }


}
