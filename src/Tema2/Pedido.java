
package Tema2;

public class Pedido {
    private Usuario usuario;
    private Tortas torta;

    // Constructor
    public Pedido(Usuario usuario, Tortas torta) {
        this.usuario = usuario;
        this.torta = torta;
    }

    // Métodos

    public String getNombreDeUsuario() {
        return usuario.getNombre(); // asumiendo que Usuario tiene getNombre()
    }

    public String getNombreDeTorta() {
        return torta.getNombre(); 
    }

    public float getPrecio() {
        return torta.getPrecio(); 
    }
}