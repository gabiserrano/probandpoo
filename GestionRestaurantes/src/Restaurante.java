import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private Cocina cocina;
    private List<Proveedor> proveedores;

    public Restaurante() {
        this.cocina = new Cocina();
        this.proveedores = new ArrayList<>();
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void abastecerCocina() {
        for (Proveedor proveedor : proveedores) {
            for (Ingrediente ingrediente : proveedor.getIngredientes()) {
                cocina.agregarIngrediente(ingrediente);
            }
        }
    }

    public void prepararPlato(Plato plato) {
        cocina.prepararPlato(plato);
    }

    public void mostrarInventarioCocina() {
        cocina.mostrarInventario();
    }

    @Override
    public String toString() {
        return "Restaurante [cocina=" + cocina + ", proveedores=" + proveedores + "]";
    }
}

