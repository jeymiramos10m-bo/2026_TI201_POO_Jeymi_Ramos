/*
 * 2026 ITESS-TICS
 * Periodo Enero Junio
 * Asignatura: Programacion Orientado a objetos
 * Docente: Francisco Javier Montecillo Puente
 * Descripcion: Tema 1. Entorno de desarrollo 
 *              1.2 Procesos de desarrollo de aplicacion 
 * Intento Programador: Jeymi Jimena Ramos Martínez
 * Fecha: 17 de febrero del 2026
 */
package Tema2_Clases_Y_Objetos;
public class TestMercadoLibre {

    public static void main(String[] args) {

        // Crear objeto (POO)
        MercadoLibre carrito = new MercadoLibre("001", "Laptop");

        // Mostrar objeto
        System.out.println(carrito);

        // Modificar productos
        carrito.setProductos("Laptop, Mouse");

        // Mostrar productos actualizados
        System.out.println("Productos: " + carrito.getProductos());
    }
}