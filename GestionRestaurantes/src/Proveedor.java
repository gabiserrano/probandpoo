import java.util.List;
import java.util.ArrayList;
public class Proveedor {
    private String nombre;
    private List<Ingrediente> ingredientes;

    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Proveedor: " + nombre + ", Ingredientes: " + ingredientes;
    }
}

