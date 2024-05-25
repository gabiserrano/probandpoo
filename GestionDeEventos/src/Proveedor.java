public class Proveedor {
    private String nombre;
    private String tipoServicio;
    private String contacto;

    public Proveedor(String nombre, String tipoServicio, String contacto) {
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.contacto = contacto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
