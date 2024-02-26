package EJERCICIOS_BUCLES_TEMA2;

class Ejercicio_12 {

    public static void main(String[] args) {
        
        int n = 3;

        for(int i = 0; i < n; i++) {
            //System.out.print("imprimir " + (n-i-1) + " espacios | ");

            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }

            for(int j=0; j < i+1; j++) {
                System.out.print("*");
            }

            for(int j=0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    
    }
}
    
