import java.util.HashMap;
import java.util.Map;

public class InformacionTrafico {
    private Map<String, Integer> traficoPorZona; // Para mantener el registro de tráfico por zona

    public InformacionTrafico() {
        this.traficoPorZona = new HashMap<>();
    }

    public void registrarTrafico(String zona, int cantidad) {
        if (traficoPorZona.containsKey(zona)) {
            int traficoActual = traficoPorZona.get(zona);
            traficoPorZona.put(zona, traficoActual + cantidad);
        } else {
            traficoPorZona.put(zona, cantidad);
        }
    }

    public int obtenerTraficoPorZona(String zona) {
        return traficoPorZona.getOrDefault(zona, 0);
    }

    public void limpiarRegistros() {
        traficoPorZona.clear();
    }

    // Otros métodos según las necesidades del sistema de gestión de tráfico
}

