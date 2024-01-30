package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio1;

public class Persona {

    //Propiedades
    public enum Sexo{ H, M, O;}
    private String nombre;
    private int edad;
    private Sexo sexo;
    private String dni;
    private double peso;
    private int altura;

    //Constructores
    /**
     * Un constructor con el nombre, edad, dni, sexo, y el resto por defecto.
     */
    public Persona(double peso, int altura) {
        this.peso = peso;
        this.altura = altura;
        this.nombre = "Juan";
        this.sexo = Sexo.H;
        this.dni = "23821876Y";
        this.edad = 27;
    }

    /**
     * Un constructor con todos los miembros como parámetro
     */
    public Persona(String nombre, int edad, Sexo sexo, String dni, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
}
