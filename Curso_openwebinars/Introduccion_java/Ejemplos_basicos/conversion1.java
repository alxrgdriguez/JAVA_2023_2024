package Curso_openwebinars.Introduccion_java.Ejemplos_basicos;
class conversion{

    public static void main(String[] args) {
        
        //-------------------------------------------
        /*
         * Ejemplo. Conversiones de tipos de datos
         */
        //-------------------------------------------

        System.out.println("--- CONVERSIONES ---");

        //Conversion sin perdida de información de int a long

        int i = 1234567;
        long l = i;

        System.out.println("\nConversion de int --> long");
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de l: " + l);
        System.out.println();

        //Conversion con perdida de informacion de long a float
        
        long l2 = 1234567232113131l;
        System.out.println("\nConversion de long --> float");
        System.out.println("Valor de l2:  " + l2);
        float f2 = l2;
        System.out.println("Valor long pasado a float");
        System.out.printf("%.2f", f2);
        System.out.println("\n");

        //Conversion sin perdida de informacion de long a double

        double d2 = l2;
        System.out.println("Conversion de long --> double");
        System.out.println("Valor de l2: " + l2);
        System.out.println("Valor long pasado a double");
        System.out.printf("%.2f", d2);
        System.out.println("\n");

         //Conversion con perdida de informacion de int a float

         int grande = 1234567890;
         float aprox = grande;
         System.out.println("Conversion de int --> float");
         System.out.println("Valor de grande: " + grande);
         System.out.println("Valor de aprox: " + aprox);

         //Calculamos la diferencia para comprobar la perdida (restando el mas grande por la aprox)
         System.out.println("La perdida es de: " + (grande - (int) aprox));
         System.out.println("\n");

        //Conversiones explícitas o casting

        //Conversion explícita de int --> short
        int i3 = 1234;
        short s3 = (short) i3;
        System.out.println("Conversion de int --> short");
        System.out.println("Valor de i3: " + i3);
        //Aquí no hay perdida porque el valor que hemos asignado cabe perfectamente en una variable de ese tipo
        System.out.println("Pasado a short: " + s3);
        System.out.println("\n");

        //Conversion explícita de double --> float
        double d3 = 123456.78565;
        float f3 = (float) d3;
        System.out.println("Conversion de double --> float");
        System.out.println("Valor d3: " + d3);
        System.out.println("Pasado a float: " + f3);
        

        final double PI = 3.1416;  //Variable constante no cambia su valor, el valor final es 39 no te puede cambiar

       //temp = 50; 


        




    }

}