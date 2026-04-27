/*
    Instituto Tecnológico Superior de Salvatierra
    Semestre Enero Junio 2026
    Materia: Programación Orientada a Objetos 
    Profesor: Dr. Francisco Javier Montecillo Puente  
    TI-201
    Tema2 Clases y objetos
    Jeymi Jimena Ramos Martínez
 */
package Tema2_Tienda_Whareber;

package Tema2_Tienda_Whareber;

public class Camisa {
    private String tipo;
    private double precio;

    public Camisa(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Camisa [" + tipo + " $" + precio + "]";
    }

    public static Camisa menuCamisa() {
        FastReader fr = new FastReader();
        char op;

        do {
            System.out.println("\n--- MENU CAMISAS ---");
            System.out.println("a) Casual $250");
            System.out.println("b) Formal $300");
            System.out.println("c) Deportiva $200");
            System.out.println("x) Volver");

            op = fr.nextChar();

            switch (op) {
                case 'a': return new Camisa("Casual", 250);
                case 'b': return new Camisa("Formal", 300);
                case 'c': return new Camisa("Deportiva", 200);
                case 'x': return null;
                default: System.out.println("Opcion invalida");
            }
        } while (true);
    }
}