package Tema2_Clases_Y_Objetos;

public class MercadoLibre {

    private String idCarrito;
    private String productos;

    // Constructor vacío
    public MercadoLibre() {
        this.idCarrito = "";
        this.productos = "";
    }

    // Constructor con parámetros
    public MercadoLibre(String idCarrito, String productos) {
        this.idCarrito = idCarrito;
        this.productos = productos;
    }

    public String getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(String idCarrito) {
        this.idCarrito = idCarrito;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Carrito { IdCarrito = " + idCarrito +
               ", Productos = " + productos + " }";
    }
}