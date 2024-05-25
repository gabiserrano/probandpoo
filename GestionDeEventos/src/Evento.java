import java.time.LocalDate;
import java.util.List;

public class Evento {
    private String nombre;
    private String descripcion;
    private LocalDate fecha;
    private String lugar;
    private double presupuesto;
    private List<String> objetivos;
    private List<String> recursosNecesarios;

    public Evento(String nombre, String descripcion, LocalDate fecha, String lugar, double presupuesto,
                  List<String> objetivos, List<String> recursosNecesarios) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.presupuesto = presupuesto;
        this.objetivos = objetivos;
        this.recursosNecesarios = recursosNecesarios;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<String> objetivos) {
        this.objetivos = objetivos;
    }

    public List<String> getRecursosNecesarios() {
        return recursosNecesarios;
    }

    public void setRecursosNecesarios(List<String> recursosNecesarios) {
        this.recursosNecesarios = recursosNecesarios;
    }
}
