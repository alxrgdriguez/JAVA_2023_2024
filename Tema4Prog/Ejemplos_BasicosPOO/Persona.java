package Tema4Prog.Ejemplos_BasicosPOO;

public class Persona {

    //PROPIEDADES
    private String nombre;
    private String apellidos;
    private  int edad;
    private double altura;
    private  String ciudad;
    private  String email;

    //CONSTRUCTOR
    Persona(){

        this.nombre = "a";
        this.apellidos = "e";
        this.edad = 20;
        this.altura = 180;
        this.ciudad = "as";
        this.email = "ddwa@gmail.com";
    }

    Persona(String nombre, String apellidos, int edad, double altura, String ciudad, String email){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
        this.ciudad = ciudad;
        this.email = email;
    }


    //GETTERS AND SETTERS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;


    }

    //TOSTRING
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", altura=").append(altura);
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
