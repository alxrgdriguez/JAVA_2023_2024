package EjerciciosRepaso_UT2;

public class Ejercicio6 {

    /**
     * Ejercicio6
     * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma:
       suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número
       de suficientes, el número de bienes, etc
     */

     public static String generarCalificacion(int numero){
        String calificacion = "";
        switch (numero) {
            case 1,2,3,4:
                calificacion = "Suspenso";
                break;
            case 5:
                calificacion =  "Suficiente";
                break;

            case 6:
                calificacion = "Bien";
                break;

            case 7,8:
                calificacion = "Notable";
                break;

            case 9,10:
                calificacion = "Sobresaliente";
                break;

            default:
                
                break;
        }

        return calificacion;
     }

     public static int GeneraNota(){

        return (int) (Math.random()*10+1);

     }
    public static void main(String[] args) {
        
        int numero = 0;
        int contadorSuspenso = 0;
        int contadorSuficiente = 0;
        int contadorBien = 0;
        int contadorNotable = 0;
        int contadorSobresaliente = 0;

        for (int i = 1; i<=20; i++){

            numero = GeneraNota();
            System.out.println(numero);

            switch (generarCalificacion(numero)) {
                case "Suspenso":

                    contadorSuspenso++;
                    break;

                case "Suficiente":

                    contadorSuficiente++;
                    break;

                case "Bien":

                    contadorBien++;
                    break;

                case "Notable":

                    contadorNotable++;
                    break;

                case "Sobresaliente":

                    contadorSobresaliente++;
                    break;
                
                default:

                    System.out.println("Error");
                    break;
            }

        }

        System.out.println("El total de suspensos es de: " + contadorSuspenso);
        System.out.println("El total de Suficientes es de: " + contadorSuficiente);
        System.out.println("El total de Bienes es de: " + contadorBien);
        System.out.println("El total de Notables es de: " + contadorNotable);
        System.out.println("El total de Sobresalientes es de: " + contadorSobresaliente);
    }
    
}
