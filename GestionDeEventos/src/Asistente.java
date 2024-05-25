public class Asistente {
    private String nombre;
    private String email;
    private String tipoRegistro;

    public Asistente(String nombre, String email, String tipoRegistro) {
        this.nombre = nombre;
        this.email = email;
        this.tipoRegistro = tipoRegistro;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
}
