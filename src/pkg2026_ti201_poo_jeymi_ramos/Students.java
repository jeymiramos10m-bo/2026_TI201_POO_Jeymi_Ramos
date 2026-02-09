/*
 * 2026 ITESS-TICS
 * Periodo Enero Junio
 * Asignatura: Programacion Orientado a objetos
 * Docente: Francisco Javier Montecillo Puente
 * Descripcion: Tema 1. Entorno de desarrollo 
 *              1.2 Procesos de desarrollo de aplicacion 
 * Intento Programador: Jeymi Jimena Ramos Martínez
 * Fecha: 09 de febrero del 2026
 */
package pkg2026_ti201_poo_jeymi_ramos;
public class Students {
    private String controlNumber;
    private String name;
    private String career;
    private String gender;

    public Students() {
    }

    public Students(String controlNumber, String name, String career, String gender) {
        this.controlNumber = controlNumber;
        this.name = name;
        this.career = career;
        this.gender = gender;
    }
    

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    

    @Override
    public String toString() {
        return "Students{" + "controlNumber=" + controlNumber + ", name=" + name + ", career=" + career + ", gender=" + gender + '}';
    }
    
    
}
