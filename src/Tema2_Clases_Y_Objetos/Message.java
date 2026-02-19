/*
 * 2026 ITESS-TICS
 * Periodo Enero Junio
 * Asignatura: Programacion Orientado a objetos
 * Docente: Francisco Javier Montecillo Puente
 * Descripcion: Tema 2. Clases y Objetos 
 *              2.1 definicion de una clas
                2.2 Declaracion de la clase => lenguaje Java
                2.3Miembros de una clase
 * Intento Programador: Jeymi Jimena Ramos Martínez
 * Fecha: 10 de febrero del 2026
 */
package Tema2_Clases_Y_Objetos;

public class Message{
    private String content;
    
    public Message(){
        this.content="";
    }
    public Message(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" + "content=" + content + '}';
    }

   
}