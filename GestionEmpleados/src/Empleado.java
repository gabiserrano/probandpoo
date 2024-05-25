public class Empleado {
    private String nombre;
    private String puesto;
    private boolean contratado;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.contratado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void contratar() {
        this.contratado = true;
    }

    public void desvincular() {
        this.contratado = false;
    }
}

