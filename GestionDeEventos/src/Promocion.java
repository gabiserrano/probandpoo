public class Promocion {
    private String estrategia;
    private String materiales;
    private String redesSociales;

    public Promocion(String estrategia, String materiales, String redesSociales) {
        this.estrategia = estrategia;
        this.materiales = materiales;
        this.redesSociales = redesSociales;
    }

    // Getters y Setters
    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(String redesSociales) {
        this.redesSociales = redesSociales;
    }
}
