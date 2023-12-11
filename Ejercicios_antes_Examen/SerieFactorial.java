package Ejercicios_antes_Examen;

public class SerieFactorial {
    
    public static double factorial(int n) {
        int acumulador = 1;
        if (n==0) return 1;

        for(int i=n; i>1; i--) {
            acumulador *= i;
        }

        return acumulador;
    }

    public static void main(String[] args) {
        double x=0.25;
        double termino=0;
        //f(x) con x =3
        double total=0;

        System.out.println(Math.cos(x));

        for(int n=0; true; n++) {

            termino = Math.pow(-1, n) * ( Math.pow(x,2*n) / factorial(2*n) );
            
            total += termino;
            //System.out.println(total);

            if  ((Math.abs(Math.cos(x) - total)) < 0.0000005 ) {
                break;
            }

        }

        System.out.println(total);
    }
}
