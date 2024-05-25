public class ComponenteSanguineo {
    private String tipo;
    private double volumen;
    private String condicionesAlmacenamiento;

    public ComponenteSanguineo(String tipo, double volumen, String condicionesAlmacenamiento) {
        this.tipo = tipo;
        this.volumen = volumen;
        this.condicionesAlmacenamiento = condicionesAlmacenamiento;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getCondicionesAlmacenamiento() {
        return condicionesAlmacenamiento;
    }

    public void setCondicionesAlmacenamiento(String condicionesAlmacenamiento) {
        this.condicionesAlmacenamiento = condicionesAlmacenamiento;
    }
}
