package Tema0Prog.T0_Ejercicios;

public class T0_Ejercicio15 {

    public static void main(String[] args) {
        
        /*15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
        2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerde que al pagarle los intereses el banco le
        retendrá el 18% para hacienda.*/


        double cuenta = 2000;
        double porcentaje = 0.0275;//2.75%
        double hacienda;//18% del total

        //Se calcula el total de intereses para 6 meses
        double seisMeses = cuenta * porcentaje / 12 * 6;

        //Sumamos los intereses a la cuenta
        cuenta = cuenta + seisMeses;
       
        //Calculamos hacienda
        hacienda = cuenta * 0.18;
        
        //Resultado final del dinero sacado a los 6 meses con hacienda e intereses
        cuenta = cuenta - hacienda;
        System.out.println("Despues de 6 meses tu cuenta es de: " + cuenta);





    }
    
}
