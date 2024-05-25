import java.util.ArrayList;
import java.util.List;

public class TiendaEnLinea {
    private List<Producto> catalogo;

    public TiendaEnLinea() {
        catalogo = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        catalogo.add(producto);
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de productos:");
        for (Producto producto : catalogo) {
            System.out.println(producto);
        }
    }

    public List<Producto> getCatalogo() {
        return catalogo;
    }
}

