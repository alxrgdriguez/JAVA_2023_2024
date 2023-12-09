package Tema0Prog.T0_Ejercicios;

class T0_Ejercicio8{

    static int n1=50;
    public static void main(String[] args) {
        
        // 8. Modifica el siguiente programa para hacer que compile y funcione:

        //No funciona porque a n3 le falta otorgarle un valor, porque no se puedo sumar algo a la nada
        int n2=30, suma=0, n3 = 10;
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
        suma=suma+n3;
        System.out.println(suma);


    }






}