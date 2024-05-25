import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creación de stakeholders
        Stakeholder cliente = new Stakeholder("Cliente", "Cliente principal");
        Stakeholder equipoDesarrollo = new Stakeholder("Equipo de desarrollo", "Equipo técnico");

        // Creación de requisitos
        Requisito req1 = new Requisito("Requisito funcional 1", true);
        Requisito req2 = new Requisito("Requisito funcional 2", true);
        Requisito req3 = new Requisito("Requisito no funcional 1", false);

        List<Requisito> requisitos = new ArrayList<>();
        requisitos.add(req1);
        requisitos.add(req2);
        requisitos.add(req3);

        // Creación del plan del proyecto
        LocalDate fechaInicio = LocalDate.of(2024, 5, 1);
        LocalDate fechaFin = LocalDate.of(2024, 10, 31);

        List<Actividad> actividades = new ArrayList<>();
        actividades.add(new Actividad("Análisis de requisitos", "Analizar y documentar los requisitos del sistema", EstadoActividad.COMPLETADA));
        actividades.add(new Actividad("Diseño de arquitectura", "Definir la estructura y componentes del sistema", EstadoActividad.EN_PROGRESO));
        actividades.add(new Actividad("Desarrollo de código", "Implementar las funcionalidades según los requisitos", EstadoActividad.PENDIENTE));

        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Desarrolladores", "Recursos humanos", 5));
        recursos.add(new Recurso("Servidores", "Recursos tecnológicos", 3));

        List<Riesgo> riesgos = new ArrayList<>();
        riesgos.add(new Riesgo("Riesgo de cambio en los requisitos", "Alto", "Realizar reuniones periódicas con el cliente para validar requisitos"));
        riesgos.add(new Riesgo("Riesgo de falta de recursos", "Medio", "Monitorizar el uso de recursos y planificar adecuadamente"));

        PlanProyecto planProyecto = new PlanProyecto(actividades, recursos, riesgos, fechaInicio, fechaFin);

        // Creación del proyecto de software
        ProyectoSoftware proyecto = new ProyectoSoftware("Sistema de gestión empresarial", "Desarrollar un software para gestión de empresas", cliente, requisitos, planProyecto);

        // Simulación de ejecución del proyecto
        System.out.println("### Ejecución del proyecto ###");

        // Ejecución de actividades
        for (Actividad actividad : planProyecto.getActividades()) {
            System.out.println("Realizando actividad: " + actividad.getNombre());
            actividad.setEstado(EstadoActividad.EN_PROGRESO);
            System.out.println("Estado actual: " + actividad.getEstado());
        }

        // Simulación de seguimiento y control del proyecto
        System.out.println("\n### Seguimiento y control del proyecto ###");

        // Verificación de avance de actividades
        for (Actividad actividad : planProyecto.getActividades()) {
            if (actividad.getEstado() == EstadoActividad.EN_PROGRESO) {
                System.out.println("Actividad en progreso: " + actividad.getNombre());
                // Podrías implementar aquí la lógica para monitorear el avance
            }
        }

        // Gestión de riesgos
        System.out.println("\n### Gestión de riesgos ###");
        for (Riesgo riesgo : planProyecto.getRiesgos()) {
            System.out.println("Riesgo: " + riesgo.getDescripcion());
            // Podrías implementar aquí la lógica para gestionar los riesgos identificados
        }

        // Cierre del proyecto
        System.out.println("\n### Cierre del proyecto ###");
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isAfter(planProyecto.getFechaFin())) {
            System.out.println("El proyecto ha finalizado según lo planificado.");
            // Aquí podrías implementar las acciones finales de entrega, evaluación, etc.
        } else {
            System.out.println("El proyecto aún está en curso.");
            // Aquí podrías implementar las acciones si el proyecto no ha finalizado según lo planificado
        }
    }
}


