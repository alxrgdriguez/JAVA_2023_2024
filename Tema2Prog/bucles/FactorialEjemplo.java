package bucles;
public class FactorialEjemplo {

    public static void main(String[] args) {
        
        // El factorial de un numero es la multiplicación de todos los anteriores factorial de 7 1x2x3x4x5x6x7
        //Numero del que queremos saber su factorial
        int numero = 7;

        //Acumulador de multiplicaciones
        double factorial = 1;

        for (int i = 1 ; i <= 7 ; i++){

            factorial = factorial * i;

        }

        System.out.println(factorial);


    }
    
}
