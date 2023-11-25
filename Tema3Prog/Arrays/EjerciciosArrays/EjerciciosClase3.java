package Tema3Prog.Arrays.EjerciciosArrays;

public class EjerciciosClase3 {

    
    public static String translate(String palabra){

        String trad = "";

        String palabrasEspaniol[] = {"Casa", "Movil", "Elegir", "Perro", "Gato", "Caballo", "Cocina","Uno","Dos","Tres","Cuatro","Cinco",
        "Seis", "Siete", "Ocho", "Nueve", "Diez", "Ordenador", "Disco","Hamster"};

        String palabrasIngles[] = {"House", "mobile", "Choose", "Dog", "Cat", "Hourse", "Kitchen","One","Two","Three","Four","Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Computer", "Disk","Hamster"};

        //Buscar palabra en Spanish 

        int posicion = -1;

        for(int i =0; i < palabrasEspaniol.length; i++){

            if(palabrasEspaniol[i].equals( palabra)){

                posicion = i;
                break;

            }

        }

        if (posicion == -1){

            return "Not Found";
            
            }else {

                return palabrasIngles[posicion];
            }

    }


    public static void main(String[] args) {
        

        /*3. Crea un array con 20 palabras en español. Crea otro array con los mismas palabras en ingles
         * Haz una FUNCIÓN que se le pase una palabra en ingles, y te devuelva la traducción en Español.
         */

        System.out.println(translate("Elegir"));

       




    }
    
}
