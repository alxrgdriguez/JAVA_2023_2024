package Tema3Prog.Arrays.EjerciciosArrays;
import java.util.Arrays;

public class EjerciciosClase2 {


    public static int numaleatorio() {


        return (int) ((Math.random() )*6) +1;

    }

    public static void main(String[] args) {
        
        /*2. Lanza 5 dados de póker (. J Q R Negro Rojo) 
        * genera las tiradas y detecta si ha salido poker 
        */

        int tiradas[] = new int [5];

        for(int i = 0; i < tiradas.length; i++){

            tiradas[i] = numaleatorio();
        }

        System.out.println(Arrays.toString(tiradas));
       
        //Ordenar el array para que haya solo dos convinaciones 

        Arrays.sort(tiradas);

       if ((tiradas[0] == tiradas[1] && tiradas[0] == tiradas[2] && tiradas[0] == tiradas[3]) || (tiradas[1] == tiradas[2] &&
       tiradas[1] == tiradas[3] && tiradas[1] == tiradas[4])){

            System.out.println("POKER");

       }else{

        System.out.println("No es POKER");
       }

    }
    
}
