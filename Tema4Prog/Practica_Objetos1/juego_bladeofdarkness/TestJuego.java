package Tema4Prog.Practica_Objetos1.juego_bladeofdarkness;

public class TestJuego {

    public static void main(String[] args) {

        //Creamos nuestros Monstruos
        Monstruo m1 = new Monstruo("GHOST", Monstruo.ClaseM.FANTASMA, 10);
        Monstruo m2 = new Monstruo("XINO", Monstruo.ClaseM.GOBLIN, 15);
        Monstruo m3 = new Monstruo("CHUMI", Monstruo.ClaseM.DEMONIO, 30);
        Monstruo m4 = new Monstruo("DURIM", Monstruo.ClaseM.SKRALL, 100);

        //Creamos nuestro Jugador
        Jugador j1 = new Jugador("Nazgul");

        //Equipamos las armas al jugador
        j1.equipar(new Arma("SWORD OF LIGHT", Arma.Tipo.ESPADA,32,false));
        j1.equipar(new Arma("STELAR BOW", Arma.Tipo.ARCO,18,false));

        //Atacar al monstruo

        m2.setNivel(10);

        //Atacamos la primera vez
        System.out.println(j1.getNombre() + " está atacando a " + m2.getNombre());
        System.out.println(j1.getNombre() + " le ha echo " + (j1.getArmaIzquierda().getPuntosD() + j1.getArmaDerecha().getPuntosD()) + " daño");
        j1.golpear(m2);
        System.out.println("Al monstruo " + m2.getNombre() + " le queda " + m2.getSalud() + " de salud\n");


        //Atacamos la segunda vez
        System.out.println(j1.getNombre() + " está atacando a " + m2.getNombre());
        System.out.println(j1.getNombre() + " le ha echo " + (j1.getArmaIzquierda().getPuntosD() + j1.getArmaDerecha().getPuntosD()) + " daño");
        j1.golpear(m2);
        System.out.println("Al monstruo " + m2.getNombre() + " le queda " + m2.getSalud() + " de salud\n");


        //Atacar al jugador

        //Nos ataca el m4 por primera vez
        System.out.println(m4.getNombre() + " está atacando a " + j1.getNombre());
        System.out.println(m4.getNombre() + " le ha echo " + m4.getPuntosD() + " daño");
        m4.golpear(j1);
        System.out.println("Al jugador " + j1.getNombre() + " le queda " + j1.getSalud() + " de salud\n");

        j1.tomarPocion(50);
        System.out.println(j1.getNombre() + " se ha tomado una pocion de salud de 50. Total de salud: " + j1.getSalud() + "\n");


        //Nos ataca el m4 por segunda vez
        System.out.println(m4.getNombre() + " está atacando a " + j1.getNombre());
        System.out.println(m4.getNombre() + " le ha echo " + m4.getPuntosD() + " daño");
        m4.golpear(j1);
        System.out.println("Al jugador " + j1.getNombre() + " le queda " + j1.getSalud() + " de salud\n");

        //Nos ataca el m4 por tercera vez
        System.out.println(m4.getNombre() + " está atacando a " + j1.getNombre());
        System.out.println(m4.getNombre() + " le ha echo " + m4.getPuntosD() + " daño");
        m4.golpear(j1);
        System.out.println("Al jugador " + j1.getNombre() + " le queda " + j1.getSalud() + " de salud\n");


    }
}
