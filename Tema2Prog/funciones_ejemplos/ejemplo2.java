import java.util.Scanner;

public class ejemplo2 {

    public static double calculadora(double n1, double n2 , String op){

        double resultado;

        if (op.equals("+")){

            resultado = (n1 + n2);
            return resultado;

        }else if (op.equals("-")){

            resultado = (n1 - n2);
            return resultado;

        } else {

            return 0.0;
        }


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.println( calculadora(20, 66, "+"));
       System.out.println( calculadora(35, 89, "-"));

        
        

    sc.close();



    }
    
}
