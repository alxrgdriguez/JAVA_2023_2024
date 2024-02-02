package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio6;

import java.util.ArrayList;

public class Agenda {


    //Propiedades
    private ArrayList<Contacto> contactos;


    //Cosntructor
    public Agenda() {
        this.contactos = new ArrayList<>(); //Incializamos el ArrayList en el constructor
    }

    //Getters

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }


    //Metodos

    /**
     * Metodo para agregar un contacto a la agenda
     * @param c
     */
    public void addContacto(Contacto c) {

        contactos.add(c);
    }

    /**
     * Metodo para eliminar un contacto de la agenda
     * @param c
     */

    public void eliminarContacto(Contacto c) {

        contactos.remove(c);
    }

    /**
     * Metodo para verificar si existe un contacto en la agenda
     * @param c
     * @return
     */
    public boolean existeContacto(Contacto c) {
        if (contactos.indexOf(c) < 0) {
            System.out.println("El contacto no existe");
            return false;

        }else {
            System.out.println("El contacto existe");
            return true;
        }
    }

    public String listarContactos(){

        StringBuffer sb = new StringBuffer();

        for (Contacto c : contactos) {

            sb.append(c.pintar()).append("\n");
        }

        return sb.toString();
    }

    /*public boolean buscarContacto(Contacto c) {


    }*/






}
