package Tema2_Clases_Y_Objetos;

public class EJ_C {

    // Atributos
    private String titulo;
    private double precio;
    private int cantidadDisponible;
    private String vendedor;

    // Constructor
    public EJ_C(String titulo, double precio, int cantidadDisponible, String vendedor) {
        this.titulo = titulo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.vendedor = vendedor;
    }

    // Métodos getter y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    // Método de acción
    public void ejecutar() {
        System.out.println("Ejercicio C");
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Producto: " + titulo);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Vendedor: " + vendedor);
    }
}