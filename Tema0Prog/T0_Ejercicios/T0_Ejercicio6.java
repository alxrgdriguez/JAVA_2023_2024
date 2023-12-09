package Tema0Prog.T0_Ejercicios;

public class T0_Ejercicio6 {

    public static void main(String[] args) {

        // 6. ¿Qué muestra por pantalla el siguiente programa?
        
        //Imprime por pantalla un saludo de Bienvenida
        System.out.println("Hola usuario."+" Bienvenido.");

        // Declara una variable cadena llamada 'dia' es igual a 'Lunes'
        String dia = "Lunes"; 

        //Se imprimira por pantalla 'Hoy es Lunes' ya que día = Lunes
        System.out.println("Hoy es " + dia); 

        //Declara una variable entera llamada 'hora' con valor 12
        int hora = 12;

        // Imprime por pantalla 'Son las 12 en punto' porque hora = 12
        System.out.println("Son las " + hora + " en punto.");

        //Imrpime 'Dentro de 2 horas serán las 122 en punto' porque concatena con 2
        System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto");

        //Imprime 'Dentro de 2 horas serán las 14 en punto' Porque al estar entre parentesis hace la operación 12+2=14
        System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto");   

    }
    
}
