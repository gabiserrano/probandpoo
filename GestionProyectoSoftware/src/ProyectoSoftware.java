import java.util.List;
public class ProyectoSoftware {
    private String nombre;
    private String descripcion;
    private Stakeholder stakeholder;
    private List<Requisito> requisitos;
    private PlanProyecto planProyecto;

    public ProyectoSoftware(String nombre, String descripcion, Stakeholder stakeholder, List<Requisito> requisitos, PlanProyecto planProyecto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stakeholder = stakeholder;
        this.requisitos = requisitos;
        this.planProyecto = planProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Stakeholder getStakeholder() {
        return stakeholder;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public PlanProyecto getPlanProyecto() {
        return planProyecto;
    }
}

