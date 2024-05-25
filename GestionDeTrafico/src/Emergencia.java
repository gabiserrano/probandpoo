public class Emergencia {
    private String tipo;
    private String ubicacion;

    public Emergencia(String tipo, String ubicacion) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
    }

    // Getters y setters (si son necesarios)

    @Override
    public String toString() {
        return "Emergencia tipo: " + tipo + ", ubicación: " + ubicacion;
    }
}
