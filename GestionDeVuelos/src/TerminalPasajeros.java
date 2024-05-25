import java.util.ArrayList;
import java.util.List;

public class TerminalPasajeros {
    private List<Pasajero> pasajeros;

    public TerminalPasajeros() {
        pasajeros = new ArrayList<>();
    }

    public void checkIn(Pasajero pasajero, Vuelo vuelo) {
        pasajero.asignarVuelo(vuelo);
        pasajeros.add(pasajero);
        System.out.println("Check-in completo para " + pasajero.getNombre() + " en el vuelo " + vuelo.getNumeroVuelo());
    }

    public void mostrarPasajeros() {
        System.out.println("Pasajeros en la terminal:");
        for (Pasajero pasajero : pasajeros) {
            System.out.println(pasajero.getNombre() + " - Vuelo " + pasajero.getVuelo().getNumeroVuelo());
        }
    }
}

