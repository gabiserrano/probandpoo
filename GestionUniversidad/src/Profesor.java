public class Profesor {
    private String nombre;
    private String especialidad;
    private String departamento;

    public Profesor(String nombre, String especialidad, String departamento) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }
}

