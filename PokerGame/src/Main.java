public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Alice", "Bob", "Charlie"};
        Poker juego = new Poker(nombres);
        juego.repartirCartas();
        juego.mostrarManos();
    }
}
