public class Semaforo {
    private int numero;
    private boolean estadoVerde;

    public Semaforo(int numero) {
        this.numero = numero;
        this.estadoVerde = false; // Inicialmente en rojo
    }

    public void cambiarEstado() {
        estadoVerde = !estadoVerde;
    }

    public boolean isVerde() {
        return estadoVerde;
    }

    public int getNumero() {
        return numero;
    }
}

