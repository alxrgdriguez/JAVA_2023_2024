package IntelliJ_2TR.Lingo;

import java.util.ArrayList;

/**
 * Clase para implementar un juego, en el que tienes que adivinar una palabra de 5 letras
 * Generamos una aleatoria de un diccionario de palabras
 * le pedimos al usuario que intente adivinar la palabra.
 * Tras el intento le indicamos el numero de aciertos
 */


public class Lingo {

    //Propiedades
    private ArrayList<String> palabras = new ArrayList<String>();
    private String palabraAcertar;
    private static int partidasGanadas = 0;

    //Constructor
    public Lingo() {

        palabras.add("lunes");
        palabras.add("ringo");
        palabras.add("bingo");
        palabras.add("perro");
        palabras.add("cerdo");
        palabras.add("pedal");
        palabras.add("arroz");
        palabras.add("censo");

        //Recuperamos aleatoriamente un valor del array
        this.palabraAcertar = palabras.get(numaleatorio(0,palabras.size()));

    }

    //Getters and Setters

    public String getPalabraAcertar() {
        return palabraAcertar;
    }

    public void setPalabraAcertar(String palabraAcertar) {
        this.palabraAcertar = palabraAcertar;
    }

    public static int getPartidasGanadas() {
        return partidasGanadas;
    }

    public static void setPartidasGanadas(int partidasGanadas) {
        Lingo.partidasGanadas = partidasGanadas;
    }

    //Metodos
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

}
