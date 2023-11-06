package EjerciciosRepaso_UT2;

public class Ejercicio2 {

    /**
     * Ejercicio2
     * Realiza un programa que genere 20 números aleatorios entre 1 y 200, que diga cuántos números pares
       han salido y cuántos impares.
     */

    public static int numerosAleatorios(){

        return (int) (Math.random()*200+1);

    }

    public static void main(String[] args) {

        int numero = 0;
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < 20; i++){

            numero = numerosAleatorios();
            //Para comprobar los numeros que han salido
            System.out.println(numero);

            if (numero % 2 == 0){

                contadorPares++;
                
            }else{

                contadorImpares++;
            }

        }
        
        System.out.println("Los numeros pares introducidos son: " + contadorPares);
        System.out.println("Los numeros impares introducidos son: " + contadorImpares);


    }
    
}
