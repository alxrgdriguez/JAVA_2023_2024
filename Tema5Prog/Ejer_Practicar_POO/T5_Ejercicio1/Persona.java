package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio1;

import java.util.Objects;

public class Persona {


    //Propiedades
    public enum Sexo {H, M, O}
    private String nombre;
    private int edad;
    private Sexo sexo;
    private String dni;
    private double peso;
    private double altura;

    //Constructores


    /**
     * Un constructor con el nombre, edad, dni, sexo, y el resto por defecto.
     */
    public Persona(String nuevoNombre, double peso, Sexo h, double v, int altura, int i) {
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

    /**
     * Un constructor copia
     */
    public Persona(Persona persona) {
        this.nombre = persona.getNombre();
        this.edad = persona.getEdad();
        this.sexo = persona.getSexo();
        this.dni = persona.getDni();
        this.peso = persona.getPeso();
        this.altura = persona.getAltura();
    }


    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    //Métodos

    /**
     * Método para calcular el peso ideal de la Persona
     */
    public int calcularIMC() {
        double IMC = this.peso / (this.altura * this.altura);

        if (IMC < 20) {
            return 1; // Peso ideal
        } else if (IMC >= 20 && IMC <= 25) {
            return 0; // Por debajo del peso ideal
        } else {
            return -1; // Sobrepeso
        }
    }

    /**
     * Método para decir si la Persona es mayor de edad o no
     */
    public boolean esMayorEdad() {

        boolean mayorEdad = false;

        if (this.edad >= 18) {
            return mayorEdad = true;

        }else {
            return mayorEdad;
        }

    }

    /**
     * Método para comprobar si el DNI es correcto
     */
    public boolean comprobarDNI() {

        if (this.dni.length() == 9) {
            return true;
        }else {
            return false;

        }
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", sexo=").append(sexo);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }
}
