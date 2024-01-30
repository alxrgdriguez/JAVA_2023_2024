package Tema4Prog.Ejemplos_BasicosPOO;

public class Jugador {

    //Propiedades
    private String nombre;
    private String nick;
    private String email;

    private int edad;
    private int ranking;
    private String juego_favorito;

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getJuego_favorito() {
        return juego_favorito;
    }

    public void setJuego_favorito(String juego_favorito) {
        this.juego_favorito = juego_favorito;
    }

    //Constructor

    public Jugador(String nombre, String nick, String email, int edad, int ranking, String juego_favorito) {
        this.nombre = nombre;
        this.nick = nick;
        this.email = email;
        this.edad = edad;
        this.ranking = ranking;
        this.juego_favorito = juego_favorito;
    }

    //ToString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", ranking=").append(ranking);
        sb.append(", juego_favorito='").append(juego_favorito).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
