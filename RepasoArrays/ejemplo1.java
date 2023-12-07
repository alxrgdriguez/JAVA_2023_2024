package RepasoArrays;

import java.util.Arrays;

public class ejemplo1 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }
    public static void main(String[] args) {
        
        int[] numero = new int[5];
        int[] num = {4,5,1,6,3};

        for (int i = 0; i < numero.length; i++) {

            numero[i] = numaleatorio(1, 10);
            
        }

        System.out.println(Arrays.toString(numero));

    }
    
}
