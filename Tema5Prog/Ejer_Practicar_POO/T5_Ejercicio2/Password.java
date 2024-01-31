package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio2;

public class Password {

    //Poropiedades
    private String password;
    private int longitud;

    //Constructores

    /**
     * Constructor por defecto
     */
    public Password() {
        this.longitud = 8;
        this.password = this.generarPassword();
    }

    /**
     * Contructor como parametro longitud
     * @param longitud
     */
    public Password(int longitud) {
        this.longitud = longitud;
        this.password = this.generarPassword();
    }

    /**
     * Constructor copia
     * @param passwd
     */

    public Password(Password passwd){
        this.longitud = passwd.getLongitud();
        this.password = passwd.getPassword();
    }

    //Getters and Setters
    public String getPassword() {
        return password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }


    //Metodo

    /**
     * Método para generar un numero aleatorio
     * @param password
     * @return numero aleatorio entre min y max
     */
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    /**
     * Método para generar contraseña aleatoria
     */
    private String generarPassword() {
        StringBuffer sb = new StringBuffer(this.longitud);
        for(int i = 0; i < this.longitud; i++) {
            sb.append(Character.toString(numaleatorio(32, 125)));

        }
        return sb.toString();
    }

    /**
     *
     */

    public boolean esFuerte(){

        int contadorMayus = 0;
        int contadorMinus = 0;
        int contadorNum = 0;
        int contadorSimbols = 0;

        for (int i = 0; i < this.password.length(); i++) {

            if((int) this.password.charAt(i) >= 48 && (int) this.password.charAt(i) <= 57) {
                contadorNum++;

            }else if ((int) this.password.charAt(i) >= 65 && (int) this.password.charAt(i) <= 90) {
                contadorMayus++;

            }else if ((int) this.password.charAt(i) >= 97 && (int) this.password.charAt(i) <= 122){
                contadorMinus++;

            }else {
                contadorSimbols++;
            }
        }

        return this.longitud >= 8 && contadorNum > 2 && contadorMayus >= 1 && contadorMinus > 2 && contadorSimbols >= 1;
    }

}
