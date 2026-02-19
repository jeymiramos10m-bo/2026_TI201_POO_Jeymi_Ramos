package Tema2_Clases_Y_Objetos;

public class RegistroAsignatura {

    private String idRegistro;
    private String nombreEstudiante;
    private String nombreAsignatura;
    private int creditos;

    // Constructor
    public RegistroAsignatura(String idRegistro, String nombreEstudiante,
                              String nombreAsignatura, int creditos) {
        this.idRegistro = idRegistro;
        this.nombreEstudiante = nombreEstudiante;
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
    }

    // Getters y Setters
    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    // Representación del objeto
    @Override
    public String toString() {
        return "RegistroAsignatura{" +
                "idRegistro='" + idRegistro + '\'' +
                ", nombreEstudiante='" + nombreEstudiante + '\'' +
                ", nombreAsignatura='" + nombreAsignatura + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}