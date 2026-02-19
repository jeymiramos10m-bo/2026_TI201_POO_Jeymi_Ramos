package Tema2_Clases_Y_Objetos;

public class Panaderia {

    private String nombre;
    private double precioPan;
    private int panesVendidos;

    // Constructor
    public Panaderia(String nombre, double precioPan) {
        this.nombre = nombre;
        this.precioPan = precioPan;
        this.panesVendidos = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioPan() {
        return precioPan;
    }

    public int getPanesVendidos() {
        return panesVendidos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioPan(double precioPan) {
        this.precioPan = precioPan;
    }

    public void setPanesVendidos(int panesVendidos) {
        this.panesVendidos = panesVendidos;
    }

    // Método para vender pan
    public void venderPan(int cantidad) {
        panesVendidos += cantidad;
    }

    // Método para calcular la ganancia
    public double calcularGanancia() {
        return panesVendidos * precioPan;
    }

    // Override de toString para mostrar la información
    @Override
    public String toString() {
        return "Panaderia: " + nombre +
                "\nPrecio Pan: $" + precioPan +
                "\nPanes vendidos: " + panesVendidos +
                "\nGanancia: $" + calcularGanancia();
    }
}