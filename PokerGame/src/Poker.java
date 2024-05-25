import java.util.ArrayList;
import java.util.List;

public class Poker {
    private List<Jugador> jugadores;
    private Mazo mazo;

    public Poker(String[] nombresJugadores) {
        mazo = new Mazo();
        jugadores = new ArrayList<>();

        for (String nombre : nombresJugadores) {
            jugadores.add(new Jugador(nombre));
        }
    }

    public void repartirCartas() {
        for (int i = 0; i < 5; i++) {
            for (Jugador jugador : jugadores) {
                jugador.recibirCarta(mazo.repartir());
            }
        }
    }

    public void mostrarManos() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}


