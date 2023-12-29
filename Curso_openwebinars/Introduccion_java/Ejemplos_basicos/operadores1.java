package Curso_openwebinars.Introduccion_java.Ejemplos_basicos;

public class operadores1 {

    public static void main(String[] args) {
        
        //Variable final constante no cambia el valor, siempre es 30
        final int temperatura_alta = 30;

        int temperatura = 20;

        // "var" es una variable de cualquier tipo (int - double - float - long)
        // "?" como que pregunta a la condición si es true o false
        // Ejemplo de los ':' -->  "TRUE" : "FALSE" entonces, si se cumple devuelve TRUE SINO FALSE
        var laTemperatura = (temperatura > temperatura_alta) ? "Es alta" : "Es normal";

        System.out.println(laTemperatura); 

    }
    
}
