package Tema6Prog.PracticaEvaluable;

public class Main {

    public static void main(String[] args) {

        //Añadimos tres productosFragil
       ProductoFragil pf1 = new ProductoFragil("Fragil 1", 100, ProductoFragil.NivelProducto.fragil);
       ProductoFragil pf2 = new ProductoFragil("muyFragil 2", 200, ProductoFragil.NivelProducto.muyfragil);
       ProductoFragil pf3 = new ProductoFragil("Fragil 3", 300, ProductoFragil.NivelProducto.fragil);

        //Añadimos tres productosRefrigerados
       ProductoRefrigerado ref1 = new ProductoRefrigerado("Refrigerado 1", 200, ProductoRefrigerado.NivelRefigerado.isotermica);
       ProductoRefrigerado ref2 = new ProductoRefrigerado("Refrigerado 2", 300, ProductoRefrigerado.NivelRefigerado.frigorifica);
       ProductoRefrigerado ref3 = new ProductoRefrigerado("Refrigerado 3", 400, ProductoRefrigerado.NivelRefigerado.isotermica);

       //Creamos el primer envio
       Envio e1 = new Envio();

       //Agregamos productos a la lista de envios

        e1.agregarTransportable(pf1);
        e1.agregarTransportable(pf2);
        e1.agregarTransportable(pf3);

        //Creamos el segundo envio
        Envio e2 = new Envio();

        //Agregamos productos a la lista de envios

        e2.agregarTransportable(ref1);
        e2.agregarTransportable(ref2);
        e2.agregarTransportable(ref3);

        //Asignar fecha de llegada para el segundo envio
        e2.setFechaLlegada(e1.getFechaLlegada());


        //Agregue los envios a un servicio envios
        ServicioEnvio servicioEnvios = new ServicioEnvio();
        servicioEnvios.agregarEnvio(e1);
        servicioEnvios.agregarEnvio(e2);
        servicioEnvios.generarInformeEnvios();

        //Asignar fecha de salida para el primer envio
        e1.setFechaSalida(e2.getFechaLlegada());

        //Genere e imprimimos los envios










    }


}
