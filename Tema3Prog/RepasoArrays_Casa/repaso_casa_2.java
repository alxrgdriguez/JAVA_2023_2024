package Tema3Prog.RepasoArrays_Casa;

public class repaso_casa_2 {

    public static void main(String[] args) {

    /**
     * Ejercicio 2:
    Crear un array de números enteros e imprimir en la consola solo los números pares
     */
    
    int numeros[] = {32, 57, 99, 69, 12,31};

    System.out.print("Los numeros pares son: ");

    for (int num : numeros) {
        if (num % 2 == 0) {
            System.out.print(num+" " );
        }
    }

}

    
    

}
