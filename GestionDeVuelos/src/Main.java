public class Main {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto();

        // Crear vuelos
        Vuelo vuelo1 = new Vuelo("AB123", "Madrid");
        Vuelo vuelo2 = new Vuelo("CD456", "Londres");

        // Crear pasajeros
        Pasajero pasajero1 = new Pasajero("John Doe", "A123456");
        Pasajero pasajero2 = new Pasajero("Jane Smith", "B789012");

        // Check-in de pasajeros
        aeropuerto.getTerminalPasajeros().checkIn(pasajero1, vuelo1);
        aeropuerto.getTerminalPasajeros().checkIn(pasajero2, vuelo2);

        // Mostrar pasajeros en la terminal
        aeropuerto.getTerminalPasajeros().mostrarPasajeros();
        System.out.println("-----");

        // Registrar equipajes
        aeropuerto.getGestionEquipajes().registrarEquipaje("EQ123");
        aeropuerto.getGestionEquipajes().registrarEquipaje("EQ456");

        // Mostrar equipajes registrados
        aeropuerto.getGestionEquipajes().mostrarEquipajes();
        System.out.println("-----");

        // Registrar cargamentos
        aeropuerto.getOperacionesCarga().registrarCargamento("CA123");
        aeropuerto.getOperacionesCarga().registrarCargamento("CA456");

        // Mostrar cargamentos registrados
        aeropuerto.getOperacionesCarga().mostrarCargamentos();
        System.out.println("-----");

        // Agregar servicios auxiliares
        aeropuerto.getServiciosAuxiliares().agregarServicio("WiFi");
        aeropuerto.getServiciosAuxiliares().agregarServicio("Restaurante");

        // Mostrar servicios auxiliares disponibles
        aeropuerto.getServiciosAuxiliares().mostrarServicios();
    }
}
