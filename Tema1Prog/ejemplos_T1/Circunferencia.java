package Tema1Prog.ejemplos_T1;
class circunferencia {

    public static void main (String[] args) { 
       
        //Definimos las variables 

        double radio, superficie, longitud;

        radio = 7;

        //Calculamos la superficie y la longitud

        superficie = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;

        //Imprimimos por pantalla los resultados de la superficie y longitud

        System.out.println("La superficie es " + superficie);
        System.out.println("La longitud es " + longitud);
        

    }

}