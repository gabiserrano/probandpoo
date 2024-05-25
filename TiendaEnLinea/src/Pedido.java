import java.util.List;
public class Pedido {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(List<Producto> productos, Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }
        this.productos = productos;
        this.cliente = cliente;
        this.estado = "Procesando";
    }

    public void procesarPedido() {
        for (Producto producto : productos) {
            producto.reducirStock(1);
        }
        this.estado = "Procesado";
        System.out.println("Pedido procesado para " + cliente.getNombre());
    }

    public void mostrarPedido() {
        System.out.println("Pedido de " + cliente.getNombre() + " - Estado: " + estado);
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getEstado() {
        return estado;
    }
}


