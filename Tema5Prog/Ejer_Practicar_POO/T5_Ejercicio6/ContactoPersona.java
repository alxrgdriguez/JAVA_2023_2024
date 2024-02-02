package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio6;

public class ContactoPersona extends Contacto {

    //Propiedades

    private String apodo;

    //Contructor

    public ContactoPersona(String nombre, String telefono, String apodo) {
        super(nombre, telefono);
        this.apodo = apodo;
    }

    //Getters and Setters

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    //Metodos

    /**
     * Metodo para pintar el apodo del contactoPersona
     * @return
     */
    @Override
    public String pintar() {

        StringBuffer sb = new StringBuffer(super.pintar());
        sb.append("Apodo: " + apodo + "\n");
        return sb.toString();
    }

}
