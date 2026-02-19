package Tema2_Clases_Y_Objetos;

public class Taqueria {

    private String nombre;
    private double precioTaco;
    private int tacosVendidos;

    // Constructor
    public Taqueria(String nombre, double precioTaco) {
        this.nombre = nombre;
        this.precioTaco = precioTaco;
        this.tacosVendidos = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioTaco() {
        return precioTaco;
    }

    public int getTacosVendidos() {
        return tacosVendidos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioTaco(double precioTaco) {
        this.precioTaco = precioTaco;
    }

    public void setTacosVendidos(int tacosVendidos) {
        this.tacosVendidos = tacosVendidos;
    }

    // Método para vender tacos
    public void venderTacos(int cantidad) {
        tacosVendidos += cantidad;
    }

    // Método para calcular ingresos
    public double calcularIngresos() {
        return tacosVendidos * precioTaco;
    }

    // Override de toString para mostrar la información
    @Override
    public String toString() {
        return "Taqueria: " + nombre +
                "\nPrecio Taco: $" + precioTaco +
                "\nTacos vendidos: " + tacosVendidos +
                "\nIngresos: $" + calcularIngresos();
    }
}