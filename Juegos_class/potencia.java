package Juegos_clase;

import java.util.Scanner;

public class potencia {

    /*Cuando me podría crear una funcion
     * 1. SI algo se va a repetir en el codigo, puede ser una funcion
     * 2. SI el problema es complejo, dividido en partes más pequeñas
     */
    public static double Potencia(double base, int exponente){

        double resulado = 1;
        for (int i = 0; i < exponente; i++){
            resulado = resulado * base;

        }return resulado;

    }

    public static void main(String[] args) {
        
        //Pedir al usuario una base y un exponente y devolver la potencia sin usar Math.pow

        double base;
        int exponente;
        double resulado;

        Scanner sc = new Scanner(System.in);

        try {
        System.out.println("Dime la base: ");
        base = Double.parseDouble(sc.nextLine());

        System.out.println("Dime la exponente: ");
        exponente = Integer.parseInt(sc.nextLine());

        //Llama a la funcion 
        resulado = Potencia(base, exponente);

        System.out.println("El resultado de la potencia es: " + resulado);

        }catch(Exception e){
            System.out.println("LA BASE DEBE SER UN DOUBLE Y EL EXPONENTE UN NUMERO ENTERO");
        }


        

    }
    
}
