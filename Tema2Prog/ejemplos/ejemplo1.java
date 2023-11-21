package ejemplos;
import java.util.Scanner;
class EjercicioClase{

    /*
     * int --> Integer || Integer.parseInt(String) //Ejecutar enteros con nextLine
     * double --> Double || Double.parseDouble(String)
     * long --> Long Double || Long.parseLong(String)
     */


    public static void main(String[] args) {
        

       Scanner sc = new Scanner(System.in);

       int opcion = -1;
       String nombre = "";

        while (opcion != 3){

            System.out.println("------ MENU ------");
            System.out.println("Opcion 1) ");
            System.out.println("Opcion 2)");
            System.out.println("Salir");
            

        try{
            System.out.print("Introduce una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                
                System.out.println("Buenas tardes");
                break;

            case 2:

                System.out.println("Dime tu nombre: ");
                nombre = sc.nextLine();
                System.out.println("Buenas Tardes" + nombre);
                break;
        
            default:

                System.out.println("Adios, que tenga un buen día");
                break;

        }


        }catch (NumberFormatException e){

            System.out.println(e.getMessage());
            System.out.println("Te has equivocado en escribir la opcion, pornga (1,2 o 3)");
            

    }


            
       }
      

      sc.close();
    }
}