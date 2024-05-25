public class Actividad {
    private String nombre;
    private String descripcion;
    private EstadoActividad estado;

    public Actividad(String nombre, String descripcion, EstadoActividad estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoActividad getEstado() {
        return estado;
    }

    public void setEstado(EstadoActividad estado) {
        this.estado = estado;
    }
}


