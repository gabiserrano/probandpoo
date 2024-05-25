import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de clases
        List<String> objetivos = Arrays.asList("Proporcionar una experiencia educativa única", "Fomentar la colaboración entre investigadores");
        List<String> recursosNecesarios = Arrays.asList("Espacio adecuado", "Equipo de audio y video", "Catering");
        Evento evento = new Evento("Conferencia de Tecnología 2024", "Evento anual de tecnología", LocalDate.of(2024, 10, 15),
                "Centro de Convenciones", 50000.0, objetivos, recursosNecesarios);

        Proveedor proveedor1 = new Proveedor("Centro de Convenciones", "Espacio para eventos", "contacto@convenciones.com");
        Proveedor proveedor2 = new Proveedor("Catering Deluxe", "Servicio de catering", "contacto@cateringdeluxe.com");

        List<Proveedor> proveedores = new ArrayList<>();
        proveedores.add(proveedor1);
        proveedores.add(proveedor2);

        List<Actividad> actividades = Arrays.asList(
                new Actividad("Conferencia principal", "Presentación de los últimos avances en inteligencia artificial", "10:00", "12:00"),
                new Actividad("Taller práctico de programación", "Sesión práctica de programación en Python", "13:00", "15:00")
        );

        List<Asistente> asistentes = Arrays.asList(
                new Asistente("Ana López", "ana@email.com", "VIP"),
                new Asistente("Pedro Martínez", "pedro@email.com", "Regular")
        );

        Promocion promocion = new Promocion("Campaña digital y presencial", "Folletos y banners", "Twitter, Facebook, LinkedIn");

        // Mostrar información básica del evento
        System.out.println("Información básica del evento:");
        System.out.println("Nombre: " + evento.getNombre());
        System.out.println("Descripción: " + evento.getDescripcion());
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Lugar: " + evento.getLugar());
        System.out.println("Presupuesto: $" + evento.getPresupuesto());
        System.out.println("Objetivos: ");
    }
}
