import java.util.ArrayList;
import java.util.List;

public class OperacionesCarga {
    private List<String> cargamentos;

    public OperacionesCarga() {
        cargamentos = new ArrayList<>();
    }

    public void registrarCargamento(String codigoCargamento) {
        cargamentos.add(codigoCargamento);
        System.out.println("Cargamento registrado: " + codigoCargamento);
    }

    public void mostrarCargamentos() {
        System.out.println("Cargamentos registrados:");
        for (String cargamento : cargamentos) {
            System.out.println("Cargamento: " + cargamento);
        }
    }
}
