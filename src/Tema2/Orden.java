
package Tema2;
    public class Orden {

    private Pedido pedido;
    private int prioridad;
    private boolean pago;
    private String estatus;

   
    public Orden(Pedido pedido, int prioridad, boolean pago, String estatus) {
        this.pedido = pedido;
        this.prioridad = prioridad;
        this.pago = pago;
        this.estatus = estatus;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad < 0) {
            throw new IllegalArgumentException("La prioridad no puede ser negativa");
        }
        this.prioridad = prioridad;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        if (estatus == null || estatus.isEmpty()) {
            throw new IllegalArgumentException("Estatus inválido");
        }
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "usuario=" + pedido.getNombreDeUsuario() +
                ", torta=" + pedido.getNombreDeTorta() +
                ", precio=" + pedido.getPrecio() +
                ", prioridad=" + prioridad +
                ", pago=" + pago +
                ", estatus='" + estatus + '\'' +
                '}';
    }
}