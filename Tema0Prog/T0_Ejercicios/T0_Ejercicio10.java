package Tema0Prog.T0_Ejercicios;

public class T0_Ejercicio10 {

    public static void main(String[] args) {
        
        int num=5;
        num += num - 1 * 4 + 1; 

        System.out.println(num); /*La operación se quedaría como 7 */

        num=4;
        num %= 7 * num % 3 * 5; 
        System.out.println(num); /*Se quedaría como 4 */



    }
    
}
