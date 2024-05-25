import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    @Override
    public String toString() {
        return nombre + ": " + mano;
    }
}
