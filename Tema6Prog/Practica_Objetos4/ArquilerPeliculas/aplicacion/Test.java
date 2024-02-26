package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.aplicacion;

import Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades.*;

import java.util.Random;
import java.util.ArrayList;

public class Test {



    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {

        PrimeVideo pv = new PrimeVideo();



        //No son plus
        for (int i = 0; i < 170; i++){
            pv.addMultimedia(new Pelicula("Pelicula " + i, false, 8, 120));
        }


        //Son plus
        for (int i = 170; i < 200; i++){
            pv.addMultimedia(new Pelicula("Pelicula " + i, true, 10, 120));

        }


        //Generar 7500 clientes no pro

        for (int i = 0; i < 7500; i++){
            System.out.println(i);
            pv.addSuscriptores(new ClientePrime( "DNI" + i, "Cliente " + i, i +"@gmail.com"));
        }


        //Generar 2500 clientes pro
        for (int i = 7500; i < 10000; i++){
            System.out.println(i);
            pv.addSuscriptores(new ClientePrimePro("DNI" + i, "Cliente " + i, i +"@gmail.com"));
        }


        System.out.println(pv.getCatalogos().size());
        System.out.println(pv.getSuscriptores().size());

        //Simula que cada cliente vea las 40 primeras películas y dime las ganancias.
       for (int i = 0; i < pv.getSuscriptores().size(); i++){
           for (int j=0; j < 40; j++){
               pv.ver(pv.getCatalogos().get(numaleatorio(0,199)), pv.getSuscriptores().get(i));
           }
       }

       double gananciasAnteriores = pv.getGanancias();

        System.out.println("Hay una ganancia total de " + pv.getGanancias() + " € con las peliculas y las mensualidades");

       for (int i =0; i < 10; i++){
           Serie s =new Serie("Serie " + i, true, 10, Genero.generoPeli.TERROR);
            for (int j=0; j<10; j++){
                Temporada t = new Temporada(j);

                for (int k=0; k<10; k++){
                    Episodio e = new Episodio("Episodio " + i, "20 minutos");
                    t.addEpisodio(e);
                }
                s.addTemporada(t);
            }
            pv.getCatalogos().add(s);
       }



        //Simula que cada cliente vea las 5 series
        for (int i = 0; i < pv.getSuscriptores().size(); i++){
            for (int j=0; j < 5; j++){
                pv.ver(pv.getCatalogos().get(numaleatorio(200,209)), pv.getSuscriptores().get(i));
            }
        }

        System.out.println("Hay una ganancia total de " + (pv.getGanancias() - gananciasAnteriores) + " € con las series");

    }
}
