package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio6;

import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion = 0;

        do {

                System.out.println("AGENDA TELEFÓNICA");
                System.out.println(" --------------------- ");
                System.out.println("1. Añadir un contacto");
                System.out.println("2. Listar todos los contactos");
                System.out.println("3. Eliminar un contacto");
                System.out.println("4. Buscar un contacto");
                System.out.println("5. Salir");
                System.out.println(" --------------------- ");
                System.out.print("Elige una opcion: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());

            }catch (Exception e) {
                System.out.println("Error al introducir la opcion, vuelva a ejecutar la Agenda");
                System.exit(1);
            }

            switch (opcion){

                case 1:
                    String nombre_contado = "";
                    String num_telefono = "";
                    int tipoContacto = 0;

                    System.out.println("Introduce el nombre del contacto: ");
                    nombre_contado = sc.nextLine();

                    System.out.println("Introduce el número de telefono del contacto: ");
                    num_telefono = sc.nextLine();

                    System.out.println("Introduce el tipo de contacto que deseas crear: \n");
                    System.out.println("1. Contacto tipo Persona");
                    System.out.println("2. Contacto tipo Empresa");
                    System.out.print("Tipo de contacto: ");
                    tipoContacto = Integer.parseInt(sc.nextLine());

                    switch (tipoContacto){

                        case 1:
                            String apodo = "";
                            System.out.println("Introduce el apodo del contacto: ");
                            apodo = sc.nextLine();

                            //Llamamos al metodo agregarContacto y agregamos un numero contactoPersona
                            agenda.addContacto(new ContactoPersona(nombre_contado, num_telefono, apodo));
                            System.out.println("Se ha creado el contacto: " + nombre_contado + " con numero de telefono " + num_telefono + " y con apodo "
                                    + apodo);
                            break;


                        case 2:
                            String cif = "";
                            String email = "";

                            System.out.println("Introduce el cif del contacto: ");
                            cif = sc.nextLine();
                            System.out.println("Introduce el email del contacto: ");
                            email = sc.nextLine();
                            //LLamamos al metodo agregarContacto y agregamos un numero contactoEmpresa
                            agenda.addContacto(new ContactoEmpresa(nombre_contado, num_telefono, cif, email));

                            break;

                    }

                    break;


                case 2:

                    System.out.println("----- CONTACTOS -----");
                    System.out.println(agenda.listarContactos());

                    break;

                case 3:
                    System.out.print("Introduce el nombre del contacto que deseas eliminar: ");
                    String nombre_eliminar = sc.nextLine();

                    Contacto contacto_eliminar = new Contacto(nombre_eliminar, null);
                    agenda.eliminarContacto(contacto_eliminar);
                    break;

                case 4:
                    System.out.println("Introduce el nombre contacto a buscar: ");

                    break;

                case 5:

                    System.out.println("Gracias por usar la Agenda, vuelva pronto");

                    break;

            }

        }while (opcion != 5);


    }
}
