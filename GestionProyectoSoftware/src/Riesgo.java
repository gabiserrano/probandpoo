public class Riesgo {
    private String nombre;
    private String nivel;
    private String descripcion;

    public Riesgo(String nombre, String nivel, String descripcion) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }
}


