import java.util.ArrayList;
import java.util.List;

public class JugadorBlackJack {
    private String nombre;
    private List<Carta> mano;
    private int puntuacion;

    public JugadorBlackJack(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
        actualizarPuntuacion();
    }

    private void actualizarPuntuacion() {
        puntuacion = 0;
        int ases = 0;
        for (Carta carta : mano) {
            String valor = carta.getValor();
            if ("JQK".contains(valor)) {
                puntuacion += 10;
            } else if ("A".equals(valor)) {
                ases++;
                puntuacion += 11;
            } else {
                puntuacion += Integer.parseInt(valor);
            }
        }

        while (puntuacion > 21 && ases > 0) {
            puntuacion -= 10;
            ases--;
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + mano + " (Puntuación: " + puntuacion + ")";
    }
}
