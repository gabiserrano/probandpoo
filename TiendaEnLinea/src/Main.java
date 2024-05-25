import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Camisa", 29.99, 100);
        Producto producto2 = new Producto("Pantalón", 49.99, 50);
        Producto producto3 = new Producto("Zapatos", 79.99, 30);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Perez", "Calle Falsa 123", "juan@example.com");
        Cliente cliente2 = new Cliente("Maria Lopez", "Avenida Siempreviva 456", "maria@example.com");

        // Separador visual
        System.out.println("---------------");

        // Crear un carrito de compras y agregar productos
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.mostrarProductos();

        // Separador visual
        System.out.println("---------------");

        // Crear un pedido para un cliente
        List<Producto> productosPedido = carrito.getProductos();
        Pedido pedido1 = new Pedido(productosPedido, cliente1);

        // Procesar y mostrar el pedido
        pedido1.procesarPedido();
        pedido1.mostrarPedido();

        // Separador visual
        System.out.println("---------------");

        // Enviar el pedido
        Envio envio = new Envio();
        envio.enviarPedido(pedido1);

        // Separador visual
        System.out.println("----------------");

        // Crear y mostrar una tienda en línea
        TiendaEnLinea tienda = new TiendaEnLinea();
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        tienda.mostrarCatalogo();
    }
}

