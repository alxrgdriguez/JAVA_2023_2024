package EjerciciosRepaso_UT2;

public class Ejercicio5 {

    /**
     * Ejercicio 5
     * Realiza una función que calcule el máximo de tres números. Pruébala
     */

     public static void maximoDeTres(int num1, int num2, int num3){

        int mayor = Integer.MIN_VALUE;

        if (num1 > mayor){

            mayor = num1;
        }

        if (num2 > mayor){

            mayor = num2;
        }

        if (num3 > mayor){

            mayor = num3;
        }

        System.out.println(mayor);

     }
    public static void main(String[] args) {
        

        System.out.print("El mayor es: ");
        maximoDeTres(40, 69, 99);

    }
    
}
