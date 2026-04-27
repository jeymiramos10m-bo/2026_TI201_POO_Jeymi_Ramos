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

public class Carrito {

    private Object[] lista = new Object[20];
    private int cont = 0;
    private double total = 0;

    public void agregar(Object obj, double precio) {
        lista[cont++] = obj;
        total += precio;
    }

    public void verCarrito() {
        System.out.println("\n--- CARRITO ---");
        for (int i = 0; i < cont; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Total a pagar: $" + total);
    }
}
