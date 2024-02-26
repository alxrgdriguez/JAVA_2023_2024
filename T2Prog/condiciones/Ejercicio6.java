import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        
        /*Ejercicio 6
        La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual
        se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del
        producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un
        productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo
        A,se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de 
        tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
        cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida. */

        // Declaramos las variables
        int kilos;
        String tipo;
        int tamaño;
        double precioInicial;
        double ganancia = 0;

        // Leemos las entradas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilos de uva entregada: ");
        kilos = sc.nextInt();
        System.out.println("Ingrese el tipo de uva (A o B): ");
        tipo = sc.next();
        System.out.println("Ingrese el tamaño de la uva (1 o 2): ");
        tamaño = sc.nextInt();
        System.out.println("Ingrese el precio inicial del kilo de uva: ");
        precioInicial = sc.nextDouble();

        // Calculamos la ganancia
        if (tipo.equals("A")) {
            if (tamaño == 1) {
                ganancia = kilos * precioInicial + kilos * 0.2;
            } else if (tamaño == 2) {
                ganancia = kilos * precioInicial + kilos * 0.3;
            }
        } else if (tipo.equals("B")) {
            if (tamaño == 1) {
                ganancia = kilos * precioInicial - kilos * 0.3;
            } else if (tamaño == 2) {
                ganancia = kilos * precioInicial - kilos * 0.5;
            }
        } else {
            System.out.println("Tipo de uva incorrecto");
           
        }

        // Imprimimos la salida
        System.out.println("La ganancia obtenida es de: " + ganancia);

        sc.close();
    }
    
}
