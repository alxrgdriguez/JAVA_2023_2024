package Juegos_clase;

public class ejercicioClase1 {

    public static void main(String[] args) {
        
        boolean resultado;
        double temperatura, humedad;

        temperatura = 20.4;
        humedad = 0.66;

        //1º Escribe una condición que diga si la temperatura es mayor a 18

        resultado = (temperatura > 18);
        System.out.println("El ejercicio 1 es: " + resultado);

        //2º Escibre una condición que diga si la temperatura es menor o igual que 21

        resultado = (temperatura <= 21);
        System.out.println("El ejercicio 2 es: " + resultado);

        //3º Escribe una condición que diga si la humedad es igual a 66%

        resultado = (humedad == 0.66);
        System.out.println("El ejercicio 3 es: " + resultado);

        //4º Escribe una condición que diga si la humedad no es igual a 66%

        resultado = (humedad != 0.66);
        System.out.println("El ejercicio 4 es: " + resultado);

        //5º Escribe una condición que diga si la temperatura está entre 20 y 25 grados

        resultado = (temperatura >= 20) && (temperatura <= 25);
        System.out.println("El ejercicio 5 es: " + resultado);

        //6º Escribe una condición que diga si la temperatura está entre 20 y 25 grados y la humedad es mayor del 50%

        resultado = (temperatura >= 20) && (temperatura <= 25) && (humedad > 0.50);
        System.out.println("El ejercicio 6 es: " + resultado);

        //7º Escribe una condición que diga si la temperatura es menor de 30 o la humedad es mayor de 70%

        resultado = (temperatura < 30) || (humedad > 0.70);
        System.out.println("El ejercicio 7 es: " + resultado);



    }
    
}
