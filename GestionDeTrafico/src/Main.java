public class Main {
    public static void main(String[] args) {
        // Crear instancia de GestorTrafico
        GestorTrafico gestorTrafico = new GestorTrafico();

        // Crear algunos semáforos y agregarlos al gestor de tráfico
        Semaforo semaforo1 = new Semaforo(1);
        Semaforo semaforo2 = new Semaforo(2);
        Semaforo semaforo3 = new Semaforo(3);

        gestorTrafico.agregarSemaforo(semaforo1);
        gestorTrafico.agregarSemaforo(semaforo2);
        gestorTrafico.agregarSemaforo(semaforo3);

        // Monitorear el tráfico (simulación de cambio de estado)
        System.out.println("Estado inicial de los semáforos:");
        gestorTrafico.monitorearTrafico();
        System.out.println();

        // Cambiar estados de algunos semáforos para simular el funcionamiento
        semaforo1.cambiarEstado();
        semaforo3.cambiarEstado();
        System.out.println();

        // Volver a monitorear para ver los cambios
        System.out.println("Estado actualizado de los semáforos:");
        gestorTrafico.monitorearTrafico();
    }
}

