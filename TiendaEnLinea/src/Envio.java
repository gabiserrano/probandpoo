public class Envio {
    public void enviarPedido(Pedido pedido) {
        Cliente cliente = pedido.getCliente();
        if (cliente == null) {
            System.out.println("Error: El pedido no tiene un cliente asignado.");
            return;
        }
        String direccion = cliente.getDireccion();
        System.out.println("Enviando pedido a " + cliente.getNombre() + " en " + direccion);
    }
}


