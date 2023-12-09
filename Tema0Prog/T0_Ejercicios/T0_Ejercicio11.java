package Tema0Prog.T0_Ejercicios;

public class T0_Ejercicio11 {

    //11. Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.

    public static void main(String[] args) {
        
        double area, perimetro;
		double radio = 3.6;

        System.out.println("En este ejercicio calcularemos el Área y el Perímetro de un círculo: ");
        System.out.println("");

        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo es: " + area );
        
        perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro es: " + perimetro);



    }
    


    
}
