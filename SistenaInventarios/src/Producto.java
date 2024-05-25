public class Producto {
    private String nombre;
    private int cantidad;
    private String fechaVencimiento;
    private boolean obsoleto;

    public Producto(String nombre, int cantidad, String fechaVencimiento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
        this.obsoleto = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean isObsoleto() {
        return obsoleto;
    }

    public void setObsoleto(boolean obsoleto) {
        this.obsoleto = obsoleto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", obsoleto=" + obsoleto +
                '}';
    }
}
