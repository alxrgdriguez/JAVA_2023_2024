package EjerciciosRepaso_UT2;

public class Ejercicio3 {

    /**
     * Ejercicio3
     * Muestra todos los números divisibles entre 7 y entre el número 500 y el 1
     */
    public static void main(String[] args) {
        
    
        for(int i = 1; i <= 500; i++){

            if(i %7 == 0){

                System.out.println(i);
            }
        } 

        System.out.println();
        //Forma para ir del 500 al 1
        for(int i = 500; i>= 1; i--){

            if(i %7 == 0){

                System.out.println(i);
            }

        }


    }
    
}
