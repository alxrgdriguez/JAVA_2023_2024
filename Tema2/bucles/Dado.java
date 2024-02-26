package bucles;
class Dado {

    public static void main(String[] args) {
        
        //Simula lanzar dos dados por teclado y repitelo hasta que salga el mismo número en los dos.Muestra el numero de intentos

        int dado1 = 0, dado2 = 1, numIntentos = 0;

        while (dado1 != dado2){

            dado1 = (int)(Math.random() *6);
            System.out.println(dado1);
            dado2 = (int)(Math.random() * 6);
            System.out.println(dado2);
            numIntentos ++;
        }

        System.out.println("El numero de intentos ha sido de: " + numIntentos);



    }
    
}
