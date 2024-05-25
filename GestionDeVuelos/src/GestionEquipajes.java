import java.util.ArrayList;
import java.util.List;

public class GestionEquipajes {
    private List<String> equipajes;

    public GestionEquipajes() {
        equipajes = new ArrayList<>();
    }

    public void registrarEquipaje(String codigoEquipaje) {
        equipajes.add(codigoEquipaje);
        System.out.println("Equipaje registrado: " + codigoEquipaje);
    }

    public void mostrarEquipajes() {
        System.out.println("Equipajes registrados:");
        for (String equipaje : equipajes) {
            System.out.println("Equipaje: " + equipaje);
        }
    }
}
