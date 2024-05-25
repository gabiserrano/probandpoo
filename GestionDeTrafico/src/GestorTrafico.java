import java.util.ArrayList;
import java.util.List;

public class GestorTrafico {
    private List<Semaforo> semaforos;

    public GestorTrafico() {
        this.semaforos = new ArrayList<>();
    }

    public void agregarSemaforo(Semaforo semaforo) {
        semaforos.add(semaforo);
    }

    public void monitorearTrafico() {
        System.out.println("Estado actual de los semáforos:");
        for (Semaforo semaforo : semaforos) {
            int numero = semaforo.getNumero();
            String estado = semaforo.isVerde() ? "Verde" : "Rojo";
            System.out.println("Semaforo #" + numero + " - Estado: " + estado);
        }
    }

    // Otros métodos según las necesidades del gestor de tráfico
}

