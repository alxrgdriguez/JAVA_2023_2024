package ejemplos;
class if_ejemplo{


    public static void main(String[] args) {
        
        int a = 5;

        if (a == 5) {
            System.out.println("La variale es igual a 5");
        }

        if (a > 6) {
            System.out.println("La variable es mayor que 6");
        } else {
            System.out.println("La variabe es menor que 7");
        }

        if (a > 6) {
            System.out.println("La variable es mayor que 6");
        } else if (a == 6) {
            System.out.println("La variable es igual a 6");
        } else {
            System.out.println("La variable es menor que 6");
        }



    }




}