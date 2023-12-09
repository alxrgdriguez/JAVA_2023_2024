package Tema1Prog.T1_Ejercicios;
import java.util.Scanner;


public class T1_Ejercicio12 {

    public static void main(String[] args) {
        
        /*Ejercicio 12
        Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia
        d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar
        la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto
        determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro. */

        //Definimos las variables

        double velocidad1, velocidad2;
        double tiempo, diferenciaVelocidad;
        double distancia;

        // Pedimos los datos al usuario

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce la distancia a la que se encuentran situados ambos vehículos: ");
        distancia = sc.nextDouble();
        System.out.print("Introduce la Velocidad del coche 1 (km/h) (más rapido): ");
        velocidad1 = sc.nextDouble();
        System.out.print("Introduce la velocidad del coche 2 (km/h) (más lento): ");
        velocidad2 = sc.nextDouble();   

        //Realizamos calculos


        diferenciaVelocidad = (velocidad1 - velocidad2);

        tiempo = distancia / diferenciaVelocidad; //Tiempo en horas

        tiempo = (tiempo * 60); //Convertimos tiempo a minutos


        //Imprimimos por pantalla 
        System.out.println("Ambos vehículos coincidirán una vez transcurridos " + (int)tiempo + " minutos.");



    }

    
    
}
