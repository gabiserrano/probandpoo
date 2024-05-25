import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Agregar habitaciones al hotel
        hotel.agregarHabitacion(new Habitacion(101, "Individual"));
        hotel.agregarHabitacion(new Habitacion(102, "Doble"));
        hotel.agregarHabitacion(new Habitacion(103, "Suite"));

        // Mostrar estado inicial de las habitaciones
        System.out.println("Estado inicial de las habitaciones:");
        hotel.mostrarEstadoHabitaciones();
        System.out.println("--------------------------------------");

        // Ejemplo de reserva
        Cliente cliente1 = new Cliente("Juan Perez", "12345678", "Av. Principal 123");
        Habitacion habitacion1 = hotel.getHabitacionPorNumero(101); // Implementar este método en la clase Hotel
        hotel.hacerReserva(cliente1, habitacion1, LocalDate.now(), LocalDate.now().plusDays(3));

        // Mostrar estado de las habitaciones después de la reserva
        System.out.println("\nEstado de las habitaciones después de una reserva:");
        hotel.mostrarEstadoHabitaciones();
    }
}
