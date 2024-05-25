import java.util.ArrayList;
import java.util.List;
public class Cocina {
    private List<Ingrediente> inventario;

    public Cocina() {
        this.inventario = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        inventario.add(ingrediente);
    }

    public void prepararPlato(Plato plato) {
        System.out.println("Preparando plato: " + plato.getNombre());
        for (Ingrediente ingrediente : plato.getIngredientes()) {
            for (Ingrediente inv : inventario) {
                if (inv.getNombre().equals(ingrediente.getNombre())) {
                    if (inv.getCantidad() >= ingrediente.getCantidad()) {
                        inv.reducirCantidad(ingrediente.getCantidad());
                        System.out.println("Usado: " + ingrediente.getCantidad() + " de " + ingrediente.getNombre());
                    } else {
                        System.out.println("No hay suficiente " + ingrediente.getNombre());
                    }
                }
            }
        }
        System.out.println("Plato preparado: " + plato.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("Inventario de cocina:");
        for (Ingrediente ingrediente : inventario) {
            System.out.println(ingrediente);
        }
    }
}

