public class Ejercicio6 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        
    /*Ejercicio 6. Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
    segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.*/

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){

            numeros[i] = numaleatorio(1, 99);

        }



    }
    
}
