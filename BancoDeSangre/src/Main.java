import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de donante
        Donante donante1 = new Donante("Juan Pérez", 30, true, true);

        // Crear instancia de sangre recolectada
        Sangre sangre1 = new Sangre("O+", true, true);

        // Crear instancia de componente sanguíneo
        ComponenteSanguineo componente1 = new ComponenteSanguineo("Glóbulos Rojos", 250.0, "Temperatura controlada");

        // Crear registro de transfusión
        RegistroTransfusion registro1 = new RegistroTransfusion("María Gómez", "AB-", LocalDate.of(2024, 5, 20), "Hospital Central");

        // Mostrar información básica
        System.out.println("Información del donante:");
        System.out.println("Nombre: " + donante1.getNombre());
        System.out.println("Edad: " + donante1.getEdad());
        System.out.println("Saludable: " + donante1.isSaludable());
        System.out.println("Elegible: " + donante1.isElegible());

        System.out.println("\nInformación de la sangre recolectada:");
        System.out.println("Tipo: " + sangre1.getTipo());
        System.out.println("Compatible: " + sangre1.isCompatible());
        System.out.println("Segura: " + sangre1.isSegura());

        System.out.println("\nInformación del componente sanguíneo:");
        System.out.println("Tipo: " + componente1.getTipo());
        System.out.println("Volumen: " + componente1.getVolumen() + " ml");
        System.out.println("Condiciones de almacenamiento: " + componente1.getCondicionesAlmacenamiento());

        System.out.println("\nRegistro de transfusión realizado:");
        System.out.println("Paciente: " + registro1.getPaciente());
        System.out.println("Tipo de sangre: " + registro1.getTipoSangre());
        System.out.println("Fecha: " + registro1.getFecha());
        System.out.println("Hospital: " + registro1.getHospital());
    }
}
