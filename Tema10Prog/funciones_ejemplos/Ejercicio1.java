import java.util.Scanner;

public class Ejercicio1 {

    public static int generarTirada(){

        //Generar un numero aleatorio para la tirada
        int tirada = (int) (Math.random()* 10) + 1;

        return tirada;

    }



    public static void main(String[] args) {
        
        /*int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>; */

        Scanner sc = new Scanner(System.in);

        int numTurnos;
        int tirada1, tirada2;
        int totalJugador1 = 0, totalJugador2 = 0;
        int totalEmpate = 0;

        System.out.println("Introduce la cantidad de turnos que tendrá la partida: ");
        numTurnos = sc.nextInt();

        for (int i = 1; i <= numTurnos; i++){

            System.out.println("Turnos " + i);

            tirada1 = generarTirada();
            tirada2 = generarTirada();

            System.out.println("\nCubitus (j1) " + tirada1 + " Humerus (j2) " + tirada2);


            if (tirada1 > tirada2){
                System.out.println("Este turno lo gana Cubitus\n");
                totalJugador1 = totalJugador1 + (tirada1 + tirada2);

                if (totalEmpate > 0){
                    totalJugador1 = totalJugador1 + totalEmpate;
                    totalEmpate = 0;

                }

            }else if (tirada2 > tirada1){

                System.out.println("Este turno lo gana Humerus\n");
                totalJugador2 = totalJugador2 + (tirada1 + tirada2);

                if (totalEmpate > 0){
                    totalJugador2 = totalJugador2 + totalEmpate;
                    totalEmpate = 0;

                }

            }else {

                totalEmpate = totalEmpate + (tirada1 + tirada2);
            }

           

            System.out.println("Cubitus lleva " + totalJugador1);
            System.out.println("Humerus lleva " + totalJugador2);
            System.out.println("");
        
        }

         //Pintar total de cada jugar
        System.out.println("El total de Cubitus es " + totalJugador1);
        System.out.println("El total de Humerus es " + totalJugador2);


        sc.close();

    }
    
}
