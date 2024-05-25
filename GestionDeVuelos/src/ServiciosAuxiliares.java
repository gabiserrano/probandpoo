import java.util.ArrayList;
import java.util.List;

public class ServiciosAuxiliares {
    private List<String> servicios;

    public ServiciosAuxiliares() {
        servicios = new ArrayList<>();
    }

    public void agregarServicio(String servicio) {
        servicios.add(servicio);
        System.out.println("Servicio agregado: " + servicio);
    }

    public void mostrarServicios() {
        System.out.println("Servicios auxiliares disponibles:");
        for (String servicio : servicios) {
            System.out.println("Servicio: " + servicio);
        }
    }
}
