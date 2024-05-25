public class Cliente {
    private String nombre;
    private String documento;
    private String direccion;

    public Cliente(String nombre, String documento, String direccion) {
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getDireccion() {
        return direccion;
    }
}
