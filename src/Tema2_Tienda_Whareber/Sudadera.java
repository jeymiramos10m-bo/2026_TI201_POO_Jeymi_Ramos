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

public class Sudadera {

    private String tipo;
    private double precio;

    public Sudadera(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Sudadera [" + tipo + " $" + precio + "]";
    }

    public static Sudadera menuSudadera() {
        FastReader fr = new FastReader();
        char op;

        do {
            System.out.println("\n--- MENU SUDADERAS ---");
            System.out.println("a) Con gorra $450");
            System.out.println("b) Sin gorra $400");
            System.out.println("c) Oversize $480");
            System.out.println("x) Volver");

            op = fr.nextChar();

            switch (op) {
                case 'a':
                    return new Sudadera("Con gorra", 450);
                case 'b':
                    return new Sudadera("Sin gorra", 400);
                case 'c':
                    return new Sudadera("Oversize", 480);
                case 'x':
                    return null;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (true);
    }
}
