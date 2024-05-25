import java.util.List;
import java.util.ArrayList;
public class Plato {
    private String nombre;
    private List<Ingrediente> ingredientes;

    public Plato(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Plato: " + nombre + ", Ingredientes: " + ingredientes;
    }
}

