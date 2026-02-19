package Tema2_Clases_Y_Objetos;
public class Test_EJ_C {

    public static void main(String[] args) {

   
        EJ_C producto = new EJ_C(
                "Laptop HP",
                18500.50,
                10,
                "Tienda Oficial Mercado Libre"
        );

        producto.ejecutar();
        producto.mostrarInfo();

        producto.setPrecio(17500.00);
        producto.setCantidadDisponible(8);

        System.out.println("\nDatos actualizados:");
        producto.mostrarInfo();
    }
}