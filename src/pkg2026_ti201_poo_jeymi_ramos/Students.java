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
    

    static void showMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String controlNumber;
    private String name;
    private String career;
    private String gender;

    public Students() {
        this.name="";
        this.controlNumber="";
        this.career="";
        this.gender="";
    }

    public Students(String controlNumber, String name, String career, String gender) {
        this.controlNumber = controlNumber;
        this.name = name;
        this.career = career;
        this.gender = gender;
    }

    Students(String tI2024, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public String getName() {
        return name;
    }

    public String getCareer() {
        return career;
    }

    public String getGender() {
        return gender;
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
