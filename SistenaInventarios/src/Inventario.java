import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void recibirMercancia(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setCantidad(producto.getCantidad() + cantidad);
                System.out.println("Se han recibido " + cantidad + " unidades de " + nombre);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void mostrarInventario() {
        System.out.println("Inventario Actual:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void seguimientoInventario() {
        System.out.println("Seguimiento del Inventario:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + ": " + producto.getCantidad() + " unidades");
        }
    }

    public void reabastecerInventario(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto.getCantidad() < 10) { // Punto de reordenamiento ficticio
                    producto.setCantidad(producto.getCantidad() + cantidad);
                    System.out.println("Se han reabastecido " + cantidad + " unidades de " + nombre);
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void controlCalidad() {
        System.out.println("Control de Calidad:");
        for (Producto producto : productos) {
            // Aquí se podrían agregar más criterios de calidad
            if (producto.getCantidad() <= 0) {
                System.out.println("Producto agotado: " + producto.getNombre());
            }
        }
    }

    public void gestionarObsoletos() {
        System.out.println("Gestión de Productos Obsoletos y Caducados:");
        for (Producto producto : productos) {
            // Simular la gestión de productos obsoletos
            if (producto.isObsoleto() || producto.getFechaVencimiento().compareTo("2023-12-31") < 0) {
                System.out.println("Producto obsoleto o caducado: " + producto.getNombre());
            }
        }
    }
}
