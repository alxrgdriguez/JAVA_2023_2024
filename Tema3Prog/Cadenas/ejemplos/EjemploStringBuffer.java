package Tema3Prog.Cadenas.ejemplos;

import java.util.Scanner;
public class EjemploStringBuffer {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        StringBuffer texto = new StringBuffer(); //Tamaño para reservar
        for(int i=0; i < 5; i++) {
            texto = texto.append(sc.nextLine()).append(" ");
        }

        System.out.println(texto);

       /*texto.insert(20, "xxxxxxx");
        System.out.println(texto);
        texto.delete(texto.indexOf("xx"), texto.indexOf("xx") + 7);
        System.out.println(texto);*/

    }
}