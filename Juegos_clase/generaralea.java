package Juegos_clase;

public class generaralea {

    public static int numaleatorio(int min, int max) throws Exception{

        if (min > max){

            throw new Exception("El valor minimo no puede ser mayor que el maximo");

        }

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        

    try {
        System.out.println(numaleatorio(1, 10));

    }catch(Exception e){

        System.out.println(e.getMessage());
        System.out.println("Error");
    }


    }
    
}
