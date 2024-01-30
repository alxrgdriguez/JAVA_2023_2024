package Tema5Prog.ejemploArrayList;

public class TestTienda {

    public static void main(String[] args) {

        Producto producto1 = new Producto("portatil",550);
        Producto producto2 = new Producto("movil",237);
        Producto producto3 = new Producto("monitor",199);

        Tienda tienda1 = new Tienda("Coolmod");

        tienda1.addProducto(producto1);
        tienda1.addProducto(producto2);
        tienda1.addProducto(producto3);

        System.out.println(tienda1);

        //ArrayList foreach
        for (Producto producto : tienda1.getProductos()) {
            System.out.println("Articulos Coolmod");
            System.out.println(producto.getNombre() + " " + producto.getPrecio() + "€");
        }


    }
}
