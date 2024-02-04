package Tema5Prog.Practica_Objetos2.juego_bladeofdarkness_2;

public class MonstruoFinalNivel extends Monstruo {

    //Propiedades
    private int golpeEspecial;
    private int usosGolpeEspecial;

    //Constructor
    public MonstruoFinalNivel(String nombre, ClaseM clasem, int puntosD) {
        super(nombre, clasem, puntosD);
        this.golpeEspecial = puntosD;
        this.usosGolpeEspecial = 3;
    }

    //Getters and Setters

    public int getGolpeEspecial() {
        return golpeEspecial;
    }

    public void setGolpeEspecial(int golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    public int getUsosGolpeEspecial() {
        return usosGolpeEspecial;
    }

    public void setUsosGolpeEspecial(int usosGolpeEspecial) {
        this.usosGolpeEspecial = usosGolpeEspecial;
    }

    //Sobrescritura del método golpear
    @Override
    public void golpear(Personaje personaje) {
        if(this.usosGolpeEspecial > 0) {
            super.golpear(personaje);
            personaje.reducirVida(this.golpeEspecial);
            this.usosGolpeEspecial--;
        }else {
            System.out.println("No le quedan usos de golpeEspecial a " + this.getNombre());
        }


    }

}
