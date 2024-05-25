import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

