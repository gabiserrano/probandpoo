public class EventoEspecial {
    private String tipo;
    private String descripcion;

    public EventoEspecial(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Getters y setters (si son necesarios)

    @Override
    public String toString() {
        return "Evento especial tipo: " + tipo + ", descripción: " + descripcion;
    }
}
