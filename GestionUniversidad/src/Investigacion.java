public class Investigacion {
    private String titulo;
    private String descripcion;
    private String area;

    public Investigacion(String titulo, String descripcion, String area) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.area = area;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getArea() {
        return area;
    }
}

