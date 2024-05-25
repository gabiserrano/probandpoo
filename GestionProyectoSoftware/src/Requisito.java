public class Requisito {
    private String nombre;
    private boolean esFuncional;

    public Requisito(String nombre, boolean esFuncional) {
        this.nombre = nombre;
        this.esFuncional = esFuncional;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esFuncional() {
        return esFuncional;
    }
}

