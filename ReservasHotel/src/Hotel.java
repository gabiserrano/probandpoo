import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void hacerReserva(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        Reserva reserva = new Reserva(cliente, habitacion, fechaInicio, fechaFin);
        reservas.add(reserva);
        habitacion.setDisponible(false);
    }

    public Habitacion getHabitacionPorNumero(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null; // Retorna null si no se encuentra la habitación con el número especificado
    }

    public void mostrarEstadoHabitaciones() {
        System.out.println("Estado actual de las habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            String estado = habitacion.isDisponible() ? "Disponible" : "Ocupada";
            System.out.println("Habitación #" + habitacion.getNumero() + " - Tipo: " + habitacion.getTipo() + " - Estado: " + estado);
        }
    }

    // Otros métodos según las necesidades del hotel (gestión de reservas, servicios, etc.)
}


