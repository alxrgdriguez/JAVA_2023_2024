package Juegos_clase;

import java.util.Scanner;

public class EjercicioClase {

    public static int tiradas() throws Exception{

        return (int) Math.ceil(Math.random() * 6);

    }

    public static void main(String[] args) {
        
        /*Cubitus y Humerus juegan a los dados */
        /*1. Pedir el numero de turnos a jugar */
        /*2. Cubitus tira cuatro dados del 1 al 6 */
        /*3. Humerus tira 1 dado del 1 al 6 */
        /*4. Si el valor de las tirada de Humerus no está en ninguno de los dados de Cubitus, gana un punto  Humerus
         * Sino gana un punto Cubitus
         * 5. Muestra todas las tiradas, la puntuación en cada turno y el resultado final
         */

        Scanner sc = new Scanner(System.in);

        int numTurnos = 0;
        int tiradaJ1_1 = 0, tiradaJ1_2 = 0, tiradaJ1_3 = 0, tiradaJ1_4 = 0;
        int tiradaJ2 = 0;
        int totalCubitus = 0;
        int totalHumerus = 0;

        System.out.println("");
        System.out.print("Introduce el numero de turnos que quieres jugar: ");
       


        try{
        numTurnos = 0;
        
        if (numTurnos <= 0){

            throw new Exception("Debes escribir numeros positivos");
        }

        for (int i = 1; i <= numTurnos; i++){

            System.out.println("--------");
            System.out.println("Turnos " + i );
            System.out.println("--------");
            System.out.println();

            //Tiradas del jugador 1 Cubitus

            
            tiradaJ1_1 = tiradas();
            tiradaJ1_2 = tiradas();
            tiradaJ1_3 = tiradas();
            tiradaJ1_4 = tiradas();
            System.out.println("\nTiradas Cubitus " + " || " + tiradaJ1_1 + " || " + tiradaJ1_2 + " || " + tiradaJ1_3 +  " || " + tiradaJ1_4 + " ||");

            //Tiradas del jugador  2 Humerus

            tiradaJ2 = tiradaJ1_2;
            System.out.println("\nTiradas Humerus" + " || " + tiradaJ2 + " || ");

            if (tiradaJ2 != tiradaJ1_1 || tiradaJ2 != tiradaJ1_2 || tiradaJ2 != tiradaJ1_3 || tiradaJ2 != tiradaJ1_4 ){

                totalCubitus = (totalCubitus + 1);

            }else {

                
                totalHumerus = (totalHumerus + 1);
            }

            System.out.println("");
            System.out.println("Total de Puntos Cubitus: " + totalCubitus);
            System.out.println("Total de Puntos Humerus: " + totalHumerus);

            }

            }catch(Exception e){

               System.out.println(e.getMessage());
               System.out.println("Te has equivocado al poner el numero de turnos");

        }finally{
            sc.close();
        }


    }
    
}
