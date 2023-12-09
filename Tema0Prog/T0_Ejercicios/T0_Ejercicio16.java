package Tema0Prog.T0_Ejercicios;

public class T0_Ejercicio16 {

    public static void main(String[] args) {
        
        /*16. Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
        que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
        para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.*/

        final double PI = 3.14; //final para que sea una constante (si es una constante, normalmente el nombre de la variable en mayuscula)
        double area, volumen, diametro = 15.5, altura = 42.4;
        double radio = diametro / 2;

        area = (2 * PI * radio * altura + 2 * PI * Math.pow(radio, 2));

        volumen = (PI * Math.pow(radio, 2) * altura);

        System.out.println("El área es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);







    }
    
}
