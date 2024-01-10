package Curso_openwebinars.ProgramacionPOO;

public class Coche {

    //Propiedades
    private String marca;
    private String modelo;
    private int anio;


    //Constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    //Métodos
    public void arrancar(){

        System.out.println("El coche %s %s del año %d está arrancando".formatted(marca, modelo, anio));
    }
 
    
}
