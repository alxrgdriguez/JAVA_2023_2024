package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio2;

public class TestPassword {


    public static void main(String[] args) {
        Password pass1 = new Password(7);
        Password pass2 = new Password(12);

        System.out.println("Contraseña 1: " + pass1.getPassword());
        System.out.println("Contraseña 2: " + pass2.getPassword() + "\n");

        if (pass1.esFuerte()) {
            System.out.println("La contraseña " + pass1.getPassword() + " es fuerte");

        }else {
            System.out.println("La contraseña " + pass1.getPassword() + " no es fuerte");
        }

        if (pass2.esFuerte()) {
            System.out.println("La contraseña " + pass2.getPassword() + " es fuerte");

        }else {
            System.out.println("La contraseña " + pass1.getPassword() + " no es fuerte");
        }

    }

}
