import java.util.Scanner;

public class Blackjack {
    private JugadorBlackJack jugador;
    private JugadorBlackJack dealer;
    private Mazo mazo;

    public Blackjack(String[] nombresJugadores) {
        mazo = new Mazo();
        jugador = new JugadorBlackJack(nombresJugadores[0]);
        dealer = new JugadorBlackJack(nombresJugadores[1]);
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a jugar Blackjack!");

        repartirCartas();

        System.out.println(jugador);
        System.out.println("Dealer: [carta oculta, " + dealer.getMano().get(1) + "]");

        while (jugador.getPuntuacion() < 21) {
            System.out.print("¿Quieres otra carta? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                jugador.recibirCarta(mazo.repartir());
                System.out.println(jugador);
            } else {
                break;
            }
        }

        while (dealer.getPuntuacion() < 17) {
            dealer.recibirCarta(mazo.repartir());
        }

        System.out.println(dealer);

        determinarGanador();

        scanner.close();
    }

    private void repartirCartas() {
        jugador.recibirCarta(mazo.repartir());
        jugador.recibirCarta(mazo.repartir());
        dealer.recibirCarta(mazo.repartir());
        dealer.recibirCarta(mazo.repartir());
    }

    private void determinarGanador() {
        int puntuacionJugador = jugador.getPuntuacion();
        int puntuacionDealer = dealer.getPuntuacion();

        if (puntuacionJugador > 21) {
            System.out.println("¡Te pasaste! El dealer gana.");
        } else if (puntuacionDealer > 21) {
            System.out.println("¡El dealer se pasó! Tú ganas.");
        } else if (puntuacionJugador > puntuacionDealer) {
            System.out.println("¡Tú ganas!");
        } else if (puntuacionDealer > puntuacionJugador) {
            System.out.println("El dealer gana.");
        } else {
            System.out.println("Es un empate.");
        }
    }
}
