import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        
        /*Ejercicio 5
        Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un
        número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por
        400. */

          //Declarar variables

          int anio;

          //Pedir año por pantalla
  
          Scanner sc = new Scanner(System.in);
      
          System.out.println("Introduce un año y te diré si es bisiesto o no: ");
          anio = sc.nextInt();
  
          //Ver si es bisiesto o no
  
          if (anio % 4 == 0 &&  (anio % 100 != 0 || anio % 400 == 0) ){
  
              System.out.println("El año " + anio +  " es bisiesto");
  
          }else{
  
              System.out.println("El año " + anio + " no es bisiesto");
          }

          sc.close();
    }
    
}
