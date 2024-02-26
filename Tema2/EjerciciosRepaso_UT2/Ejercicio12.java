package EjerciciosRepaso_UT2;



public class Ejercicio12 {

    public static int numaleatorio(int min, int max) {


        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        
        int tirada1 = 1, tirada2 = 0, tirada3 = 0;
        int intentos = 0;

      

        while((tirada1 != tirada2) || (tirada2 != tirada3) || (tirada1 != tirada3)){

            intentos++;

            System.out.println("Intentos: " + intentos);
            tirada1 = numaleatorio(1, 6);
            System.out.println("Tirada 1: " + tirada1);
            tirada2 = numaleatorio(1, 6);
            System.out.println("Tirada 2: " + tirada2);
            tirada3 = numaleatorio(1, 6);
            System.out.println("Tirada 3: " + tirada3);
            System.out.println();
            
        }

        System.out.println("Intentos: " + intentos);

    }
    
}
