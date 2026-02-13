/*
 * 2026 ITESS-TICS
 * Periodo Enero Junio
 * Asignatura: Programacion Orientado a objetos
 * Docente: Francisco Javier Montecillo Puente
 * Descripcion: Tema 1. Entorno de desarrollo 
 *              1.2 Procesos de desarrollo de aplicacion 
 * Intento Programador: Jeymi Jimena Ramos Martínez
 * Fecha: 10 de febrero del 2026
 */
package pkg2026_ti201_poo_jeymi_ramos;

/**
 *
 * @author Yeimy
 */
public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Prueva de constructor defaul");
        
        
         Students leer = new Students();
         System.out.println(leer.toString());
         leer = new Students("TI2024", "Juan", "Tics", "Hombre");
         System.out.println(leer.getCareer());
         
    }
    
}
