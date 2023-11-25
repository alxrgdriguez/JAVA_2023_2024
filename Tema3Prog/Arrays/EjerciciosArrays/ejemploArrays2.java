package Tema3Prog.Arrays.EjerciciosArrays;


public class ejemploArrays2 {

  public static int numaleatorio(int min, int max) {


        return (int) (Math.random() * (max - min + 1) + min);

    }
    public static void main(String[] args) {
        
        int notas[] = new int [10];

        notas [2] = 5;

        System.out.println(notas[2]);


        for(int i = 0; i<=9; i ++){

            notas[i] = numaleatorio(1, 10);

        }

         for(int i = 0; i<=9; i ++){

           System.out.println(notas[i]);

        }
       



    }
    
}
