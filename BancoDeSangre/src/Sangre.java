public class Sangre {
    private String tipo;
    private boolean compatible;
    private boolean segura;

    public Sangre(String tipo, boolean compatible, boolean segura) {
        this.tipo = tipo;
        this.compatible = compatible;
        this.segura = segura;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isCompatible() {
        return compatible;
    }

    public void setCompatible(boolean compatible) {
        this.compatible = compatible;
    }

    public boolean isSegura() {
        return segura;
    }

    public void setSegura(boolean segura) {
        this.segura = segura;
    }
}
