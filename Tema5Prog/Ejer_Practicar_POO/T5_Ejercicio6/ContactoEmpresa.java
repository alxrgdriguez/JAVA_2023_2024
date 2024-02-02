package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio6;

public class ContactoEmpresa extends Contacto {

    //Propiedades

    private String cif;

    private String email;

    //Constructor

    public ContactoEmpresa(String nombre, String telefono, String cif, String email) {
        super(nombre, telefono);
        this.cif = cif;
        this.email = email;
    }

    //Metodos
    @Override
    public String pintar() {
        StringBuffer sb = new StringBuffer(super.pintar());
        sb.append("Cif: ").append(cif).append("\n");
        sb.append("Email: ").append(email).append("\n");
        return sb.toString();
    }



}
