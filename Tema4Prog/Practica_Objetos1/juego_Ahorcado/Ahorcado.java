package Tema4Prog.Practica_Objetos1.juego_Ahorcado;

public class Ahorcado {

    //Propiedades
    private static String[] palabras = {"regla", "animal", "peces","pepinos","aguacate","coche","programacion"};

    private String palabraAdivinar;

    private String palabraIntentada;

    private int numFallos;

    private String[] letras;


    //Constructores
    public Ahorcado() {

        //Recuperamos aleatoriamente un valor del array
        this.palabraAdivinar = this.palabras[numaleatorio(0,this.palabras.length-1)];

        this.palabraIntentada = "";
        //Hacemos un bucle for para pintar la cantidad de guiones segun el tamaño de la palabraAdivinar
        for (int i = 0; i < this.palabraAdivinar.length(); i++){
            //Asignamos a cada letra los "-" rallitas
            this.palabraIntentada += "-";
        }

        //Inicializamos el contador fallos a 0
        this.numFallos = 0;

        //Damos el valor a nuestro array de letras maximo de 7
        this.letras = new String[7];

    }

    //Getters and Setters

    public String getPalabraAdivinar() {
        return this.palabraAdivinar;
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public String getPalabraIntentada() {
        return this.palabraIntentada;
    }

    public void setPalabraIntentada(String palabraIntentada) {
        this.palabraIntentada = palabraIntentada;
    }

    public int getNumFallos() {
        return this.numFallos;
    }

    public void setNumFallos(int numFallos) {
        this.numFallos = numFallos;
    }



    //Metodos
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public boolean probarLetra(char letra){

        boolean letraCorrecta = false;

        //Recorremos cada caracter de la palabra
        for (int i = 0; i < this.palabraAdivinar.length(); i++) {
            //Si el caracter a la posicion i coincide con la letra pasada por parametro, remplazamos el guion por la letra.
            if (this.palabraAdivinar.charAt(i) == letra){
                //Usamos el StringBuilder para remplazar el guion actual por la letra
                StringBuilder st = new StringBuilder(palabraIntentada);
                st.setCharAt(i,letra);
                //Convertimos el StringBuilder a String
                palabraIntentada = st.toString();

                letraCorrecta = true;
            }
        }
        //Si no ha encontrado ninguna letra, incrementamos los fallos
        if (letraCorrecta == false){
            this.numFallos++;
        }
        return letraCorrecta;
    }

    public boolean probarPalabra(String palabra){

        boolean acertado = false;

        if (this.palabraAdivinar.equals(palabra))
            acertado = true;

        return acertado;
    }

}
