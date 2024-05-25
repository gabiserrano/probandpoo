import java.time.LocalDate;
import java.util.List;

public class PlanProyecto {
    private List<Actividad> actividades;
    private List<Recurso> recursos;
    private List<Riesgo> riesgos;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public PlanProyecto(List<Actividad> actividades, List<Recurso> recursos, List<Riesgo> riesgos, LocalDate fechaInicio, LocalDate fechaFin) {
        this.actividades = actividades;
        this.recursos = recursos;
        this.riesgos = riesgos;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public List<Riesgo> getRiesgos() {
        return riesgos;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
}

