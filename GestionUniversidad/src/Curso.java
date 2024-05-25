public class Curso {
    private String nombre;
    private String descripcion;
    private String codigo;
    private int creditos;

    public Curso(String nombre, String descripcion, String codigo, int creditos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }
}


