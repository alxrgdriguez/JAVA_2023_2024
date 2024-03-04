package Tema5Prog.McBurger.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Hamburguesa extends Comida {

    //Propiedades
    private LocalDate fechaCaducidad;

    //Constructor

    public Hamburguesa(String fechaCaducidad){

        //Manera 1
        //Recuperamos el dia de la cadena Y lo pasamos a entero
        /*int dia = Integer.parseInt(fechaCaducidad.substring(0,1));
        int mes = Integer.parseInt(fechaCaducidad.substring(3,4));
        int anio = Integer.parseInt(fechaCaducidad.substring(6,9));

        this.fechaCaducidad = LocalDate.of(anio,mes,dia);*/

        //Manera 2
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaCaducidad = LocalDate.parse(fechaCaducidad, formato);
        this.setNombre("Hamburguesa");
    }


    //Metodos
    @Override
    public double obtenerPrecio() {

        double precio = 3.5;
        LocalDate fechaActual = LocalDate.now();
        //Calcula la diferecia entre 2 fechas
        Period difereciaDias = Period.between(fechaActual, this.fechaCaducidad);
        switch (difereciaDias.getDays()){

            case 1:
                precio = precio * 0.5;
                break;

            case 2:
                precio = precio * 0.4;
                break;

            case 3:
                precio = precio * 0.3;
                break;

            case 4:
                precio = precio * 0.2;
                break;

        }
        return precio;
    }

    public void cocinar(){
        this.cocinado = true;
    }
}
